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
        Schema::create('grupo_flashcard', function (Blueprint $table) {
            $table->id();
            $table->unsignedBigInteger('iduser');
            $table->string('nome');
            $table->enum('conhecimento',['muito','medio','pouco','nada']);
            $table->timestamps();
            $table->foreign('iduser')->references('id')->on('users');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('grupo_flashcard');
    }
};
