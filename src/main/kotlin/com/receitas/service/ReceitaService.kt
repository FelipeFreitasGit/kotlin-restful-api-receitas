package com.receitas.service

import com.receitas.model.ReceitaModel

interface ReceitaService {

    fun getReceitas(): List<ReceitaModel>
}