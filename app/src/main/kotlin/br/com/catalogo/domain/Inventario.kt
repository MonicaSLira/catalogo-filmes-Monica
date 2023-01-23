package br.com.catalogo.domain

import java.time.LocalDateTime

data class Inventario (
    val id: Int,
    val filme : Filme,
    val loja : Int,
    val dataAtualizaçao: LocalDateTime

)

