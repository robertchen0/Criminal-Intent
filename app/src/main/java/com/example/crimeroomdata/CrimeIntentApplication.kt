package com.example.crimeroomdata

import android.app.Application
import com.example.crimeroomdata.database.CrimeRepository

class CrimeIntentApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}