package br.com.catalogo.domain
data class Category(
    val id: Int? = null,
    val name: String,
    val lastUpdate = LocalDateTime
)

