package com.mercadolivro.controller

import com.mercadolivro.controller.request.PostCustomerRequest
import com.mercadolivro.model.CustomerModel
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("customer")
class CustomerController {

    @GetMapping
    fun getCustomer(): CustomerModel{
        return CustomerModel("1","Denise","email@gmail.com")
    }

    @PostMapping //ação de cadastro do usúario
    @ResponseStatus(HttpStatus.CREATED) //alterando status do retorno
    fun criar(@RequestBody customer: PostCustomerRequest) {
        println(customer)
    }



}