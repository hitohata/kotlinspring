package com.example.kotlinspring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
public class SampleController {

    @GetMapping("/")
    fun getHello() :String {
        return "Hello World"
    }
}
