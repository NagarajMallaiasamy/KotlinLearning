package com.samnagaraj.example.basic

fun main(args: Array<String>) {
    val greeting ={ name:String ->
        "Hi ${name}"
    }
    sayMorning("Sam",greeting)
}

fun sayMorning(name: String, greeting: (String) -> String) {
    val goodMorning = ", Good Morning"
    println(greeting(name)+goodMorning)
}
