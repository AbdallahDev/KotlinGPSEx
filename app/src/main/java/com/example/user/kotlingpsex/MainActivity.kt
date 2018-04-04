package com.example.user.kotlingpsex

import android.content.Context
import android.content.Intent
import android.location.LocationManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            var manager = getSystemService(Context.LOCATION_SERVICE)
                    as LocationManager

            if (manager.isProviderEnabled(LocationManager.GPS_PROVIDER))
                textView.text = "GPS is on"
            else {
                var i = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
                startActivity(i)
            }

        }
    }
}
