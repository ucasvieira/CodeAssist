FROM php:8.1-apache

WORKDIR /var/www/html

COPY . .

RUN apt-get update && apt-get install -y \
    unzip \
    libzip-dev \
    && docker-php-ext-install zip \
    && php -r "copy('https://getcomposer.org/installer', 'composer-setup.php');" \
    && php composer-setup.php --install-dir=/usr/local/bin --filename=composer \
    && php -r "unlink('composer-setup.php');" \
    && composer install --no-scripts --no-autoloader --prefer-dist

RUN a2enmod rewrite
COPY ./docker/apache/000-default.conf /etc/apache2/sites-available/
ENV APACHE_DOCUMENT_ROOT /var/www/html/public

RUN php artisan key:generate \
    && composer dump-autoload \
    && php artisan config:cache \
    && php artisan route:cache \
    && php artisan view:cache

RUN npm install

EXPOSE 80

CMD ["apache2-foreground"]