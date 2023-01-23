package br.com.catalogo.domain

import java.time.LocalDateTime

data class Estoque(
    val id: Int,
    val name: String,
    val endereco: String,
    val dataAtualizaçao: LocalDateTime
)
