package com.example.joyous

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class EventDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_detail)

        // Initialize views using findViewById
        val eventImage = findViewById<ImageView>(R.id.eventImage)
        val eventTitle = findViewById<TextView>(R.id.txt_culhead1)
        val eventDate = findViewById<TextView>(R.id.event_Date)
        val eventLocation = findViewById<TextView>(R.id.txt_eventLocation)
        val eventDescription = findViewById<TextView>(R.id.txt_eventDescription)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        // Get data from intent
        val eventTitleText = intent.getStringExtra("event_title") ?: ""
        val eventDateText = intent.getStringExtra("event_date") ?: ""
        val eventLocationText = intent.getStringExtra("event_location") ?: ""
        val eventDescriptionText = intent.getStringExtra("event_description") ?: ""
        val eventImageRes = intent.getIntExtra("event_image", R.drawable.perahera)

        // Set up the data
        eventImage.setImageResource(eventImageRes)
        eventTitle.text = eventTitleText
        eventDate.text = eventDateText
        eventLocation.text = eventLocationText
        eventDescription.text = eventDescriptionText

        // Set up back button
        toolbar.setNavigationOnClickListener {
            finish()
        }
    }
}