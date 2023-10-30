//lista 1

const buttonSetTitle = document.querySelector('.button-set-title');
const titleContainer = document.querySelector('.list-title');
const buttonAdd = document.querySelector('.button-add-task');
const inputTask = document.querySelector('.input-task');
const listTasks = document.querySelector('.list-tasks');
const maxTasks = 10; 

let listData = {
    tasks: [],
    title: "Lista de Tarefas"
};

buttonSetTitle.addEventListener('click', function() {
    const inputTitle = document.querySelector('.input-title');
    listData.title = inputTitle.value || "Título";
    titleContainer.textContent = listData.title;
    localStorage.setItem('tituloLista', JSON.stringify(listData.title));
});

function addNewTask() {
    if (inputTask.value.trim() === '') {
        alert('Por favor, insira um nome para a tarefa.');
        return;
    }

    if (listData.tasks.length >= maxTasks) {
        alert('Você atingiu o limite máximo de tarefas.');
        return;
    }

    listData.tasks.push({
        task: inputTask.value,
        completed: false
    });

    inputTask.value = '';

    showTasks();
}

function showTasks() {
    let newLi = '';
    listData.tasks.forEach((item, position) => {
        newLi += `
            <li class="task ${item.completed && 'done'}">
              <i class="fa-solid fa-check" alt="check" id="check" onclick="completeTask(${position})" style="color: #8e05c2;"></i>
              <p class="itemtask">${item.task}</p>
              <i class="fa-solid fa-trash" alt="trash" id="trash" onclick="deleteItem(${position})" style="color: #dc0909;"></i>
            </li>
        `;
    });

    listTasks.innerHTML = newLi;
    localStorage.setItem('lista', JSON.stringify(listData.tasks));
}

function completeTask(position) {
    listData.tasks[position].completed = !listData.tasks[position].completed;
    showTasks();
}

function deleteItem(position) {
    listData.tasks.splice(position, 1);
    showTasks();
}

function reloadTasks() {
    const storedTasks = localStorage.getItem('lista');
    const storedTitle = localStorage.getItem('tituloLista');

    if (storedTasks) {
        listData.tasks = JSON.parse(storedTasks);
    }
    if (storedTitle) {
        listData.title = JSON.parse(storedTitle);
        titleContainer.textContent = listData.title;
    }
    showTasks();
}

buttonAdd.addEventListener('click', addNewTask);

inputTask.addEventListener('input', function() {
    if (inputTask.value.length >= inputTask.maxLength) {
        alert('Limite máximo de caracteres atingido');
    }
});

reloadTasks();

//lista 2

const buttonSetTitle2 = document.querySelector('.button-set-title2');
const titleContainer2 = document.querySelector('.list-title2');
const buttonAdd2 = document.querySelector('.button-add-task2');
const inputTask2 = document.querySelector('.input-task2');
const listTasks2 = document.querySelector('.list-tasks2');
const maxTasksList2 = 10;

let listData2 = {
    tasks: [],
    title: "Lista de Tarefas 2"
};

buttonSetTitle2.addEventListener('click', function() {
    const inputTitle2 = document.querySelector('.input-title2');
    listData2.title = inputTitle2.value || "Título";
    titleContainer2.textContent = listData2.title;
    localStorage.setItem('tituloLista2', JSON.stringify(listData2.title));
});

function addNewTask2() {
    if (inputTask2.value.trim() === '') {
        alert('Por favor, insira um nome para a tarefa.');
        return;
    }

    if (listData2.tasks.length >= maxTasksList2) {
        alert('Você atingiu o limite máximo de tarefas.');
        return;
    }

    

    listData2.tasks.push({
        task: inputTask2.value,
        completed: false
    });

    inputTask2.value = '';

    showTasks2();
}

