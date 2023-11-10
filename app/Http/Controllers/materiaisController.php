<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\material;
use App\Models\ModuloBloco;
use App\Models\bloco;
use Illuminate\Support\Facades\Auth;
use Illuminate\Support\Facades\Log;
use Illuminate\Support\Facades\Storage;
use Symfony\Component\Console\Input\Input;
use Illuminate\Support\Str;
use Illuminate\Support\Facades\Response;
use App\Models\links;

class materiaisController extends Controller
{
    /*arquivos*/
    public function criarMaterial(Request $request)
    {
        $request->validate([
            'arquivo' => 'required|file|max:51200',
            'nome' => 'required|string',
        ]);

        $user = Auth::user(); // Obtém o usuário autenticado
        $nomeArquivo = $request->input('nome');
        $tipoArquivo = $request->file('arquivo')->getClientOriginalExtension(); // Obtém a extensão do arquivo



        $caminhoArquivo = $request->file('arquivo')->store('materiais');

        // Cria um novo registro na tabela 'material'
        $material = new material([
            'iduser' => Auth::id(),
            'nome' => $nomeArquivo,
            'tipo' => $tipoArquivo,
            'path' => $caminhoArquivo,
        ]);

        $material->save();

        return redirect()->back()->with('success', 'Material criado com sucesso!');
    }
    public function listarMateriais()
    {
        $user = Auth::user();
        $materiais = material::where('iduser', Auth::id())->get();
        $links = links::where('iduser',Auth::id())->get();
        $modulos = ModuloBloco::where('iduser', Auth::id())->with('blocos')->get();

        return view('materiais')->with('materiais', $materiais)->with('links', $links)->with('modulos', $modulos);
    }

    public function deletarMaterial($id)
    {
        $material = material::findOrFail($id);
        Storage::delete($material->path); // Deleta o arquivo do armazenamento

        $material->delete();

        return redirect()->back()->with('success', 'Material deletado com sucesso!');
    }

    public function baixarArquivo($id)
    {
        $material = material::findOrFail($id);
        $pathToFile = public_path('storage/' . $material->path);

        return Response::download($pathToFile, $material->nome . '.' . $material->tipo);
    }

    /*links */

    public function criarLink(Request $request){
        $request->validate([
            'nome' => 'required|string',
            'url' => 'required|string',
        ]);

        $user = Auth::user(); // Obtém o usuário autenticado
        $nomelink = $request->input('nome');
        $url = $request->input('url');


        // Cria um novo registro na tabela 'material'
        $link = new links([
            'iduser' => Auth::id(),
            'nome' => $nomelink,
            'url' => $url,
            
        ]);

        $link->save();

        return redirect()->back()->with('success', 'Link criado com sucesso!');
    }
    public function deletarLink($id)
    {
        $link = links::findOrFail($id);
        

        $link->delete();

        return redirect()->back()->with('success', 'Material deletado com sucesso!');
    }
}
