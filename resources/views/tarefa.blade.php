<x-app-layout>
    <div class="preloader">
        <span></span>
    </div>
    <div class="h-[76vh] w-screen white">
    <h1 style="text-align: center; margin-top: 10px; font-size: 50px; margin-bottom: -40px;" id="titlelistpage">Listas de <span>Tarefas<span></h1>
        <div class="container-lists">
            <div class="containertarefa">
                <h2 class="list-title" id="dynamic-title">Lista de Tarefas 1</h2>
                <div class="title-container">
                    <input class="input-title" placeholder="Insira o título da lista de tarefas..." maxlength="30">
                    <button class="button-set-title">Definir Título</button>
                </div>
                <input class="input-task" placeholder="O que tenho que fazer..." maxlength="36">
                <button class="button-add-task">Adicionar</button>

                <ul class="list-tasks">

                </ul>
            </div>

            <div class="containertarefa">
            <h2 class="list-title2" id="dynamic-title2">Lista de Tarefas 2</h2>
                <div class="title-container2">
                    <input class="input-title2" placeholder="Insira o título da lista de tarefas..." maxlength="30">
                    <button class="button-set-title2">Definir Título</button>
                </div>
                <input class="input-task2" placeholder="O que tenho que fazer..." maxlength="36">
                <button class="button-add-task2">Adicionar</button>

                <ul class="list-tasks2">

                </ul>
            </div>

            <div class="containertarefa">
            <h2 class="list-title3" id="dynamic-title3">Lista de Tarefas 3</h2>
                <div class="title-container3">
                    <input class="input-title3" placeholder="Insira o título da lista de tarefas..." maxlength="30">
                    <button class="button-set-title3">Definir Título</button>
                </div>
                <input class="input-task3" placeholder="O que tenho que fazer..." maxlength="36">
                <button class="button-add-task3">Adicionar</button>

                <ul class="list-tasks3">

                </ul>
            </div>
        </div>
    </div>
</x-app-layout>
