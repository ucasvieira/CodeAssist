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
        Schema::create('tarefa', function (Blueprint $table) {
            $table->id();
            $table->unsignedBigInteger('idlista');
            $table->string('descrição');
            $table->boolean('feita');
            $table->timestamp('data_conclusao')->nullable(); // Campo de data e hora para armazenar a data de conclusão
            $table->timestamps();
            $table->foreign('idlista')->references('id')->on('lista_tarefa');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('tarefa');
        
    }
};
