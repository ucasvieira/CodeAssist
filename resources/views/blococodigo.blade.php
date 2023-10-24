<x-app-layout>
<div class="preloader">
    <span></span>
</div>
    @if ($semModulos)
    <div class="flex flex-col w-screen h-[86vh] justify-center items-center pb-12">
        <h1 class="text-white pb-3">Você não possui nenhum grupo de blocos criado.</h1>

        <button data-modal-target="createModuloModal" data-modal-toggle="createModuloModal" type="button" class="bg-maincolor-100 rounded py-0.5 px-10 text-white">
            Criar
        </button>
    </div>
    @else
    <div class="grid grid-cols-2 justify-self-center md:grid-cols-3 gap-20 content-around  px-10 ">
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
            <div class="flex rounded-3xl flex-col bg-menubg justify-center items-center h-full w-full">
                <div class="flex h-2/3 w-full">
                    {{-- criação dos módulos --}}
                </div>
                <div class="flex flex-row h-1/3 w-full justify-between content-center p-[1em]">
                    <button>
                        <i class="fa-solid fa-ellipsis-vertical fa-lg" style="color: #8E05C2;"></i>
                    </button>
                    <h1 class=" self-center text-white uppercase">{{ $modulo->linguagem }}</h1>
                    <button data-modal-target="blocoModal-{{ $modulo->id}}" data-modal-toggle="blocoModal-{{ $modulo->id}}" data-nome="blocoModal-{{ $modulo->id }}" type="button">
                        <i class="fa-solid fa-plus fa-lg" style="color: #ffffff;"></i>
                    </button>
                    @include('modal.bloco')
                </div>
            </div>
        </div>
        @endforeach
    </div>
    @endif
    @include('modal.createmodulo')
</x-app-layout>