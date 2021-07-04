package com.bridgelabz.kotlinprograms.employeewage

import kotlin.random.Random

const val PARTTIME: Int = 1
const val FULLTIME: Int = 2
const val WAGE_PER_HOUR = 20
fun main(args: Array<String>) {
    println("Welcome To the Employee Wage Computation In Kotlin Language")

    //Initialize the Variable
    var empWorkingHours = 0
    val empCheck = Random.nextInt(2)   //Checking with random Number

     empWorkingHours = if (empCheck == PARTTIME) {
        println("Employee is Worked for Part Time")
        4
    } else (if(empCheck == FULLTIME) {
        println("Employee is Worked for Full Time")
        8
    } else {
        println("Employee is Absent")
         0
    }) as Int
    var dailyEmployeeWage = WAGE_PER_HOUR * empWorkingHours
    println("Daily Employee Wage : $dailyEmployeeWage")
}