package com.example.warm_eva2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.warm_eva2.Nav_activity
import com.example.warm_eva2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textusername = findViewById<EditText>(R.id.id_username)
        val textpassword = findViewById<EditText>(R.id.id_password)
        val buttonlogin = findViewById<Button>(R.id.button_login)

        buttonlogin.setOnClickListener {
            val username = textusername.text.toString()
            val password = textpassword.text.toString()

            if (isValidCredentials(username,password)) {
                val intent = Intent(this, Nav_activity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Credenciales Incorrectas", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isValidCredentials(username: String, password: String): Boolean {

        val validUsername = "admin"
        val validPassword = "123456"

        return username == validUsername && password == validPassword
    }
}