package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView
    lateinit var nameEditText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        nameEditText = findViewById<EditText>(R.id.nameEditText)

        
        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            if (nameEditText.text.isEmpty()) {
                nameEditText.error = "Name cannot be empty!"
                displayTextView.text = "Hello World!"
            } else {
                displayTextView.text = "Hello, ${nameEditText.text}"
            }

        }


    }
}