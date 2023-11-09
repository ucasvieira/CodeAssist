<x-app-layout>
    <div class="preloader">
        <span></span>
    </div>
    @if ($semModulos)
    <div class="flex flex-col w-screen h-[86vh] justify-center items-center pb-12">
        <h1 class="text-white pb-3" id="textnobloco">Você não possui nenhum grupo de blocos criado.</h1>

        <button data-modal-target="createModuloModal" data-modal-toggle="createModuloModal" type="button" id="nobloco">
            Criar
        </button>
    </div>
    @else
    <div class="grid grid-cols-2 justify-self-center md:grid-cols-3 gap-20 content-around px-10 ">
        <div class="box-content  w-[20vw] h-[21vh]">
            <div class="flex rounded-3xl bg-menubg justify-center items-center h-full w-full">
                <button data-modal-target="createModuloModal" data-modal-toggle="createModuloModal" type="button">
                    <img src="{{ asset('images/iconmonstr-plus-2-240.png') }}" alt="dale" class="w-[100px] h-[100px]">
                </button>
            </div>
            <h1 class="text-white align-middle text-center">Criar</h1>
        </div>
        @foreach ($modulos as $modulo)
        <div class="box-content w-[20vw] h-[21vh]">
            <div class="flex rounded-3xl flex-col bg-menubg justify-center items-center h-full w-full min-w-fit">
                <div class="gridtestedale grid grid-flow-row-dense grid-cols-2 h-2/3 w-[calc(100% - 12px)] overflow-y-auto overflow-x-hidden rounded-tl-3xl gap-x-1 gap-y-10 rounded-tr-3xl ">

                    @foreach ($modulo->blocos as $bloco)
                    <div class="w-[19vw]  rounded-3xl h-20 min-w-fit">
                        <button data-modal-target="previewBlocoModal-{{ $bloco->id }}" data-modal-toggle="previewBlocoModal-{{ $bloco->id }}" onclick="focusInput()" class="w-1/2 bg-maincolor-100 rounded h-20">
                            <p class="whitespace-pre-line truncate w-full text-white">{{ $bloco->nome }}</p>
                            <script>
                               <?echo' function focusInput() {
                                    document.getElementById("editCode-',$bloco->id,'").focus();
                                }'?>
                            </script>
                        </button>
                        @include('modal.editbloco')
                    </div>
                    
                    @endforeach
                </div>
                <style>
                    /* Estilizando a barra de rolagem vertical */
                    .gridtestedale::-webkit-scrollbar {
                        width: 6px;
                        border-radius: 100px;

                        /* Largura da barra de rolagem vertical */
                    }

                    .gridtestedale::-webkit-scrollbar-thumb {
                        background: #6B7280;
                        /* Cor da alça da barra de rolagem */
                        border-radius: 6px;
                        /* Arredondamento da alça da barra de rolagem */
                    }

                    .gridtestedale::-webkit-scrollbar-thumb:hover {
                        background: #4B5563;
                        /* Cor da alça da barra de rolagem ao passar o mouse */
                    }

                    /* Estilizando a barra de rolagem horizontal (se aplicável) */
                    .gridtestedale::-webkit-scrollbar-track {
                        background: transparent;
                        /* Cor do fundo da barra de rolagem */
                    }

                    .gridtestedale::-webkit-scrollbar-track:hover {
                        background: transparent;
                        /* Cor do fundo da barra de rolagem ao passar o mouse */
                    }
                </style>


                <div class="flex flex-row h-1/3 w-full justify-between content-center p-[1em]">
                    <button data-dropdown-toggle="dropdown{{$modulo->id}}">
                        <i class="fa-solid fa-ellipsis-vertical fa-lg" style="color: #8E05C2;"></i>
                    </button>
                    <div id="dropdown{{$modulo->id}}" class="z-10 hidden bg-white divide-y divide-gray-100 rounded-lg shadow w-24 dark:bg-gray-700">
                        <ul class="py-2 text-sm text-gray-700 dark:text-gray-200" aria-labelledby="dropdownDefaultButton">
                            <li>
                                <button data-modal-target="editModulo-{{$modulo->id}}" data-modal-toggle="editModulo-{{$modulo->id}}" class="block px-4 py-2 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">Editar</button>
                            </li>
                            <li>
                                <form method="POST" action="{{ route('delete_modulo',['id' => $modulo->id]) }}" onsubmit="return confirm('Tem certeza que deseja excluir este grupo?')">
                                    @method('DELETE')
                                    @csrf
                                    <input type="hidden" name="id_modulo" value="{{ $modulo->id }}">
                                    <button type="submit" class="block px-4 py-2 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white" id="deletebloco">
                                        Excluir
                                    </button>
                                </form>
                            </li>
                        </ul>
                    </div>
                    @if ($modulo->linguagem == "htmlmixed")
                    <h1 class=" self-center text-white uppercase">HTML</h1>
                    @else
                    <h1 class=" self-center text-white uppercase">{{ $modulo->linguagem }}</h1>
                    @endif
                    <button data-modal-target="blocoModal-{{ $modulo->id}}" data-modal-toggle="blocoModal-{{ $modulo->id}}" data-nome="blocoModal-{{ $modulo->id }}" type="button">
                        <i class="fa-solid fa-plus fa-lg" style="color: #ffffff;"></i>
                    </button>
                    @include('modal.bloco')
                </div>
            </div>
        </div>
        @include('modal.editmodulo')
        @endforeach
    </div>
    @endif
    @include('modal.createmodulo')
</x-app-layout>