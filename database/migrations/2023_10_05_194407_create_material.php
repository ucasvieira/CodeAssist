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
        Schema::create('material', function (Blueprint $table) {
            $table->id();
            $table->unsignedBigInteger("iduser");
            $table->string("nome");
            $table->enum("tipo",['pdf','doc','docx','txt','zip','jpg','jpeg','png','gif','mp4']);
            $table->string("path");
            $table->timestamps();
            $table->foreign('iduser')->references('id')->on('users')->onDelete('cascade')->onUpdate('cascade');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('material');
    }
};
