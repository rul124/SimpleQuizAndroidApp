package com.example.simplequizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btn_start)
        val etName : EditText = findViewById(R.id.et_name)

        btnStart.setOnClickListener{
            // check if the input is empty
            if(etName.text.isNotEmpty()) {
                // move to another screen
                    // this will move from this to another file
                val intent = Intent(this, QuizQuestionsActivity::class.java)

                // pass data
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
                // close the current screen
                finish()
            } else {
                Toast.makeText(this,
                    "Please enter your name!", Toast.LENGTH_LONG).show()
            }
        }
    }
}