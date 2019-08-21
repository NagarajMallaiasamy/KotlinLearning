package com.samnagaraj.example.basic

import java.io.File

fun main(args: Array<String>) {
    val  fileText= File("resources/example1.txt")
            .let {
                println(it.readText())
            }
}