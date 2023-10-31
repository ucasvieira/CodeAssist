<div id="editModulo-{{$modulo->id}}" tabindex="-1" aria-hidden="true" class="fixed bg-menubg/40  top-0 left-0 right-0 z-50 hidden w-full p-4 overflow-x-hidden overflow-y-auto md:inset-0 h-[calc(100%)] max-h-full">
    <div class="relative w-full max-w-md max-h-full">
        <!-- Modal content -->
        <div class="relative bg-menubg rounded-lg shadow">
            <button type="button" class="absolute top-3 right-2.5  bg-transparent hover:bg-maincolor-100 rounded-lg text-sm w-8 h-8 ml-auto inline-flex justify-center items-center" data-modal-hide="editModulo-{{$modulo->id}}">
                <i class="fa-solid fa-xmark fa-xl" style="color: #ffffff;"></i>
                <span class="sr-only">Close modal</span>
            </button>
            <div class="px-6 py-6 lg:px-8">
                <h3 class="mb-4 text-xl font-medium text-white ">Edite a linguagem do Grupo</h3>
                <form class="space-y-6" action="{{ route('editar_modulo', ['id' => $modulo->id]) }}" method="POST">
                    @method('PUT')
                    @csrf
                    <div>
                        <label class="block mb-2 text-sm font-medium text-white">Selecione a linguagem do Grupo</label>
                            <select name="editlinguagem" class=" rounded-lg">
                            <option value="htmlmixed">HTML</option>
                            <option value="css">CSS</option>
                            <option value="javascript">JavaScript</option>
                            <option value="python">Python</option>
                            <option value="php">PHP</option>
                            <option value="sql">SQL</option>
                            <option value="xml">XML</option>
                            <option value="texto">Texto</option>
                        </select>
                    </div>

                    <button type="submit" class="w-full text-blac bg-maincolor-100 hover:bg-maincolor-200 focus:ring-4 focus:outline-none focus:ring-maincolor-300 font-medium rounded-lg text-sm px-5 py-2.5 text-white text-center ">Editar Grupo</button>

                </form>
            </div>

        </div>
    </div>
</div>