package com.kharisazhar.country.network

import com.kharisazhar.country.di.DaggerApiComponent
import com.kharisazhar.country.model.Country
import io.reactivex.Single
import javax.inject.Inject

class CountriesService {

    @Inject
    lateinit var api: CountriesApi

    init {
        DaggerApiComponent.create().inject(this)
    }

    fun getCountries(): Single<List<Country>> {
        return api.getCountries()
    }

}