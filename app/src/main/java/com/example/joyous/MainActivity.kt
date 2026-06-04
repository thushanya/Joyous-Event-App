package com.example.joyous

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set up bottom navigation
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_view)
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_explore -> {
                    // Navigate to Explore activity
                    val intent = Intent(this, ExploreActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_plan -> {
                    // Navigate to Plan activity
                    val intent = Intent(this, PlanActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_profile -> {
                    // Navigate to Profile activity
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

        val btnPerahera = findViewById<Button>(R.id.btn_perahera)

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


        // Set up category click listeners
        val culturalLayout = findViewById<LinearLayout>(R.id.cat_1)
        val musicLayout = findViewById<LinearLayout>(R.id.cat_2)

        culturalLayout.setOnClickListener {
            val intent = Intent(this, CulturalActivity::class.java)
            startActivity(intent)
        }

        musicLayout.setOnClickListener {
            val intent = Intent(this, MusicActivity::class.java)
            startActivity(intent)
        }
    }
}