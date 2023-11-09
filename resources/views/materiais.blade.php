<x-app-layout>
    <div class="preloader">
        <span></span>
    </div>
    <div class="flex flex-col px-40  w-full h-[60vh] ">
        <div class="w-full h-1/5 ">
            <div class="flex w-1/2 justify-start gap-4">
                <h1>Meus Materiais</h1>
            </div>
            <div class="flex w-full justify-between ">
                <button class="bg-maincolor-100 w-[10vw] h-10 rounded-2xl min-w-max">Arquivos</button>
                <button class="bg-maincolor-100 w-[10vw] h-10 rounded-2xl min-w-max">Links</button>
                <button class="bg-maincolor-100 w-[10vw] h-10 rounded-2xl min-w-max">Blocos de Código</button>
            </div>
        </div>
        <div id="arquivos" class="flex w-full h-2/3 content-start">
            <div class="flex flex-row w-full border-b-4 justify-between">
                <h1>Nome</h1>
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
                    <p class="truncate">.{{$material->tipo}}</p>
                </div>
                <form action="{{ route('baixar_arquivo', ['id' => $material->id]) }}" method="get">
                    @csrf
                    <button type="submit" class="ml-10 bg-maincolor-100 w-full h-14 rounded-xl">Baixar</button>
                </form>

                <form id="deleteForm_{{ $material->id }}" action="{{ route('deletar_material', ['id' => $material->id]) }}" method="post">
                    @csrf
                    @method('delete')
                    <?php echo '<button type="button" onclick="confirmDelete(', $material->id, ')" class="ml-10 bg-red-700 w-full h-14 rounded-xl">Excluir</button>' ?>
                </form>
                <div class="1/6">
                    <p>{{ $material->created_at }}</p>
                </div>
            </div>
            @endforeach

        </div>
        <!-- Botão de criação na parte inferior direita com classes Tailwind CSS -->

        <button data-modal-target="createFile" data-modal-toggle="createFile" class="fixed bottom-14 right-14 p-4 bg-maincolor-100  py-2 px-4 rounded-full">
            <i class="fa-solid fa-pencil" style="color: #ffffff;"></i>
        </button>
        <button data-modal-target="createLink" data-modal-toggle="createLink" class=" hidden fixed bottom-14 right-14 p-4 bg-maincolor-100  py-2 px-4 rounded-full">
            <i class="fa-solid fa-pencil" style="color: #ffffff;"></i>
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

                // Desabilitar o botão para evitar cliques múltiplos
                deleteButton.disabled = true;

                // Submeter o formulário após o desabilitar o botão
                deleteForm.submit();
            }
        }
    </script>

</x-app-layout>