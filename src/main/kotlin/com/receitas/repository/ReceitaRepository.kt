package com.receitas.repository

import com.receitas.model.ReceitaModel
import org.springframework.data.repository.CrudRepository

interface ReceitaRepository : CrudRepository<ReceitaModel, Int> {
}