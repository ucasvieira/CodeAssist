<div id="deleteLink{{$link->id}}" tabindex="-1" aria-hidden="true" class="fixed bg-menubg/40  top-0 left-0 right-0 z-50 hidden w-full p-4 overflow-x-hidden overflow-y-auto md:inset-0 h-[calc(100%)] max-h-full">
    <div class="relative w-full max-w-xs max-h-full">
        <!-- Modal content -->
        <div class="relative bg-menubg rounded-lg shadow">
            <div class="flex flex-col px-6 py-6  lg:px-8">
                <form action="{{ route('deletar_link', ['id' => $link->id]) }}" method="post">
                    @method('DELETE')
                    @csrf
                    <p>Tem certeza que deseja deletar o bloco?</p>
                    <button class=" bg-red-600 w-[10vw] h-10 rounded-2xl mt-3" type="submit">Sim</button>
                </form>
                <button class="bg-maincolor-100 w-[10vw] h-10 rounded-2xl mt-3" data-modal-hide="deleteLink{{$link->id}}">Não</button>
            
        </div>
    </div>
</div>
</div>