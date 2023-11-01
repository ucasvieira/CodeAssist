<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\ModuloBloco;
use App\Models\bloco;
use Illuminate\Support\Facades\Auth;
use Illuminate\Support\Facades\Log;
use Symfony\Component\Console\Input\Input;

echo (Auth::id());
class BlococodigoController extends Controller
{
    public function criarModulo(Request $request)
    {
        $request->validate([
            'linguagem' => 'required|in:php,htmlmixed,python,javascript,css,xml,sql,texto',
        ]);

        $modulo = new ModuloBloco([
            'linguagem' => $request->input('linguagem'),
            'iduser' => Auth::id(),
        ]);

        $modulo->save();

        return redirect()->back()->with('success', 'Módulo criado com sucesso!');
    }
    public function deleteModulo(Request $request)
    {
        $idModulo = $request->input('id_modulo'); // Supondo que o ID do módulo seja passado via formulário ou parâmetro na rota.

        // Primeiro, você pode verificar se o módulo pertence ao usuário autenticado.
        $modulo = ModuloBloco::where('id', $idModulo)
            ->where('iduser', Auth::id())
            ->first();

        if (!$modulo) {
            return redirect()->back()->with('error', 'Módulo não encontrado ou não pertence ao usuário.');
        }

        // Em seguida, exclua todos os blocos associados ao módulo.
        bloco::where('idmodulo', $idModulo)->delete();

        // Agora, exclua o próprio módulo.
        $modulo->delete();

        return redirect()->back()->with('success', 'Módulo e blocos associados excluídos com sucesso!');
    }

    public function editarModulo(Request $request, $id)
    {
        $request->validate([
            'editlinguagem' => 'required|in:htmlmixed,css,javascript,python,php,sql,xml,texto',
        ]);

        $modulo = ModuloBloco::find($id);

        if (!$modulo) {
            return redirect()->back()->with('error', 'Módulo não encontrado.');
        }

        $modulo->linguagem = $request->input('editlinguagem');
        $modulo->save();

        return redirect()->back()->with('success', 'Módulo editado com sucesso!');
    }

    public function listarModulos()
    {
        $modulos = ModuloBloco::where('iduser', Auth::id())->with('blocos')->get();
        $semModulos = $modulos->isEmpty();

        return view('blococodigo')->with('modulos', $modulos)->with('semModulos', $semModulos);
    }

    public function criarBloco(Request $request)
    {
        try {
            $request->validate([
                'nome' => 'required|string',
                'idmodulo' => 'required|numeric|integer|min:0',
                'codigo' => 'nullable|string|max:10000',


            ]);

            $bloco = new bloco([
                'nome' => $request->input('nome'),
                'idmodulo' => $request->input('idmodulo'),
                'codigo' => $request->input('codigo'),

            ]);

            $bloco->save();

            return redirect()->back()->with('success', 'Bloco criado com sucesso!');
        } catch (\Exception $e) {
            Log::error('Erro ao criar bloco: ' . $e->getMessage());
            return redirect()->back()->with('error', 'Ocorreu um erro ao criar o bloco. Por favor, tente novamente.');
        }
    }
    public function editarBloco(Request $request, $id)
    {
        $request->validate([
            'editnome' => 'required|string',
            'editcodigo' => 'nullable|string|max:10000',
        ]);

        $bloco = bloco::find($id);

        if (!$bloco) {
            return redirect()->back()->with('error', 'Bloco não encontrado.');
        }

        // Verificar se o usuário autenticado é o proprietário do módulo associado a este bloco
        $modulo = ModuloBloco::find($bloco->idmodulo);

        if ($modulo->iduser !== Auth::id()) {
            return redirect()->back()->with('error', 'Você não tem permissão para editar este bloco.');
        }

        $bloco->nome = $request->input('editnome');
        $bloco->codigo = $request->input('editcodigo');
        $bloco->save();

        return redirect()->back()->with('success', 'Bloco editado com sucesso!');
    }

    public function deletarBloco(Request $request)
    {
        $idbloco = $request->input('id_bloco');

        // Encontre o bloco para verificar a propriedade do usuário
        $bloco = bloco::find($idbloco);

        if (!$bloco) {
            return redirect()->back()->with('error', 'Bloco não encontrado.');
        }

        // Verificar se o usuário autenticado é o proprietário do módulo associado a este bloco
        $modulo = ModuloBloco::find($bloco->idmodulo);

        if ($modulo->iduser !== Auth::id()) {
            return redirect()->back()->with('error', 'Você não tem permissão para excluir este bloco.');
        }

        // Agora, exclua o próprio bloco.
        $bloco->delete();

        return redirect()->back()->with('success', 'Bloco excluído com sucesso!');
    }
}
