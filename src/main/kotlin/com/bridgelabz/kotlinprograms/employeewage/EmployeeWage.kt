package com.bridgelabz.kotlinprograms.employeewage

import kotlin.random.Random

const val PARTTIME = 1
const val FULLTIME = 2
const val WAGE_PER_HOUR = 20
const val PART_TIME_HOURS = 4
const val FULL_TIME_HOURS = 8
const val NO_OF_WORKING_DAYS = 20
const val MAX_HOURS_IN_MONTH = 100

fun getWorkingHours(empCheck: Int): Int {
    return when (empCheck) {
        PARTTIME -> return PART_TIME_HOURS
        FULLTIME -> return FULL_TIME_HOURS
        else -> 0
    }
}

fun main(args: Array<String>) {
    println("Welcome To the Employee Wage Computation In Kotlin Language")

    var totalEmpHours = 0
    var totalWorkingDays = 0
    while (totalEmpHours < MAX_HOURS_IN_MONTH && totalWorkingDays < NO_OF_WORKING_DAYS) {
        totalWorkingDays++
        val empCheck = Random.nextInt(3)   //Checking with random Number
        totalEmpHours += getWorkingHours(empCheck)
    }

    var employeeWage = totalEmpHours * WAGE_PER_HOUR
    println("Total Working Days : $totalWorkingDays ,  Total Working Hours: $totalEmpHours ,  Employee Wage: $employeeWage")
}