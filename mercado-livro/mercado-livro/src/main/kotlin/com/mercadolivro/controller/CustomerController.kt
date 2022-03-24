package com.mercadolivro.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("customer")
class CustomerController {

    @GetMapping
    fun olaMundo():String{
        return "customer 1"
    }

    @GetMapping( "/1")
    fun olaMundo1():String{
        return "Denise"
    }
}