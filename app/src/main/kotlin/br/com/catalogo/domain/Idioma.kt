package br.com.catalogo.domain

import java.time.LocalDateTime

data class Idioma(
    val id: Int,
    val name: String,
    val dataAtualizaçao: LocalDateTime
)
