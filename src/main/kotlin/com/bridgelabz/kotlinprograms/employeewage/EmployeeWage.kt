package com.bridgelabz.kotlinprograms.employeewage

import kotlin.random.Random

const val ABSENT = 0
const val WAGE_PER_HOUR = 20
fun main(args: Array<String>) {
    println("Welcome To the Employee Wage Computation In Kotlin Language")

    //Initialize the Variable
    var empWorkingHours = 0
    val empCheck = Random.nextInt(2)   //Checking with random Number

    empWorkingHours = if (empCheck == ABSENT) {
        println("Employee is Absent")
        0
    } else {
        println("Employee is Present")
        8
    }
    var dailyEmployeeWage = WAGE_PER_HOUR * empWorkingHours
    println("Daily Employee Wage : $dailyEmployeeWage")
}