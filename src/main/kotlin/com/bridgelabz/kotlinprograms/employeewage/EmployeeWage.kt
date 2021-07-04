package com.bridgelabz.kotlinprograms.employeewage

import kotlin.random.Random

const val PARTTIME: Int = 1
const val FULLTIME: Int = 2
const val WAGE_PER_HOUR = 20
fun main(args: Array<String>) {
    println("Welcome To the Employee Wage Computation In Kotlin Language")

    //Initialize the Variable
    var empWorkingHours = 0
    val empCheck = Random.nextInt(3)   //Checking with random Number

    empWorkingHours = when(empCheck) {
        PARTTIME -> 4
        FULLTIME -> 8
        else -> 0
    }
    var dailyEmployeeWage = WAGE_PER_HOUR * empWorkingHours
    println("Daily Employee Wage : $dailyEmployeeWage")
}