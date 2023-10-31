<div id="blocoModal-{{ $modulo->id}}" tabindex="-1" aria-hidden="true" class="fixed bg-menubg/40  top-0 left-0 right-0 z-50 hidden w-full p-4 overflow-x-hidden overflow-y-auto md:inset-0 h-full max-h-full">
    <div class=" w-full h-full  max-h-full">
        <!-- Modal content -->
        <div class="w-100vw bg-menubg rounded-lg shadow">
            <div class="grid grid-cols-3 w-full h-full justify-items-center content-center">
                <div class="w-1/3 order-1"></div>
                <div class="text-xl w-1/3 font-medium text-white self-center order-2">
                    @if ($modulo->linguagem == "htmlmixed")
                    <span class="uppercase text-xs">HTML</span>
                    @else
                    <span class="uppercase text-xs">{{ $modulo->linguagem}}</span>
                    @endif
                </div>
                <div class="order-3 w-1/3 justify-self-end">
                    <button type="button" class="bg-transparent hover:bg-maincolor-100 rounded-lg mt-2  w-8 h-8 inline-flex justify-center items-center" data-modal-hide="blocoModal-{{ $modulo->id}}">
                        <i class="fa-solid fa-xmark fa-xl" style="color: #ffffff;"></i>
                        <span class="sr-only">Close modal</span>
                    </button>
                </div>
            </div>
            <div class="px-6 py-6 lg:px-8">



                <form class="space-y-6" action="{{route('criar_bloco')}}" method="post">
                    @csrf
                    <div class="flex flex-row align-middle">
                        <input type="text" name="nome" class="bg-menubg border border-maincolor-100 text-[#838383] text-5xl rounded-lg focus:ring-menubg focus:border-menubg block w-2/3   p-2.5 " placeholder="Digite um título ou uma breve descrição" required>
                        <button type="submit" class="w-1/6 ml-10  bg-maincolor-100 hover:bg-maincolor-200 focus:ring-4 focus:outline-none focus:ring-maincolor-300 font-medium rounded-lg text-sm px-4 py-2 text-white text-center ">Criar Bloco</button>
                        <button type="button" id="botaoCopia-{{$modulo->id}}">
                            <i class="fa-regular fa-copy fa-2xl" style="color: #000000; height:10px; width:100px;"></i>
                        </button>
                    </div>
                    <textarea id="myTextarea-{{$modulo->id}}" name="codigo" placeholder="Coloque seu código aqui..." style="height: 100%;"></textarea>
                    <input type="hidden" value="{{$modulo->id}}" name="idmodulo">
                    <style>
                        .CodeMirror {
                            border: 1px solid #eee;
                            height: 65vh;
                            
                            color: #000000;
                            /* Defina a cor desejada */

                        }

                        .CodeMirror-overlayscroll-horizontal div,
                        .CodeMirror-overlayscroll-vertical div {
                            position: absolute;
                            background: #8E05C2;
                            border-radius: 3px;
                        }
                    </style>





                </form>
            </div>

        </div>
    </div>
</div>
<script>
    <?php
    echo 'var myTextarea = document.getElementById("myTextarea-', $modulo->id, '");
    // Selecione o botão e a textarea
    var botaoCopiar = document.getElementById("botaoCopia-',$modulo->id,'");
        var editor',$modulo->id,' = CodeMirror.fromTextArea(myTextarea, {
            
            matchBrackets: true,
            autoRefresh: true,
            styleActiveLine: true,
            styleActiveSelected: true,
            theme: "dracula",
            scrollbarStyle: "overlay",
            mode: "', $modulo->linguagem, '"
    });
    
    editor',$modulo->id,'.setSize(null,null);
    // Adicione um ouvinte de evento de clique ao botão
    botaoCopiar.addEventListener("click", function() {
    // Usando a Clipboard API para copiar o texto
    var texto = editor',$modulo->id,'.getValue();
    navigator.clipboard.writeText(texto)
      .then(function() {
        // A cópia foi bem-sucedida
        alert("Texto Copiado");
      });
    });'
    ?>
</script>