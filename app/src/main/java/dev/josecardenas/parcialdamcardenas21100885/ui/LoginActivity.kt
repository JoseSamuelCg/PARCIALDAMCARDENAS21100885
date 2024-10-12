package dev.josecardenas.parcialdamcardenas21100885.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import dev.josecardenas.parcialdamcardenas21100885.MainActivity
import dev.josecardenas.parcialdamcardenas21100885.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        title = "Sign In"
        val emailSuccess : String = "admin@travelapp.com"
        val passwordSuccess: String = "admin123"
        val etEmail: EditText = findViewById(R.id.etEmail)
        val etPassword: EditText = findViewById(R.id.etPassword)
        val btnSign: Button = findViewById(R.id.btnSign)

        btnSign.setOnClickListener {
            val email: String = etEmail.text.trim().toString()
            val password: String = etPassword.text.trim().toString()
            if (email == emailSuccess && password == passwordSuccess) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            val rootView: View = findViewById(android.R.id.content)
            Snackbar.make(rootView, "Credenciales incorrectas", Snackbar.LENGTH_SHORT).show()
        }
    }
}