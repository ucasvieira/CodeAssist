<div>
<nav class="bg-darkfundo text-branco py-4 h-[14vh]">
      <div class="container mx-auto flex items-center justify-between">
        <a class="text-2xl font-bold" href="/">
          <img src="{{ asset('images/logobranco.png') }}" alt="Logo" class="inline-block w-8 h-8 mr-2" />
          CodeAssist
        </a>
        <button class="lg:hidden block text-branco">
          <i class="fas fa-bars"></i>
        </button>
        <div class="hidden lg:flex space-x-6">
          <a class="hover:text-gray-300" href="{{ url('/blococodigo') }}">Salvar Códigos</a>
          <a class="hover:text-gray-300" href="{{ url('/tarefa') }}">Lista de Tarefas</a>
          <a class="hover:text-gray-300" href="{{ url('/pomodoro') }}">Pomodoro</a>
          <a class="hover:text-gray-300" href="{{ url('/flashcard') }}">Flashcards</a>
          <a class="hover:text-gray-300" href="{{ url('/materiais') }}">Salvar Materiais</a>
          @if (Route::has('login'))
          @auth
          <a class="hover:text-gray-300" href="{{ route('profile.edit') }}">{{ Auth::user()->name }}</a>
          <form method="POST" action="{{ route('logout') }}">
            @csrf
            <button type="submit" class="hover:text-gray-300">Log Out</button>
          </form>
          @else
          <a class="hover:text-gray-300" href="{{ route('login') }}">Log in</a>
          @endauth
          @endif
        </div>
      </div>
    </nav>
</div>