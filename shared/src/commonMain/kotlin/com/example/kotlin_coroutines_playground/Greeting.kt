package com.example.kotlin_coroutines_playground

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}