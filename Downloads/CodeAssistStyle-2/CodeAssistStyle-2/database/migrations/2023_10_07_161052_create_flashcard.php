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
        Schema::create('flashcard', function (Blueprint $table) {
            $table->id();
            $table->unsignedBigInteger('idgrupo');
            $table->string('pergunta');
            $table->string('resposta');
            $table->enum('saber',['sei','nsei','duvida'])->nullable();
            $table->timestamps();
            $table->foreign('idgrupo')->references('id')->on('grupo_flashcard');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('flashcard');
    }
};
