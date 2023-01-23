package br.com.catalogo.domain

import java.time.LocalDateTime


data class Aluguel(
    val id: Int,
    val dataSaida: LocalDateTime ,
    val idProduto: Int,
    val idCliente: Int,
    val dataRetorno: LocalDateTime,
    val idFunc: Int,
    val dataAtualizaçao: LocalDateTime
)
