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
        Schema::create('modulo_blocos', function (Blueprint $table) {
            $table->id();
            $table->unsignedBigInteger('iduser');
            $table->enum('linguagem',['sql','php','htmlmixed','python','javascript','xml','css','texto']);
            $table->timestamps();
            $table->foreign('iduser')->references('id')->on('users');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('modulo_blocos');
    }
};
