package com.example.kotlinspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
/**
 * Javaドキュメンテーションコメント
 * @author koyama
 * @version 1.0
 */
class KotlinspringApplication

fun main(args: Array<String>) {
    runApplication<KotlinspringApplication>(*args)
}
