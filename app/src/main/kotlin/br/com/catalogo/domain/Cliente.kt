package br.com.catalogo.domain

import java.time.LocalDateTime

data class Cliente (
    val id : Int,
    val idLoja: Int,
    val firstName : String,
    val lastName : String,
    val email: String,
    val endereco : Endereco,
    val ativo: Boolean,
    val dataIni: LocalDateTime,
    val dataAtualizacao: LocalDateTime



)