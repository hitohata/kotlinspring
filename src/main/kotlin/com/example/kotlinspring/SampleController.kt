package com.example.kotlinspring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
public class SampleController {

    @GetMapping("/")
    fun getHello() :String {
        var a: String = "abc"
        return "Hello World"
    }
}
