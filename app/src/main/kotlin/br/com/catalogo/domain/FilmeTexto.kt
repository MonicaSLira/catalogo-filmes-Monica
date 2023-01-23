package br.com.catalogo.domain

import java.time.LocalDateTime

data class FilmeTexto (
    val id: Int,
    val titulo: String,
    val descricao: LocalDateTime
)