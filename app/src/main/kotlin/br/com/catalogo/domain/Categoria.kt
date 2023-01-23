package br.com.catalogo.domain

import java.time.LocalDateTime

data class Categoria (
    val filme : Filme,
    val categoria: Categoria,
    val dataAtualizaçao: LocalDateTime
)