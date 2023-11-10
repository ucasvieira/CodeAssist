<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class links extends Model
{
    use HasFactory;

    protected $table = 'links'; // Nome da tabela no banco de dados

    protected $fillable = [
        'iduser', 'nome', 'url'
    ];

    public function user()
    {
        return $this->belongsTo(User::class, 'iduser', 'id');
    }
}
