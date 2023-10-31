<div id="previewBlocoModal-{{ $bloco->id }}" tabindex="-1" aria-hidden="true" class="fixed bg-menubg/40 top-0 left-0 right-0 z-50 hidden w-full p-4 overflow-x-hidden overflow-y-auto md:inset-0 h-full max-h-full">
    <div class="w-full h-full max-h-full">
        <!-- Modal content -->
        <div class="w-100vw bg-menubg rounded-lg shadow">
            <div class="grid grid-cols-3 w-full h-full justify-items-center content-center">
                <div class="w-1/3 order-1"></div>
                <div class="text-xl w-3/3 font-medium text-white self-center order-2">
                    <span class="uppercase text-xs">{{ $bloco->nome }}</span>
                </div>
                <div class="order-3 w-1/3 justify-self-end">
                    <button type="button" class="bg-transparent hover:bg-maincolor-100 rounded-lg mt-2 w-8 h-8 inline-flex justify-center items-center" data-modal-hide="previewBlocoModal-{{ $bloco->id }}">
                        <i class="fa-solid fa-xmark fa-xl" style="color: #ffffff;"></i>
                        <span class="sr-only">Close modal</span>
                    </button>
                </div>
            </div>
            <div class="px-6 py-6 lg:px-8">
                <button type="button" id="botaoCopia-{{$modulo->id}}">
                    <i class="fa-regular fa-copy fa-2xl" style="color: #000000; height:10px; width:100px;"></i>
                </button>
                <button type="button" id="salvarEdicaoBloco-{{ $bloco->id }}" data-bloco-id="{{ $bloco->id }}">
                    Salvar Edição
                </button>
                <button type="button" id="deletarBloco-{{ $bloco->id }}" data-bloco-id="{{ $bloco->id }}">
                    Deletar Bloco
                </button>
                <!-- Exibir o código do bloco aqui -->
                <div class="code-preview">
                    <textarea id="editCode-{{$bloco->id}}" name="codigo" placeholder="Coloque seu código aqui..." style="height: 100%;">{{ $bloco->codigo }}</textarea>

                </div>
            </div>
        </div>
    </div>
</div>
<script>
    <?php
    echo 'var editCode = document.getElementById("editCode-', $bloco->id, '");
    // Selecione o botão e a textarea
    var botaoCopiar = document.getElementById("botaoCopia-', $bloco->id, '");
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
    editEditor', $bloco->id, '.
    // Adicione um ouvinte de evento de clique ao botão
    botaoCopiar.addEventListener("click", function() {
    // Usando a Clipboard API para copiar o texto
    var texto = editor', $modulo->id, '.getValue();
    navigator.clipboard.writeText(texto)
      .then(function() {
        // A cópia foi bem-sucedida
        alert("Texto Copiado");
      });
    });'
    ?>
</script>