<x-app-layout>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.9.0/styles/dark.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.9.0/styles/base16/dracula.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.9.0/highlight.min.js"></script>
    <div class="preloader">
        <span></span>
    </div>
    <div class="flex flex-col px-40  w-full h-[60vh] ">
        <div class="w-full h-1/5 ">
            <div class="flex w-1/2 justify-start gap-4">
                <h1>Meus Materiais</h1>
            </div>
            <div class="flex w-full justify-between ">
                <button id="btnArquivos" class="bg-maincolor-300 w-[10vw] h-10 rounded-2xl min-w-max">Arquivos</button>
                <button id="btnLinks" class="bg-maincolor-300 w-[10vw] h-10 rounded-2xl min-w-max">Links</button>
                <button id="btnBlocos" class="bg-maincolor-300 w-[10vw] h-10 rounded-2xl min-w-max">Blocos de Código</button>
            </div>
        </div>
        <div id="arquivos" class=" flex w-full h-2/3 content-start">
            <div class="flex flex-row w-full border-b-4 justify-between">
                <h1>Nome:</h1>
                <h1>Adicionado em:</h1>
            </div>
            @foreach($materiais as $material)
            <div class="flex h-16 w-full justify-between items-center">

                @if ($material->tipo == "zip")
                <i class="fa-solid fa-file-zipper fa-2xl" style="color: #8e05c2;"></i>

                @elseif ($material->tipo == "jpg" || $material->tipo == "jpeg" || $material->tipo == "png" || $material->tipo == "gif" || $material->tipo == "bmp")
                <i class="fa-solid fa-file-image fa-2xl" style="color: #8e05c2;"></i>
                @elseif ($material->tipo == "txt")
                <i class="fa-solid fa-file-lines fa-2xl" style="color: #8e05c2;"></i>
                @elseif ($material->tipo == "doc" || $material->tipo == "docx")
                <i class="fa-solid fa-file-word fa-2xl" style="color: #8e05c2;"></i>
                @elseif ($material->tipo == "pdf")
                <i class="fa-solid fa-file-pdf fa-2xl" style="color: #8e05c2;"></i>
                @else

                <i class="fa-solid fa-file" style="color: #8e05c2;"></i>
                @endif

                <div class="w-3/5  flex flex-row">
                    <p class="truncate">{{$material->nome}}</p>
                    <p>.{{$material->tipo}}</p>
                </div>
                <div class="w-1/12">
                    <form action="{{ route('baixar_arquivo', ['id' => $material->id]) }}" method="get">
                        @csrf
                        <button type="submit" class=" bg-maincolor-100 w-full h-14 rounded-xl">Baixar</button>
                    </form>
                </div>

                <div class="w-1/12">
                    <form id="deleteForm_{{ $material->id }}" action="{{ route('deletar_material', ['id' => $material->id]) }}" method="post">
                        @csrf
                        @method('delete')
                        <?php echo '<button type="button" onclick="confirmDelete(', $material->id, ')" class=" bg-red-700 w-full h-14 rounded-xl">Excluir</button>' ?>
                    </form>
                </div>
                <div class="1/6">
                    <p class="truncate">{{ $material->created_at }}</p>
                </div>
            </div>
            @endforeach

        </div>
        <div id="links" class=" hidden flex w-full h-2/3 content-start">
            <div class="flex flex-row w-full border-b-4">
                <div class="w-1/2">
                    <h1>Nome:</h1>
                </div>
                <div class="w-1/2">
                    <h1>Link:</h1>
                </div>
            </div>
            @foreach($links as $link)
            <div class="flex h-16 w-full justify-start items-center">

                <div class="w-1/2">
                    <p class="truncate" editable>{{$link->nome}}</p>
                </div>
                <div class=" w-[35%]">
                    <a href="{{$link->URL}} " target="_blank" rel="noopener noreferrer">
                        <p class="truncate hover:text-blue-600 hover:underline" editable>{{$link->URL}}</p>
                    </a>
                </div>
                <div class=" justify-self-end pl-10">
                    <button data-modal-target="deleteLink{{$link->id}}" data-modal-toggle="deleteLink{{$link->id}}" class=" bg-red-700 hover:bg-red-600 p-4 py-2 px-4 rounded-xl">
                        <i class="fa-solid fa-trash"></i>
                    </button>
                </div>
            </div>
            @include('modal.deletelinkModal')
            @endforeach

        </div>
        <div id="blocos" class="hidden flex w-full h-2/3 content-start">
            @foreach($modulos as $modulo)
            @foreach($modulo->blocos as $bloco)
            <div class="p-4 md:w-1/3">
                <a data-modal-target="viewbloco{{$bloco->id}}" data-modal-toggle="viewbloco{{$bloco->id}}">
                    <div class="h-[40vh] border-2 border-maincolor-100 bg-menubg rounded-lg ">
                        <div class="p-6">
                            <h2 class="tracking-widest text-xs title-font font-medium text-gray-400 mb-1"></h2>
                            <h1 class="text-white mb-3">{{$bloco->nome}}</h1>
                            <pre class="w-full h-[30vh] overflow-auto scrollbar-thumb-maincolor-100 scrollbar-track-transparent"><code>{{$bloco->codigo}}</code></pre>
                            <style>
                                

                                .hljs {
                                    background-color: #272727;
                                    /* Cor de fundo */
                                    
                                    /* Espaçamento interno */
                                    
                                }
                            </style>
                        </div>
                    </div>
                </a>
            </div>
            <script>
                document.addEventListener('DOMContentLoaded', (event) => {
                    document.querySelectorAll('pre code').forEach((block) => {
                        hljs.highlightBlock(block);
                    });
                });
            </script>
            @include('modal.viewbloco')
            @endforeach
            @endforeach
        </div>
        <!-- Botão de criação na parte inferior direita com classes Tailwind CSS -->

        <button data-modal-target="createFile" data-modal-toggle="createFile" id="criarArquivo" class=" fixed bottom-14 right-14 p-4 bg-maincolor-100  py-2 px-4 rounded-full">
            <i class="fa-solid fa-plus" style="color: #ffffff;"></i>
        </button>
        <button data-modal-target="createLink" data-modal-toggle="createLink" id="criarLink" class=" hidden fixed bottom-14 right-14 p-4 bg-maincolor-100  py-2 px-4 rounded-full">
            <i class="fa-solid fa-plus" style="color: #ffffff;"></i>
        </button>

    </div>
    @include('modal/createFile')
    @include('modal/createLink')
    <script>
        function confirmDelete(materialId) {
            var confirmation = confirm('Tem certeza que deseja excluir este material?');

            if (confirmation) {
                var deleteForm = document.getElementById('deleteForm_' + materialId);
                var deleteButton = deleteForm.querySelector('button');


                deleteButton.disabled = true;


                deleteForm.submit();
            }
        }
    </script>
    <script>
        function toggleTab(tab) {

            const tabs = ['arquivos', 'links', 'blocos'];

            tabs.forEach(t => {
                const tabElement = document.getElementById(t);
                if (t === tab) {
                    tabElement.classList.remove('hidden');
                } else {
                    tabElement.classList.add('hidden');
                }
            });

            localStorage.setItem('activeTab', tab);
            updateButtonStyles(tab);
        }

        function updateButtonStyles(activeTab) {

            const buttonIds = ['btnArquivos', 'btnLinks', 'btnBlocos'];

            buttonIds.forEach(buttonId => {
                const button = document.getElementById(buttonId);
                if (buttonId === 'btn' + activeTab.charAt(0).toUpperCase() + activeTab.slice(1)) {
                    button.classList.add('active', 'bg-maincolor-100');
                    button.classList.remove('bg-maincolor-300');
                } else {
                    button.classList.remove('active', 'bg-maincolor-100');
                    button.classList.add('bg-maincolor-300');
                }
            });
        }

        function showActiveTab() {
            const activeTab = localStorage.getItem('activeTab') || 'arquivos';
            toggleTab(activeTab);
        }

        document.getElementById('btnArquivos').addEventListener('click', () => toggleTab('arquivos'));
        document.getElementById('btnLinks').addEventListener('click', () => toggleTab('links'));
        document.getElementById('btnBlocos').addEventListener('click', () => toggleTab('blocos'));

        document.addEventListener('DOMContentLoaded', showActiveTab);
        function ocultarBotoesCriacao() {
            document.querySelector('[data-modal-target="createFile"]').classList.add('hidden');
            document.querySelector('[data-modal-target="createLink"]').classList.add('hidden');
        }

        // Função para mostrar o botão de criação de arquivo e ocultar o de link
        function mostrarBotaoArquivos() {
            document.querySelector('[data-modal-target="createFile"]').classList.remove('hidden');
            document.querySelector('[data-modal-target="createLink"]').classList.add('hidden');
        }

        // Função para mostrar o botão de criação de link e ocultar o de arquivo
        function mostrarBotaoLinks() {
            document.querySelector('[data-modal-target="createLink"]').classList.remove('hidden');
            document.querySelector('[data-modal-target="createFile"]').classList.add('hidden');
        }

        // Verificar qual aba está ativa ao carregar a página
        window.addEventListener('load', function() {
            const botaoArquivosAtivo = document.getElementById('btnArquivos').classList.contains('active');
            const botaoLinksAtivo = document.getElementById('btnLinks').classList.contains('active');

            if (botaoArquivosAtivo) {
                mostrarBotaoArquivos();
            } else if (botaoLinksAtivo) {
                mostrarBotaoLinks();
            } else {
                ocultarBotoesCriacao();
            }
        });

        // Adicionar manipuladores de eventos aos botões de abas
        document.getElementById('btnArquivos').addEventListener('click', function() {
            mostrarBotaoArquivos();
        });
        document.getElementById('btnLinks').addEventListener('click', function() {
            mostrarBotaoLinks();
        });
        // Adicionar manipulador para a aba de blocos de código
        document.getElementById('btnBlocos').addEventListener('click', function() {
            ocultarBotoesCriacao();
        });
    </script>

</x-app-layout>