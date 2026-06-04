package com.example.joyous

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.joyous.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Login button click - go to MainActivity
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Sign up text click - show signup form (optional)
        binding.txtSignup.setOnClickListener {
            // You can add signup functionality here if needed
            // For now, just show a toast
            android.widget.Toast.makeText(this, "Sign up feature coming soon!", android.widget.Toast.LENGTH_SHORT).show()
        }
    }
}