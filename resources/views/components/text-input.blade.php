@props(['disabled' => false])

<input {{ $disabled ? 'disabled' : '' }} {!! $attributes->merge(['class' => 'border-maincolor-100 dark:border-maincolor-100 bg-menubg focus:border-maincolor-100 dark:focus:border-maincolor-100 focus:ring-maincolor-100 dark:focus:ring-maincolor-100 rounded-md shadow-sm']) !!}>
