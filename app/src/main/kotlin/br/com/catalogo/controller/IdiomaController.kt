package br.com.catalogo.controller

import br.com.catalogo.domain.Idioma
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post


@Controller("/idioma")
class IdiomaController {

    @Post
    fun create(idioma: Idioma){
       println(idioma)
    }

}