function showTasks2() {
    let newLi2 = '';
    listData2.tasks.forEach((item, position) => {
        newLi2 += `
            <li class="task ${item.completed && 'done'}">
              <i class="fa-solid fa-check" alt="check" id="check" onclick="completeTask2(${position})" style="color: #8e05c2;"></i>
              <p class="itemtask">${item.task}</p>
              <i class="fa-solid fa-trash" alt="trash" id="trash" onclick="deleteItem2(${position})" style="color: #dc0909;"></i>
            </li>
        `;
    });

    listTasks2.innerHTML = newLi2;
    localStorage.setItem('lista2', JSON.stringify(listData2.tasks));
}

function completeTask2(position) {
    listData2.tasks[position].completed = !listData2.tasks[position].completed;
    showTasks2();
}

function deleteItem2(position) {
    listData2.tasks.splice(position, 1);
    showTasks2();
}

function reloadTasks2() {
    const storedTasks2 = localStorage.getItem('lista2');
    const storedTitle2 = localStorage.getItem('tituloLista2');

    if (storedTasks2) {
        listData2.tasks = JSON.parse(storedTasks2);
    }
    if (storedTitle2) {
        listData2.title = JSON.parse(storedTitle2);
        titleContainer2.textContent = listData2.title;
    }
    showTasks2();
}

buttonAdd2.addEventListener('click', addNewTask2);

inputTask2.addEventListener('input', function() {
    if (inputTask2.value.length >= inputTask2.maxLength) {
        alert('Limite máximo de caracteres atingido');
    }
});

reloadTasks2();

// lista 3 

const buttonSetTitle3 = document.querySelector('.button-set-title3');
const titleContainer3 = document.querySelector('.list-title3');
const buttonAdd3 = document.querySelector('.button-add-task3');
const inputTask3 = document.querySelector('.input-task3');
const listTasks3 = document.querySelector('.list-tasks3');
const maxTasksList3 = 10;

let listData3 = {
    tasks: [],
    title: "Lista de Tarefas 3"
};

buttonSetTitle3.addEventListener('click', function() {
    const inputTitle3 = document.querySelector('.input-title3');
    listData3.title = inputTitle3.value || "Título";
    titleContainer3.textContent = listData3.title;
    localStorage.setItem('tituloLista3', JSON.stringify(listData3.title));
});

function addNewTask3() {
    if (inputTask3.value.trim() === '') {
        alert('Por favor, insira um nome para a tarefa.');
        return;
    }

    if (listData3.tasks.length >= maxTasksList3) {
        alert('Você atingiu o limite máximo de tarefas.');
        return;
    }

    listData3.tasks.push({
        task: inputTask3.value,
        completed: false
    });

    inputTask3.value = '';

    showTasks3();
}

function showTasks3() {
    let newLi3 = '';
    listData3.tasks.forEach((item, position) => {
        newLi3 += `
            <li class="task ${item.completed && 'done'}">
              <i class="fa-solid fa-check" alt="check" id="check" onclick="completeTask3(${position})" style="color: #8e05c2;"></i>
              <p class="itemtask">${item.task}</p>
              <i class="fa-solid fa-trash" alt="trash" id="trash" onclick="deleteItem3(${position})" style="color: #dc0909;"></i>
            </li>
        `;
    });

    listTasks3.innerHTML = newLi3;
    localStorage.setItem('lista3', JSON.stringify(listData3.tasks));
}

function completeTask3(position) {
    listData3.tasks[position].completed = !listData3.tasks[position].completed;
    showTasks3();
}

function deleteItem3(position) {
    listData3.tasks.splice(position, 1);
    showTasks3();
}

function reloadTasks3() {
    const storedTasks3 = localStorage.getItem('lista3');
    const storedTitle3 = localStorage.getItem('tituloLista3');

    if (storedTasks3) {
        listData3.tasks = JSON.parse(storedTasks3);
    }
    if (storedTitle3) {
        listData3.title = JSON.parse(storedTitle3);
        titleContainer3.textContent = listData3.title;
    }
    showTasks3();
}

buttonAdd3.addEventListener('click', addNewTask3);

inputTask3.addEventListener('input', function() {
    if (inputTask3.value.length >= inputTask3.maxLength) {
        alert('Limite máximo de caracteres atingido');
    }
});

reloadTasks3();

