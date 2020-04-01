package com.example.crimeroomdata.viewmodel

import androidx.lifecycle.ViewModel
import com.example.crimeroomdata.database.CrimeRepository
import com.example.crimeroomdata.model.Crime
import java.util.*

class CrimeListViewModel: ViewModel() {

    private val crimeRepository = CrimeRepository.get()
    val crimesListLiveData = crimeRepository.getCrimes()

    fun addCrime(crime: Crime){
        crimeRepository.addCrime(crime)
    }
}