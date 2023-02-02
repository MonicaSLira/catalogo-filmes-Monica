package br.com.catalogo


import br.com.catalogo.domain.*
import io.micronaut.runtime.Micronaut.run

import java.time.LocalDateTime

/**
fun validarPaís(){
}
fun validarAtor(){
}
fun validarFilme(){
}
fun validarIdioma(){
}
*/
fun main(args: Array<String>) {
	run(*args)

	/**val brasil = País(
		id = 1,
	    name ="Brasil",
		dataAtualizaçao = LocalDateTime.now()

	)

	val argentina = País (
		id = 2,
		name ="Argentina",
		dataAtualizaçao = LocalDateTime.now()

	)

	val rioDeJaneiro = Cidade (
		id = 1,
		name = "Rio de Janeiro",
		dataAtualizacao = LocalDateTime.now(),
	    país = brasil

	)

	println(brasil)
	println(rioDeJaneiro)

	val tonCruise = Ator (
		id = 1,
		firstName = "Ton",
		lastName = "Cruise",
		dataAtualizacao = LocalDateTime.now()

	)
	println(tonCruise)

	val portugues = Idioma (
		id = 1,
		name = "Portugues",
		dataAtualizaçao = LocalDateTime.now()

	)
	println(portugues)

	val topGun = Filme (
		id = 1,
		titulo = "TopGun",
		descricao = "Ação",
		ano = 1985,
		idioma = portugues,
		duracao = " 2 horas",
		custoAlu = 12.99,
		duracaoFilme = "1h",
		custoAdc = 2.00,
		classificacao = "G",
		caracteristicas = "nada",
		dataAtualizaçao = LocalDateTime.now()
	)

	println(topGun)
*/
}

