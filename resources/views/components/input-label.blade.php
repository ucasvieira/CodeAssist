@props(['value'])

<label {{ $attributes->merge(['class' => 'block bg-menubg font-medium text-sm text-branco ']) }}>
    {{ $value ?? $slot }}
</label>
