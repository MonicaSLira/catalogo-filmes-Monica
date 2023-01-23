package br.com.catalogo.domain

import java.time.LocalDateTime

data class Cidade (
    val id: Int,
    val name : String,
    val país : País,
    val dataAtualizacao: LocalDateTime

 )