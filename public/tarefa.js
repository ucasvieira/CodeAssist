const button = document.querySelector('.button-add-task')
const input = document.querySelector('.input-task')
const listaCompleta = document.querySelector('.list-tasks')


let minhaListaDeItens = []


function adicionarNovaTarefa(){
    if (input.value.trim() === '') {
        alert('Por favor, insira um nome para a tarefa.');
        return;
    }

    minhaListaDeItens.push({
        tarefa: input.value,
        concluida: false
    })

    input.value = ''

    mostrarTarefas()
}

function mostrarTarefas(){

    let novaLi = ''

    minhaListaDeItens.forEach((item, posicao)=>{
        novaLi = novaLi + `

        <li class="task ${item.concluida && "done"}">
          <i class="fa-solid fa-check" alt="check" id="check" onclick="concluirTarefa(${posicao})" style="color: #8e05c2;"></i>
          <p class="itemtarefa">${item.tarefa}</p>
          <i class="fa-solid fa-trash" alt="trash" id="trash" onclick="deletarItem(${posicao})" style="color: #dc0909;"></i>
       </li>

        `
    })

    listaCompleta.innerHTML = novaLi

    localStorage.setItem('lista', JSON.stringify(minhaListaDeItens)) //o localstorage só aceita string, então, o json.stringfy() transforma o objeto em string

}

function concluirTarefa(posicao){
    minhaListaDeItens[posicao].concluida = !minhaListaDeItens[posicao].concluida

    mostrarTarefas()
}

function deletarItem(posicao){
    minhaListaDeItens.splice(posicao, 1)

    mostrarTarefas()
}

function recarregarTarefas(){
    const tarefasDoLocalStorage = localStorage.getItem('lista')

    if(tarefasDoLocalStorage){
    minhaListaDeItens = JSON.parse(tarefasDoLocalStorage) //transformando o objeto que foi transformado em string novamente em objeto
    }


    mostrarTarefas()
}

recarregarTarefas()
button.addEventListener('click', adicionarNovaTarefa)


input.addEventListener('input', function() {
    if (input.value.length >= input.maxLength) {
        alert('Limite máximo de caracteres atingido');
    }
});