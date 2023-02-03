package br.com.catalogo.domain

data class Language(
    val id: Int? = null,
    val name: String,
    val lastUpdate = LocalDateTime
)
