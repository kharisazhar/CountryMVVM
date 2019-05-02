package com.kharisazhar.country.di

import com.kharisazhar.country.network.CountriesService
import com.kharisazhar.country.viewmodel.ListViewModel
import dagger.Component


@Component(modules = [ApiModule::class])

interface ApiComponent {

    fun inject(services: CountriesService)

    fun inject(viewModel: ListViewModel)
}