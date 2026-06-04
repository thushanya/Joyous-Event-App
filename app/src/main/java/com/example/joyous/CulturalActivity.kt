package com.example.joyous

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class CulturalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cultural)

        // Bottom navigation
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.selectedItemId = R.id.nav_explore // Highlight Explore tab
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.nav_explore -> {

                    true
                }
                R.id.nav_plan -> {
                    val intent = Intent(this, PlanActivity::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.nav_profile -> {
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                else -> false
            }
        }

        val btnPerahera = findViewById<Button>(R.id.btn_perahera)
        val btnKovil = findViewById<Button>(R.id.btn_kovil)

        btnPerahera.setOnClickListener {
            val intent = Intent(this, EventDetailActivity::class.java).apply {
                putExtra("event_title", getString(R.string.kandy_perahara))
                putExtra("event_date", getString(R.string.sep_5_date))
                putExtra("event_location", getString(R.string.kandy_location))
                putExtra("event_description", getString(R.string.kandy_perahera_details))
                putExtra("event_image", R.drawable.perahera)
            }
            startActivity(intent)
        }

        btnKovil.setOnClickListener {
            val intent = Intent(this, EventDetailActivity::class.java).apply {
                putExtra("event_title", getString(R.string.kovil_fest))
                putExtra("event_date", getString(R.string.sep_12_date))
                putExtra("event_location", getString(R.string.colombo_location))
                putExtra("event_description", getString(R.string.kovil_fest_details))
                putExtra("event_image", R.drawable.kovil)
            }
            startActivity(intent)
        }
    }
}