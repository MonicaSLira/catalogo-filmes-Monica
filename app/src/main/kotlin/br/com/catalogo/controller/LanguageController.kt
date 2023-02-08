package br.com.catalogo.controller

import br.com.catalogo.domain.Language
import br.com.catalogo.services.LanguageService
import io.micronaut.http.annotation.*

@Controller("/language")
class LanguageController {

    val languageService = LanguageService()

    @Post
    fun create(language: Language) {  //coloca em memória
        println(language)


    }


    @Put
    fun update(language: Language) { //procura e atualiza
    println(language)
    }

    @Delete("/{id}")
    fun delete(id: Int) {
        println("DELETE: $id")
    }

    @Get
    fun findAll() {


        //return listOf(Language)
    }


    @Get("/{id}")
    fun findById(id: Int) {
        println("GET_BY_ID: $id")
    }

}