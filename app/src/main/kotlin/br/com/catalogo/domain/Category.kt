package br.com.catalogo.domain

import io.micronaut.core.annotation.Introspected
import java.time.LocalDateTime
@Introspected
data class Category(
    val id: Int? = null,
    val name: String,
    val lastUpdate : LocalDateTime

)