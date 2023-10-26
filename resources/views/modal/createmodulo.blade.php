<div id="createModuloModal" tabindex="-1" aria-hidden="true" class="fixed bg-menubg/40  top-0 left-0 right-0 z-50 hidden w-full p-4 overflow-x-hidden overflow-y-auto md:inset-0 h-[calc(100%)] max-h-full">
    <div class="relative w-full max-w-md max-h-full">
        <!-- Modal content -->
        <div class="relative bg-menubg rounded-lg shadow">
            <button type="button" class="absolute top-3 right-2.5  bg-transparent hover:bg-maincolor-100 rounded-lg text-sm w-8 h-8 ml-auto inline-flex justify-center items-center" data-modal-hide="authentication-modal">
                <i class="fa-solid fa-xmark fa-xl" style="color: #ffffff;"></i>
                <span class="sr-only">Close modal</span>
            </button>
            <div class="px-6 py-6 lg:px-8">
                <h3 class="mb-4 text-xl font-medium text-white ">Crie um grupo de bloco</h3>
                <form class="space-y-6" action="{{route('criar_modulo')}}" method="post">
                    @csrf
                    <div>
                        <label for="password" class="block mb-2 text-sm font-medium text-white">Selecione a linguagem do Grupo</label>
                        <select name="linguagem" class=" rounded-lg">
                            <option value="html">HTML</option>
                            <option value="javascript">JavaScript</option>
                            <option value="python">Python</option>
                            <option value="java">Java</option>
                            <option value="csharp">C#</option>
                            <option value="php">PHP</option>
                            <option value="cpp">C++</option>
                            <option value="typescript">TypeScript</option>
                            <option value="ruby">Ruby</option>
                            <option value="swift">Swift</option>
                            <option value="kotlin">Kotlin</option>
                        </select>
                    </div>

                    <button type="submit" class="w-full text-blac bg-maincolor-100 hover:bg-maincolor-200 focus:ring-4 focus:outline-none focus:ring-maincolor-300 font-medium rounded-lg text-sm px-5 py-2.5 text-white text-center ">Criar Grupo</button>

                </form>
            </div>

        </div>
    </div>
</div>