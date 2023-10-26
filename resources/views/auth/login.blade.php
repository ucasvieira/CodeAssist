<x-guest-layout :login=true>
<div class="preloader">
    <span></span>
</div>
<form method="POST" action="{{ route('login') }}">
    @csrf

    <!-- Email Address -->
    <div>
        <x-input-label for="email" :value="__('Email:')"/>
        <x-text-input id="email" class="block mt-1 w-full" type="email" name="email" :value="old('email')" required autofocus autocomplete="username" placeholder="exemplo@gmail.com"/>
        <x-input-error :messages="$errors->get('email')" class="mt-2" />
    </div>

    <!-- Password -->
    <div class="mt-4">
        <x-input-label for="password" :value="__('Senha:')"/>

        <x-text-input id="password" class="block mt-1 w-full"
                        type="password"
                        name="password"
                        required autocomplete="current-password" />

        <x-input-error :messages="$errors->get('senha')" class="mt-2" />
    </div>

    <!-- Remember Me -->
    <div class="block mt-4">
        <label for="remember_me" class="inline-flex items-center">
            <input id="remember_me" type="checkbox" class="rounded bg-branco border-maincolor-100 dark:border-maincolor-100 text-menubg shadow-sm focus:ring-maincolor-200 dark:focus:ring-maincolor-200 " name="remember">
            <span class="ml-2 text-sm text-branco dark:text-branco">{{ __('Mantenha-me conectado') }}</span>
        </label>
    </div>
    <div class="container mx-auto justify-center">
        <x-primary-button >
            {{ __('Entrar') }}
        </x-primary-button>
</div>
    <div class="flex items-center justify-top mt-4">
            <a class="text-sm text-branco dark:text-branco rounded-md focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500 dark:focus:ring-offset-gray-800" href="">Não possui uma conta?&nbsp;</a>
            <a class="underline text-sm text-maincolor-100 dark:text-maincolor-100 hover:text-maincolor-200 dark:hover:text-gray-100 rounded-md focus:outline-maincolor-100 focus:ring-2 focus:ring-offset-2 focus:ring-maincolor-100 dark:focus:ring-offset-gray-800" href="{{ route('register') }}">
                {{ __('Cadastre-se') }}
            </a>
    </div>
</form>
            </div>
        </div>
</x-guest-layout>
