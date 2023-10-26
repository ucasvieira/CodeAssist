<x-app-layout>

<div class="preloader">
    <span></span>
</div>


  <div class="main"> 
    <!-- Primeira parte da landpage -->
    <div class="effect-wrap">
            <i class="fa-solid fa-code fa-spin fa-spin-reverse fa-lg" style="color: #942cc3;"></i>
            </div>
    <section class="first-section">
        <div class="box-img-main" id="hidden">
            <img class="img-landpage" src="images/studying.png" alt="studying"> 
        </div>
        <div id="hidden">
            <h1 class="fontum" id="textcomeceagora"><strong>O melhor ambiente para auxiliar <br> seus estudos de programação<strong></h1>
            <a class="btn-action dark-text-hover" href="{{ route('login') }}">Comece agora</a>
        </div>
    </section> 
    <!-- Segunda parte da landpage -->
    <div class="effect-wrap2">
    <i class="fa-solid fa-hourglass-start fa-spin" style="color: #942cc3;"></i>
    </div>
    <section class="second-section">
        <div id="hidden"> 
            <h1 class="fontum" id="textpomodoro"><strong>Você sabia que a <span>técnica pomodoro</span> promete ajudar quem tem <br>dificuldade em terminar as suas tarefas no prazo?<br>
Essa metodologia garante o fim desse ciclo vicioso e ainda <br><span>aumenta sua produtividade.</span><br>
Trata-se de uma ferramenta simples e eficaz para que você <br>
gerencie o seu tempo.<strong></h1>
            <a class="btn-action dark-text-hover" href="{{ url('/pomodoro') }}">Ferramenta Pomodoro</a>
        </div>

        <div class="box-img-main" id="hidden">
            <img class="img-landpage" src="images/clocklandpage.png" alt="clock"> 
        </div>
    </section>
    <!-- Terceira parte da landpage -->
    <section class="third-section">
        <div class="box-img-main" id="hidden">
            <img class="img-landpage" src="images/computerlandpage.png" alt="computer"> 
        </div>

        <div id="hidden">
            <h1 class="fontum" id="textblococod"><strong>Salve parte dos seus códigos para não <br> precisar codificar tudo novamente!<strong></h1>
            <a class="btn-action dark-text-hover" href="{{ url('/blococodigo') }}">Salvar Blocos</a>
        </div>
    </section> 
    <!-- Quarta parte da landpage -->
    <section class="fourth-section">
        <div id="hidden">
            <h1 class="fontum" id="textlist"><strong>Encontre a clareza mental que você tanto busca. <br>
Foque no que é importânte anotando tudo o que 
você precisa fazer!<strong></h1>
            <a class="btn-action dark-text-hover" href="{{ url('/tarefa') }}">Lista de Tarefas</a>
        </div>

        <div class="box-img-main" id="hidden">
            <img class="img-landpage" src="images/listalandpage.png" alt="clock"> 
        </div>
    </section>
    <!-- Quinta parte da landpage -->
    <section class="fifth-section">
        <div class="box-img-main" id="hidden">
            <img class="img-landpage" src="images/salvarmateriais.png" alt="computer"> 
        </div>

        <div id="hidden">
            <h1 class="fontum" id="textmateriais"><strong>Precisa de um lugar para armazenar seus links e arquivos?<br>
O Code Assist é a solução!  <strong></h1>
            <a class="btn-action dark-text-hover" href="{{ url('/materiais') }}">Guardar Materiais</a>
        </div>
    </section> 

    <div class="footeraa">

    </div>
</div>
    <!-- Rodapé -->
    <footer>
        <div id="footer_content">
            <div id="footer_contacts">
            <img class="logofooter" src="images/logobranco.png" alt="studying" width="200px"/> 
            </div>

            <ul class="footer-p">
                <li>
                    <h2><strong>Sobre Nós</strong><h2>
                </li>
                <li>
                    <p>Nossa equipe é composta por três estudantes de <br>
desenvolvimento de sistemas da ETEC Zona Leste.<br>
Esse site foi desenvolvido como o TCC da equipe.</p>
                </li>
                <li>
                    <br>
                <a class="btn-linktree" href="https://linktr.ee/codeassist">Conheça nossa equipe</a>
                </li>
            </ul>


            <ul class="footer-list">
                <li>
                    <h2><strong>Ferramentas</strong><h2>
                </li>

                <div class="transition1">
                <li>
                    <a href="{{ url('/blococodigo') }}" class="footer-link">Salvar Códigos</a>
                </li>
                </div> 

                <div class="transition2">
                <li>
                    <a href="{{ url('/tarefa') }}" class="footer-link">Lista de Tarefas</a>
                </li>
                </div>

                <div class="transition3">
                <li>
                    <a href="{{ url('/pomodoro') }}" class="footer-link">Cronômetro</a>
                </li>
                </div>

                <div class="transition4">
                <li>
                    <a href="{{ url('/materiais') }}" class="footer-link">Salvar Materiais</a>
                </li>   
                </div>  
            </ul>

        </div>
        <div id="footer_copyright">
                &#169
                2023 Copyright - Code Assist
        </div>
    </footer>


</x-app-layout>