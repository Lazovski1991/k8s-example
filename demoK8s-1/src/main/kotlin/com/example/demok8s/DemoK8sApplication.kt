package com.example.demok8s

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoK8sApplication

fun main(args: Array<String>) {
    runApplication<DemoK8sApplication>(*args)
}
