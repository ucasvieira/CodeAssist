<div id="createLink" tabindex="-1" aria-hidden="true" class="fixed bg-menubg/40  top-0 left-0 right-0 z-50 hidden w-full p-4 overflow-x-hidden overflow-y-auto md:inset-0 h-[calc(100%)] max-h-full">
    <div class="relative w-full max-w-md max-h-full">
        <!-- Modal content -->
        <div class="relative bg-menubg rounded-lg shadow">
            <div class="px-6 py-6  lg:px-8">
                <form action="{{route('criar_link')}}" method="post">
                    @csrf
                    <div>
                        <label for="nome">Digite o nome ou uma breve descrição do link:</label>
                        <input maxLength="50" type="text" id="nome" name="nome" class="bg-white border-2 w-full border-maincolor-100 text-black rounded-lg focus:ring-maincolor-100 focus:border-maincolor-100   mb-2.5" required>
                    </div>
                    <div>
                        <label for="nome">Insira o link abaixo:</label>
                        <input maxLength="255" type="url" id="url" name="url" class="bg-white border-2 w-full border-maincolor-100 text-black rounded-lg focus:ring-maincolor-100 focus:border-maincolor-100   mb-2.5" required>
                    </div>
                    <button class="bg-maincolor-100 w-[10vw] min-w-max h-10 rounded-2xl mt-3" type="submit">Salvar link</button>
                </form>
            </div>
        </div>
    </div>
</div>