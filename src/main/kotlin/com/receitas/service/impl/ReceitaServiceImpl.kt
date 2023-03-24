package com.receitas.service.impl

import com.receitas.model.ReceitaModel
import com.receitas.repository.ReceitaRepository
import com.receitas.service.ReceitaService
import org.springframework.stereotype.Service

@Service
class ReceitaServiceImpl(
    private val receitaRepository: ReceitaRepository
): ReceitaService {

    override fun getReceitas(): List<ReceitaModel> {
        return receitaRepository.findAll().toList()
    }
}