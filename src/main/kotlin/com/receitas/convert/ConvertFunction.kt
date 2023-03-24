package com.receitas.convert

import com.receitas.controller.response.ReceitaResponse
import com.receitas.model.ReceitaModel

fun ReceitaModel.toResponse(): ReceitaResponse {
    return ReceitaResponse(
        id = this.id,
        nome = this.nome
    )
}