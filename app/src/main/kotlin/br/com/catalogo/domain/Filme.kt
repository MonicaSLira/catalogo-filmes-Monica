package br.com.catalogo.domain

import java.time.LocalDateTime

data class Filme (
    val id: Int,
    val titulo: String,
    val descricao: String,
    val ano: Int,
    val idioma: Idioma,
    val duracao: String,
    val custoAlu: Double,
    val duracaoFilme: String,
    val custoAdc: Double,
    val classificacao: String,
    val caracteristicas: String,
    val dataAtualizacao: LocalDateTime
)







