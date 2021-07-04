package com.bridgelabz.kotlinprograms.employeewage

import kotlin.random.Random

const val PARTTIME: Int = 1
const val FULLTIME: Int = 2
const val WAGE_PER_HOUR = 20
const val PART_TIME_HOURS = 4
const val FULL_TIME_HOURS = 8

//Initialize the Variable
var empWorkingHours = 0
val empCheck = Random.nextInt(3)   //Checking with random Number

fun getWorkingHours(): Int {
    empWorkingHours = when(empCheck) {
        PARTTIME -> 4
        FULLTIME -> 8
        else -> 0
    }
    return  empWorkingHours
}

fun main(args: Array<String>) {
    println("Welcome To the Employee Wage Computation In Kotlin Language")

    var empHours = getWorkingHours()

    var employeeWage = empHours * WAGE_PER_HOUR
    println("Hours: $empHours   Employee Wage: $employeeWage")
}