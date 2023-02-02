package br.com.catalogo.controller

import br.com.catalogo.services.PaísServices
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/País")
class PaísController {

    val paísServices = PaísServices()

        @Get
        fun getPaís() = paísServices.getAll()

}
