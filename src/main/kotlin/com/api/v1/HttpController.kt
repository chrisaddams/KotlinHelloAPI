package com.api.v1

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/api")
class HelloController(val helloService: HelloService){
    @GetMapping("/hello/")
    fun hello(): String{
    return helloService.getHello()
    }
}