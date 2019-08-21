package com.samnagaraj.example.basic


fun main(args: Array<String>) {
elseifExample(80)
    whenExample(40)
}

private fun elseifExample(examMarks:Int){
    if(examMarks==100){
        println("Scored full mark!")
    }else if(examMarks <= 99 && examMarks >=91){
        println("Scored really good marks in exam.")
    }else if(examMarks <=90 && examMarks >=75){
        println("Scored good marks")
    }else if(examMarks >=60){
        println("Scored ok marks")
    }else{
        println("Failed in exam")
    }
}

private fun whenExample(examMarks: Int) {
    when(examMarks){
        100-> println("Scored full mark!")
        in 91..99 -> println("Scored really good marks in exam.")
        in 75..90 -> println("Scored good marks")
        in 60..74 -> println("Scored ok marks")
        else -> println("Failed in exam")
    }
}