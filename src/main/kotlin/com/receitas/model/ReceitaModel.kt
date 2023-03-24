package com.receitas.model

import javax.persistence.*

@Entity(name = "receita")
data class ReceitaModel (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column
    var nome: String
)