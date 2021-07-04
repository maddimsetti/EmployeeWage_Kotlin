package com.bridgelabz.kotlinprograms.employeewage

import kotlin.math.abs
import kotlin.random.Random

fun main(args: Array<String>) {
    println("Welcome To the Employee Wage Computation In Kotlin Language")

    //UC 1: Checking Employee Presence
    val absent = 0   //Initialize the Variable
    val empCheck = Random.nextInt(2)   //Checking with random Number
    if (empCheck == absent) println("Employee is Absent") else println("Employee is Present")
}