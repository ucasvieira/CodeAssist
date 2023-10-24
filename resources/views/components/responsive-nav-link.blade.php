@props(['active'])

@php
$classes = 'text-branco';
@endphp

<a {{ $attributes->merge(['class' => $classes]) }}>
    {{ $slot }}
</a>
