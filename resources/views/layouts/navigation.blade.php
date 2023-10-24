<div class="navbar">
  <nav class=" bg-darkfundo text-branco py-2 h-[10-vh]">
    <div class="container mx-auto flex items-center justify-between flex-wrap">
      <a class="text-2xl font-bold" href="/">
        <img src="{{ asset('images/logo code assist final.png') }}" alt="Logo" width="200px" id="logo-final"/>
      </a>
      <button class="lg:hidden block text-branco">
        <i class="fas fa-bars" id=oi></i>
      </button>
    <div class="navbarsemlogo">
      <div class="hidden lg:flex space-x-6">
        <a class="hover:text-maincolor-100" href="{{ url('/blococodigo') }}">Salvar Códigos</a>
        <a class="hover:text-maincolor-100" href="{{ url('/tarefa') }}">Lista de Tarefas</a>
        <a class="hover:text-maincolor-100" href="{{ url('/pomodoro') }}">Pomodoro</a>
        <a class="hover:text-maincolor-100" href="{{ url('/materiais') }}">Salvar Materiais</a>

        @if (Route::has('login'))
        @auth
        <button id="dropdownNavbarLink" data-dropdown-toggle="dropdownNavbar" class="flex items-center justify-between hover:text-gray-300 text-white rounded  p-0 w-auto ">{{ Auth::user()->name }} <svg class="w-2.5 h-2.5 ml-2.5" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 10 6">
            <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="m1 1 4 4 4-4" />
          </svg></button>
        <!-- Dropdown menu -->
        <div id="dropdownNavbar" class="z-10 hidden font-normal border-maincolor-100 border-2 bg-menubg hover:bg-menubg/50 divide-y divide-gray-100 rounded-lg shadow w-44 dark:divide-gray-600">
          <form class="block px-4 py-2 text-sm text-white   dark:text-gray-400 dark:hover:text-white" method="POST" action="{{ route('logout') }}">
            @csrf
            <button type="submit" class="w-full h-full">Log Out</button>
          </form>
        </div>

        @else
        <button id="dropdownNavbarLink" data-dropdown-toggle="dropdownNavbar" class="flex items-center justify-between hover:text-maincolor-100 text-white rounded  p-0 w-auto ">Entrar <svg class="w-2.5 h-2.5 ml-2.5" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 10 6">
            <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="m1 1 4 4 4-4" />
          </svg></button>
        <!-- Dropdown menu -->
        <div id="dropdownNavbar" class="z-10 hidden font-normal border-maincolor-100 border-2 bg-menubg  divide-y divide-gray-100 rounded-lg shadow w-44 dark:divide-gray-600">
          <div class="block px-4 py-2 text-sm text-white   dark:text-gray-400 dark:hover:text-white">
            <ul aria-labelledby="dropdownLargeButton">
              <li>
                <form action="{{ route('login') }}">
                  <button class="block rounded-lg w-full px-4 py-2 hover:bg-maincolor-100  ">Fazer Login</button>
                </form>
              </li>
              <li>
                <form action="{{ route('register') }}">
                  <button class="block rounded-lg w-full px-4 py-2 hover:bg-maincolor-100  ">Criar Conta</button>
                </form>
              </li>

            </ul>

          </div>
        </div>

        @endauth
        @endif
      </div>
    </div>
        </div>
  </nav>
</div>