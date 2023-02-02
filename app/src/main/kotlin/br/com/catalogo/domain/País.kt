package br.com.catalogo.domain

import java.time.LocalDateTime

data class País(
    val id: Int,
    val name: String,
    val dataAtualizacao: LocalDateTime
)


