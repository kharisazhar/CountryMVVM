package com.kharisazhar.country.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.kharisazhar.country.model.Country

class ListViewModel: ViewModel() {

    val countries = MutableLiveData<List<Country>>()
    val countryLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        fetchCountries()
    }

    private fun fetchCountries() {
        val mockData = listOf(
            Country("CountryA"),
            Country("CountryB"),
            Country("CountryB"),
            Country("CountryB"),
            Country("CountryB"),
            Country("CountryB"),
            Country("CountryB"),
            Country("CountryB")
        )

        countryLoadError.value = false
        loading.value = false
        countries.value = mockData
    }
}