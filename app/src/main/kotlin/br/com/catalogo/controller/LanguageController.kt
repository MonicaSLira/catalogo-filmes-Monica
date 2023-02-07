package br.com.catalogo.controller

import br.com.catalogo.domain.Language
import br.com.catalogo.services.LanguageService
import com.sun.org.apache.xml.internal.security.Init
import io.micronaut.http.HttpResponse
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.*

@Controller("/language")
class LanguageController {

    val languageService = LanguageService()
    @Post
    fun create(language: Language): MutableHttpResponse<Init>? {  //coloca em memória
        println(language)

        try {
            if (language.name != ("")) throw Exception("nome invalido")
        }catch(ex:Exception){
            println(ex.message)
            return HttpResponse.badRequest()
        }
        return HttpResponse.ok()
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