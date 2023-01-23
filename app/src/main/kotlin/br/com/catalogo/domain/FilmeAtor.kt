package br.com.catalogo.domain

import java.time.LocalDateTime

data class FilmeAtor (
    val id: Int,
    val ator : Ator,
    val filme : Filme,
    val dataAtualizacao: LocalDateTime
)