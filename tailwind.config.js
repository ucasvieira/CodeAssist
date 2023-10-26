import defaultTheme from 'tailwindcss/defaultTheme';
import forms from '@tailwindcss/forms';
import theme from 'tailwindcss/defaultTheme';

/** @type {import('tailwindcss').Config} */
export default {
    content: [
        './vendor/laravel/framework/src/Illuminate/Pagination/resources/views/*.blade.php',
        './storage/framework/views/*.php',
        "./resources/**/*.blade.php",
        "./resources/**/*.js",
        "./resources/**/*.vue",
        "./node_modules/flowbite/**/*.js"
    ],

    theme: {
        extend: {
            fontFamily: {
                sans: ['Figtree', ...defaultTheme.fontFamily.sans],

            },
            colors: {
                'maincolor': {
                    100: '#8E05C2',
                    200: '#B206F4',
                    300: '#C333FA',
                },
                'darkfundo': '#0F0F0F',
                'menubg': '#272727',
                'branco': '#FFFFFF',
                'checkbox': '#B7B7B7',
                'menufc': '#5F5F5F',
                'transparente': '#FFFFFF00',
            },
            dropShadow: {
                '3xl': '#8E05C2',
            }
        },
    },

    plugins: [
        forms,
        theme,
        require('flowbite/plugin'),
        require('tailwind-scrollbar')
    ],
};