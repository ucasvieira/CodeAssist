<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        Schema::create('bloco', function (Blueprint $table) {
            $table->id();
            $table->unsignedBigInteger('iduser')->nullable();
            $table->unsignedBigInteger('idmodulo')->nullable();
            $table->string('nome');
            $table->mediumText('codigo')->nullable();
            $table->timestamps();
            $table->foreign('idmodulo')->references('id')->on('modulo_blocos');
            $table->foreign('iduser')->references('id')->on('users');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('bloco');
    }
};
