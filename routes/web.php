<?php

use App\Http\Controllers\ProfileController;
use App\Http\Controllers\blococodigoController;
use App\Http\Controllers\materiaisController;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

Route::get('/', function () {
    return view('landpage');
});

Route::get('/dashboard', function () {
    return view('dashboard');
})->middleware(['auth', 'verified'])->name('dashboard');

Route::middleware('auth')->group(function () {
    Route::get('/profile', [ProfileController::class, 'edit'])->name('profile.edit');
    Route::patch('/profile', [ProfileController::class, 'update'])->name('profile.update');
    Route::delete('/profile', [ProfileController::class, 'destroy'])->name('profile.destroy');
    
});

Route::get('/pomodoro', function () {
    return view('pomodoro');
})->middleware(['auth', 'verified'])->name('pomodoro');

Route::get('/tarefa', function () {
    return view('tarefa');
})->middleware(['auth', 'verified'])->name('tarefa');
/* bloco de codigo*/
Route::get('/blococodigo', [blococodigoController::class, 'listarModulos'])->middleware(['auth', 'verified'])->name('blocodigo');
Route::post('/criar-modulo', [blococodigoController::class, 'criarModulo'])->name('criar_modulo');
Route::delete('/delete-modulo', [blococodigoController::class, 'deleteModulo'])->name('delete_modulo');
Route::delete('/delete-bloco', [blococodigoController::class, 'deletarBloco'])->name('delete_bloco');
Route::post('/criar-bloco', [blococodigoController::class, 'criarBloco'])->name('criar_bloco');
Route::put('/edit-bloco/{id}', [blococodigoController::class, 'editarBloco'])->name('edit_bloco');
Route::put('/editar-modulo/{id}', [blococodigoController::class, 'editarModulo'])->name('editar_modulo');

/*Arquivos */
Route::post('/adicionar-material', [materiaisController::class, 'criarMaterial'])->name('criar_material');
Route::delete('/deletar-material/{id}', [materiaisController::class, 'deletarMaterial'])->name('deletar_material');
Route::get('/baixar-arquivo/{id}', [materiaisController::class, 'baixarArquivo'])->name('baixar_arquivo');

/*links */
Route::post('/adicionar-link', [materiaisController::class, 'criarLink'])->name('criar_link');
Route::delete('/deletar-link/{id}', [materiaisController::class, 'deletarlink'])->name('deletar_link');




Route::get('/flashcard', function () {
    return view('flashcard');
})->middleware(['auth', 'verified'])->name('flashcard');

Route::get('/materiais',[materiaisController::class, 'listarMateriais'])->middleware(['auth', 'verified'])->name('materiais');

require __DIR__.'/auth.php';
