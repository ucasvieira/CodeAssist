<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class material extends Model
{
    use HasFactory;

    protected $table = 'material'; // Nome da tabela no banco de dados

    protected $fillable = [
        'iduser', 'nome', 'tipo', 'path'
    ];

    // Defina as relações, se necessário
    public function user()
    {
        return $this->belongsTo(User::class, 'iduser', 'id');
    }
}
