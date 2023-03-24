package com.receitas

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReceitasApplication

fun main(args: Array<String>) {
	runApplication<ReceitasApplication>(*args)

	println("hello word")
}
