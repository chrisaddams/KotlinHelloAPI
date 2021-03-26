package com.api.v1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.SpringApplication

@SpringBootApplication
class V1Application

fun main(args: Array<String>) {
	SpringApplication.run(V1Application::class.java, *args)
	println("Hello world")
}