package com.example.coolresume

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setting button for work history
        var workHistory = findViewById(R.id.workHistory) as Button
        workHistory.setOnClickListener {
            //setting intent in order to be able to pass on to the next page
            val move =  Intent(getApplicationContext(), WrkHistoryActivity::class.java)
            startActivity(move)
        }
        //making button and toast for email display and sending email
        var emailMateus = findViewById(R.id.emailMateus) as Button
        emailMateus.setOnClickListener {
            var emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.setType("text/plain")
            emailIntent.putExtra(Intent.EXTRA_EMAIL,"mateusouro1@hotmail.com")
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Job Opportunities")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Good Morning Mateus, \n " +
                    " I would like to discuss android developer opportunities with you")
            Toast.makeText(this@MainActivity,"Email: mateusouro1@hotmail.com", Toast.LENGTH_LONG).show()
            startActivity(emailIntent)
        }
        //making button and text display for phone call
        var callMateus = findViewById(R.id.callMateus) as Button
        //displays text
        callMateus.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_CALL)
            callIntent.data = Uri.parse("tel:" +447444004346) //change the number

            startActivity(callIntent)
            Toast.makeText(this@MainActivity, "Calling 07444004346", Toast.LENGTH_SHORT).show()

        }
    }
}