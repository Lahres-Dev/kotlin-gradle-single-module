package com.github.lahresdev.kgsm

import com.github.lahresdev.kgsm.dataobjects.Input
import com.github.lahresdev.kgsm.enums.Gender

fun main() {
    val person = Input(name = "Jack", age = 22, gender = Gender.MALE)
    println("Hello ${person.name}. You're ${person.age} years old, and your gender is ${person.gender}.")
}
