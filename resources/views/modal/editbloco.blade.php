<div id="previewBlocoModal-{{ $bloco->id }}" tabindex="-1" aria-hidden="true" class="fixed bg-menubg/40 top-0 left-0 right-0 z-50 hidden w-full p-4 overflow-x-hidden overflow-y-auto md:inset-0 h-full max-h-full">
    <div class="w-full h-full max-h-full">
        <!-- Modal content -->
        <div class="w-100vw bg-menubg rounded-lg shadow">
            <div class="grid grid-cols-3 w-full h-full justify-items-center content-center">
                <div class="w-1/3 order-1"></div>
                <div class="text-xl w-2/3 font-medium text-white self-center order-2">
                    <p class="uppercase text-xs truncate">{{ $bloco->nome }}</p>
                </div>
                <div class="order-3 w-1/3 justify-self-end">
                    <button type="button" class="bg-transparent hover:bg-maincolor-100 rounded-lg mt-2 w-8 h-8 inline-flex justify-center items-center" data-modal-hide="previewBlocoModal-{{ $bloco->id }}">
                        <i class="fa-solid fa-xmark fa-xl" style="color: #ffffff;"></i>
                        <span class="sr-only">Close modal</span>
                    </button>
                </div>
            </div>
            <div class="px-6 py-6 lg:px-8">
                <form class="space-y-5" action="{{route('edit_bloco',['id' => $bloco->id])}}" method="post">
                    @method('PUT')
                    @csrf
                    <div class="flex flex-row align-middle">
                        <input type="text" id="userInput{{$bloco->id}}" name="editnome" class=" bloconome bg-menubg border border-maincolor-100 text-[#838383] text-5xl rounded-lg focus:ring-menubg focus:border-menubg block w-2/3   p-2.5 " placeholder="Digite um título ou uma breve descrição" required value="{{$bloco->nome}}">
                        <button type="submit" class="w-1/6 ml-10 bg-maincolor-100 hover:bg-maincolor-200 focus:ring-4 focus:outline-none focus:ring-maincolor-300 font-medium rounded-lg text-sm px-4 py-2 text-white text-center ">Salvar Alterações</button>
                        <button type="button" id="botaoCopia-{{$bloco->id}}">
                            <i class="fa-regular fa-copy fa-2xl" style="color: #000000; height:10px; width:100px;"></i>
                        </button>
                    </div>

                    <!-- Exibir o código do bloco aqui -->
                    <div class="code-preview">
                        <textarea id="editCode-{{$bloco->id}}" name="editcodigo" placeholder="Coloque seu código aqui..." style="height: 100%;">{{$bloco->codigo}}</textarea>

                    </div>
                </form>
                <form method="POST" action="{{ route('delete_bloco')}}" onsubmit="return confirm('Tem certeza que deseja excluir este bloco?')">
                    @method('DELETE')
                    @csrf
                    <input type="hidden" name="id_bloco" value="{{ $bloco->id }}">
                    <button type="submit" class="w-1/6 ml-10 bg-maincolor-100 hover:bg-maincolor-200 focus:ring-4 focus:outline-none focus:ring-maincolor-300 font-medium rounded-lg text-sm px-4 py-2 text-white text-center ">Deletar Bloco</button>
                    
                </form>
            </div>
        </div>
    </div>
</div>
<script>
    <?php
    echo '
    document.getElementById("userInput',$bloco->id,'").addEventListener("input", function(event) {
        let userInput = event.target.value;
        let cleanInput = userInput.replace(/<|>/g, "");
        event.target.value = cleanInput; 
    });
    var editCode = document.getElementById("editCode-', $bloco->id, '");
    // Selecione o botão e a textarea
    var editEditor', $bloco->id, ' = CodeMirror.fromTextArea(editCode, {        
        matchBrackets: true,
        autoRefresh: true,
        styleActiveLine: true,
        styleActiveSelected: true,
        theme: "dracula",
        scrollbarStyle: "overlay",
        mode: "', $modulo->linguagem, '"
    });
    
    editEditor', $bloco->id, '.setSize(null,null);
    
    var botaoCopiarEditor', $bloco->id, ' = document.getElementById("botaoCopia-', $bloco->id, '");
    // Adicione um ouvinte de evento de clique ao botão
    botaoCopiarEditor', $bloco->id, '.addEventListener("click", function() {
    // Usando a Clipboard API para copiar o texto
    var texto', $bloco->id, ' = editEditor', $bloco->id, '.getValue();
    navigator.clipboard.writeText(texto', $bloco->id, ')
      .then(function() {
        // A cópia foi bem-sucedida
        alert("Texto Copiado");
      });
    });'
    ?>
</script>