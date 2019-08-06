package com.example.calculatorapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    //Show number on textview
    fun btnOnClickNum (view: View){

        val btnSelected = view as Button
        var num = ""
        when (btnSelected.id) {
            button1.id -> num = "1"
            button2.id -> num = "2"
            button3.id -> num = "3"
            button4.id -> num = "4"
            button5.id -> num = "5"
            button6.id -> num = "6"
            button7.id -> num = "7"
            button8.id -> num = "8"
            button9.id -> num = "9"
            button0.id -> num = "0"

        }
        //Show to Result
        tvResult.append(num)
    }

    //Save the 1st number and operator using global variable
    fun btnOnClickOperation (view: View){

        val btnSelected = view as Button
        var op = ""
        when (btnSelected.id) {
            btnSlash.id -> op = "/"
            buttonStar.id -> op = "*"
            buttonMinus.id -> op = "-"
            buttonPlus.id -> op = "+"
            buttonDot.id -> op = "."

        }
        //Show to Result
        tvResult.append(op)

    }


    //Get second number and calculate
    fun btnOnClickEqual (view: View){

    }

}

