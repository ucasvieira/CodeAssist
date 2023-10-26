
<div class="btn-primary">
<button {{ $attributes->merge(['type' => 'submit', 'class' => ' w-full py-3 bg-maincolor-100 dark:bg-maincolor-100 border border-transparent rounded-md font-semibold text-xs text-white dark:text-gray-800 uppercase hover:bg-maincolor-200 dark:hover:bg-maincolor-200 focus:bg-maincolor-200 dark:focus:bg-maincolor-200 active:bg-menubg dark:active:bg-maincolor-300 focus:outline-none focus:ring-maincolor-300 focus:ring-maincolor-300 focus:ring-main-color-300 dark:focus:ring-maincolor-300 transition ease-in-out duration-150']) }}>
    {{ $slot }}
</button>
</div>
