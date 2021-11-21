package com.example.demok8s

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @Value("\${named}")
    var named: String? = null

    @GetMapping("/test", produces = ["application/json"])
    fun getHello(): String = "Hello my $named"
}