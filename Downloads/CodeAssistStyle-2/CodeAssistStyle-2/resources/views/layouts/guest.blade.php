@props(['login'])
<!DOCTYPE html>
<html lang="{{ str_replace('_', '-', app()->getLocale()) }}">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="csrf-token" content="{{ csrf_token() }}">
        <link rel="stylesheet" href="css/telalogin.css">

        <title>{{ config('app.name', 'Laravel') }}</title>

        <!-- Fonts -->
        <link rel="preconnect" href="https://fonts.bunny.net">
        <link href="https://fonts.bunny.net/css?family=figtree:400,500,600&display=swap" rel="stylesheet" />

        <!-- Scripts -->
        @vite(['resources/css/app.css', 'resources/js/app.js'])
    </head>
    <body class="font-sans text-branco antialiased">

    
        <div class="min-h-screen flex flex-col sm:justify-center items-center pt-6 sm:pt-0 bg-darkfundo">
        <div class="grid">
        <div class="justify-self-end justify-item-center max-w-lg h-full pr-20">
@if($login == true)

<div class="textlogin">
        <h1 class="textlogina" style="font-size: 50px;"><strong>FAÇA SEU LOGIN</strong></h1>
</div>

        <div class="box-img-main">
            <img class="img-login" src="images/login.png" alt="programming"> 
        </div>

@else
        <div class="textcadastro">
         <h1 class="textcadastroa" style="font-size: 50px;"><strong>CADASTRE-SE!</strong></h1>
        </div>
        <div class="box-img-main">
            <img class="img-cadastro" src="images/register.png" alt="programming"> 
        </div>
        
@endif  
    
        
        </div>
        <div class="pl-20">
        <div class="max-w-md px-10 py-10 bg-menubg items-center dark:bg-menubg shadow-md overflow-hidden  sm:rounded-2xl">
        <div class="flex justify-center items-center">
        <a href="/" class="text-center">
            <img src="{{ asset('images/logobranco.png') }}" alt="Code Assist" width="100px" height="100px">
            <br>
        </a>
        </div>
                <div class="font-medium text-sm text-green-600 dark:text-green-400"></div>
                {{ $slot }}
            </div>
        </div>
        </div>
    </body>
</html>
