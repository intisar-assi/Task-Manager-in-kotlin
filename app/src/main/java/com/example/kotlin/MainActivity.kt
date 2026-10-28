package com.example.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun main () {
        println("==== Task Manager ====")
        val menu = listOf(
            "1. Add Task ",
            "2.Show all Tasks ",
            "3. Search by ID",
            "4.MArk Task AS Done ",
            "5.Delete Task",
            "6. Summary ",
            "0.Exit "
        )
        println("Enter your choice :")
        var choice = readLine()!!.toInt()
        if choice == 1 {

        } else if choice == 2 {

        } else if choice == 3 {

        } else if choice == 4 {

        } else if choice == 5 {

        } else if choice == 6 {

        } else if choice == 0 {

        }
    }
    fun addTask() {
    }
    fun showAllTasks() {
    }
    fun searchById() {
    }
    fun markTaskAsDone() {
    }
    fun deleteTask() {
    }
    fun summary() {
    }

    }

