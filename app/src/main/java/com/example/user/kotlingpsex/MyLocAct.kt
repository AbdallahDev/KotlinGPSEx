package com.example.user.kotlingpsex

import android.annotation.SuppressLint
import android.content.Context
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_loc.*

class MyLocAct : AppCompatActivity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_loc)

        var manager = getSystemService(Context.LOCATION_SERVICE)
                as LocationManager

        var s = object : LocationListener {
            override fun onLocationChanged(p0: Location) {
                tv_lon.text = "Longitude : " + p0.longitude
                tv_lat.text = "Latitude : " + p0.latitude
            }

            override fun onStatusChanged(p0: String?, p1: Int, p2: Bundle?) {
            }

            override fun onProviderEnabled(p0: String?) {
            }

            override fun onProviderDisabled(p0: String?) {

            }
        }

        manager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0.0F, s)
    }

}
