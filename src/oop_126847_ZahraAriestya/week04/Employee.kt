package oop_126847_ZahraAriestya.week04

open class Employee(val name: String, val baseSalary: Int) {

    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        // 10% dari baseSalary
        return (baseSalary * 0.1).toInt()
    }
}