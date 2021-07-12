package com.test.scb.summerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    var etName:EditText? = null
    var etEmail: EditText? = null
    var etSurname: EditText? = null
    var tiName:TextInputLayout? = null
    var tiEmail: TextInputLayout? = null
    var tiSurname: TextInputLayout? = null
    var button1: Button? = null
    var button2: Button? = null
    var button3: Button? = null
    var button4: Button? = null
    var btnNext:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        saveData()
        red1()
        red2()
        red3()
        next()

    }


    private fun initView() {
        if (etName == null)
            etName = findViewById(R.id.et_name)
        if (etEmail == null)
            etEmail = findViewById(R.id.et_email)
        if (etSurname == null)
            etSurname = findViewById(R.id.et_surname)
        if (tiName == null)
            tiName = findViewById(R.id.ti_name)
        if (tiEmail == null)
            tiEmail = findViewById(R.id.ti_email)
        if (tiSurname == null)
            tiSurname = findViewById(R.id.ti_surname)
        if (button1 == null)
            button1 = findViewById(R.id.button1)
        if (button2 == null)
            button2 = findViewById(R.id.button2)
        if (button3 == null)
            button3 = findViewById(R.id.button3)
        if (button4 == null)
            button4 = findViewById(R.id.button4)
        if (btnNext == null)
            btnNext = findViewById(R.id.btnNext)
    }
    private fun saveData(){
        button1?.setOnClickListener {
            etName?.isFocusable = false
            etName?.isLongClickable=false
            etEmail?.isFocusable=false
            etEmail?.isLongClickable=false
            etSurname?.isFocusable=false
            etSurname?.isLongClickable=false
        }
    }
    private fun red1(){
        button2?.setOnClickListener {
            etName?.isFocusableInTouchMode=true
            etName?.isLongClickable=true
        }
    }
    private fun red2(){
        button3?.setOnClickListener {
            etEmail?.isFocusableInTouchMode=true
            etEmail?.isLongClickable=true
        }
    }
    private fun red3(){
        button4?.setOnClickListener {
            etSurname?.isFocusableInTouchMode=true
            etSurname?.isLongClickable=true
        }
    }
    private fun next(){
        btnNext?.setOnClickListener {
            val action = Intent(this,Activity2::class.java)
            startActivity(action)
        }
    }

}
class SecondActivity : AppCompatActivity() {
    var button: Button?=null
    var etName: EditText? = null
    var etEmail: EditText? = null
    var etSurname: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        initVew()
        deleteData()
    }
    private fun initVew(){
        if (button == null)
            button = findViewById(R.id.button2act)
        if (etName == null)
            etName = findViewById(R.id.et_name)
        if (etEmail == null)
            etEmail = findViewById(R.id.et_email)
        if (etSurname == null)
            etSurname = findViewById(R.id.et_surname)
    }
    private fun deleteData(){
        button?.setOnClickListener {
            etEmail?.setText("")
            etName?.setText("")
            etSurname?.setText("")
            val action = Intent(this,MainActivity::class.java)
            startActivity(action)
        }
    }
}
