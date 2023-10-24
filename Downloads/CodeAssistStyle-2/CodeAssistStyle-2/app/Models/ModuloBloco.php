<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class ModuloBloco extends Model
{
    use HasFactory;

    protected $fillable = ['nome', 'linguagem', 'iduser'];

    public function user()
    {
        return $this->belongsTo(User::class, 'iduser');
    }
}
