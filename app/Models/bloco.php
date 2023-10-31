<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class bloco extends Model
{
    protected $table = 'bloco';

    protected $fillable = ['nome','idmodulo','codigo'];

}
