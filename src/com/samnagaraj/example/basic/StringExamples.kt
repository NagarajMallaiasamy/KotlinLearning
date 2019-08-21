package com.samnagaraj.example.basic

fun main(args: Array<String>) {
    val greeting:String ="Hello World"
    println(greeting.substring(6,9).trim())

    val listString:String="One,Two,Three"
    val data=listString.split(",")
    data.forEach {
        println(it)
    }
}