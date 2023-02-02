package br.com.catalogo.domain

import io.micronaut.core.annotation.Introspected
import java.time.LocalDateTime
@Introspected //mapeamento

data class Idioma(
    val id: Int,
    val nome: String,
    val dataAtualizacao: LocalDateTime
)
