package br.com.catalogo.domain

import java.time.LocalDateTime

data class Endereco(
    val id : Int,
    val endereco : String,
    val enderecoCompl: String,
    val regiao : String,
    val cidade : Cidade,
    val cep : String,
    val telefone : String,
    val dataAtualizaçao: LocalDateTime


)
