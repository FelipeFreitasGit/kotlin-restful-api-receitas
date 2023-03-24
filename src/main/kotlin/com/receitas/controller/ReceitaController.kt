package com.receitas.controller

import com.receitas.controller.response.ReceitaResponse
import com.receitas.convert.toResponse
import com.receitas.service.ReceitaService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("receita")
class ReceitaController(
    private val receitaService: ReceitaService,
) {

    @GetMapping
    fun getReceitas(): List<ReceitaResponse> {
        return receitaService.getReceitas().map { it.toResponse() }
    }

}