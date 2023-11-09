<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <!--Configuração de media query-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="csrf-token" content="{{ csrf_token() }}">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="css/landpage.css">
    <link rel="shortcut icon" href="images/icontitle.ico" type="image/x-icon">
    <link rel="stylesheet" href="css/pomodoro.css">
    <link rel="stylesheet" href="css/tarefas.css">
<<<<<<< HEAD
    
    
    <!-- import das linguagens codemirror -->
=======
    <link rel="stylesheet" href="css/blococodigo.css">
>>>>>>> 1a8202ffdfb43390fb25e026729afb8aab0dabd3
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.62.0/codemirror.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.62.0/codemirror.min.js"></script>
    <link rel="stylesheet" href="{{asset('dracula.css')}}">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.4.0/mode/javascript/javascript.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/6.65.7/mode/python/python.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/6.65.7/mode/htmlmixed/htmlmixed.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/6.65.7/mode/css/css.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/6.65.7/mode/php/php.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/6.65.7/mode/sql/sql.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/6.65.7/mode/xml/xml.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/6.65.7/addon/display/placeholder.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/6.65.7/addon/scroll/simplescrollbars.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/6.65.7/addon/scroll/simplescrollbars.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/6.65.7/addon/display/autorefresh.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/6.65.7/mode/clike/clike.min.js"></script>

    <title>Code Assist</title>

    <script src="https://kit.fontawesome.com/0418b2283a.js" crossorigin="anonymous"></script>



    @vite(['resources/css/app.css', 'resources/js/app.js' ])
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Roboto+Mono:wght@400&display=swap');
    </style>
</head>

<body class="antialiased h-screen  bg-darkfundo text-white scrollbar-thin scrollbar-rounded-lg hover:scrollbar-thumb-maincolor-300 scrollbar-thumb-menubg scrollbar-track-transparent">

    <script>
        $(window).on("load", function() {
            $(".preloader").fadeOut("slow");
        });
    </script>

    @include('layouts.navigation')
    <!--Conteúdo da página-->
    <div class="h-[5vh]">
        <input type="checkbox" class="checkbox" id="chk" />
        <label class="label" for="chk">
            <i class="fa-solid fa-moon" style="color: #ffffff;"></i>
            <i class="fa-solid fa-sun" style="color: #ffffff;"></i>
            <div class="ball">
            </div>
        </label>
    </div>

    <script>
        const chk = document.getElementById('chk')

        chk.addEventListener('change', () => {
            if (chk.checked) {
                document.body.classList.add('white');
                const textElements = document.querySelectorAll('h1');
                for (let i = 0; i < textElements.length; i++) {
                    textElements[i].classList.add('black-text');
                }
                document.querySelector('.second-section').classList.add('white-background');
                document.querySelector('.fourth-section').classList.add('white-background');
            } else {
                document.body.classList.remove('white');
                const textElements = document.querySelectorAll('h1');
                for (let i = 0; i < textElements.length; i++) {
                    textElements[i].classList.remove('black-text');
                }
                document.querySelector('.second-section').classList.remove('white-background');
                document.querySelector('.fourth-section').classList.remove('white-background');
            }
        });
    </script>
    {{ $slot }}

</body>
<scrit src="scriptlandpage.js">
    </script>
    <script src="tarefa.js"></script>
    <script src="scriptlandpage.js">

    </script>

</html>