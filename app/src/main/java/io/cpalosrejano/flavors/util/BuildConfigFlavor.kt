package io.cpalosrejano.flavors.util

import io.cpalosrejano.flavors.BuildConfig

object BuildConfigFlavor {

    val email: String
    val apiKey: String
    val apiUrl: String

    init {
        if (BuildConfig.DEBUG) {
            email = BuildConfig.EMAIL
            apiKey = BuildConfig.API_KEY_DEBUG
            apiUrl = BuildConfig.API_URL_DEBUG

        } else {
            email = BuildConfig.EMAIL
            apiKey = BuildConfig.API_KEY
            apiUrl = BuildConfig.API_URL
        }
    }
}