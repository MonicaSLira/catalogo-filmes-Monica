package br.com.catalogo.domain

import java.time.LocalDateTime

data class FilmeCategoria (
    val Filme : Filme,
    val categoria : Categoria,
    val dataAtualizacao: LocalDateTime
)