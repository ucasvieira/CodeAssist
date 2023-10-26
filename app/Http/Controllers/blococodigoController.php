<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\ModuloBloco;
use App\Models\bloco;
use Illuminate\Support\Facades\Auth;

echo (Auth::id());
class BlococodigoController extends Controller
{
    public function criarModulo(Request $request)
    {
        $request->validate([
            'linguagem' => 'required|in:java,php,html,python,javascript,csharp,cpp,typescript,ruby,swift,kotlin',
        ]);

        $modulo = new ModuloBloco([
            'linguagem' => $request->input('linguagem'),
            'iduser' => Auth::id(),
        ]);

        $modulo->save();

        return redirect()->back()->with('success', 'Módulo criado com sucesso!');
    }

    public function listarModulos()
    {
        $modulos = ModuloBloco::where('iduser', Auth::id())->get();
        $semModulos = $modulos->isEmpty();

        return view('blococodigo')->with('modulos', $modulos)->with('semModulos', $semModulos);
    }

    public function criarBloco(Request $request)
    {
        $request->validate([
            'nome' => 'required|string',
            'linguagem' => 'required|in:java,php,html,python,javascript,etc',
        ]);

        $modulo = new bloco([
            'nome' => $request->input('nome'),
            'linguagem' => $request->input('linguagem'),
            'iduser' => Auth::id(),
        ]);

        $modulo->save();

        return redirect()->back()->with('success', 'Módulo criado com sucesso!');
    }

    public function listarBlocos()
    {
        $modulos = ModuloBloco::where('iduser', Auth::id())->get();
        $semModulos = $modulos->isEmpty();

        return view('blococodigo')->with('modulos', $modulos)->with('semModulos', $semModulos);
    }
}