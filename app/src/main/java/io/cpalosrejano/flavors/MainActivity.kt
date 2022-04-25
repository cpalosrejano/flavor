package io.cpalosrejano.flavors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import io.cpalosrejano.flavors.util.BuildConfigFlavor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appName = getString(R.string.app_name)

        val email = BuildConfigFlavor.email
        val apiUrl = BuildConfigFlavor.apiUrl
        val apiKey = BuildConfigFlavor.apiKey

        val string =
            "App name: $appName\n" +
            "Email: $email\n\n" +

            "API Url: $apiUrl\n" +
            "API Key: $apiKey"

        findViewById<TextView>(R.id.label).text = string
    }
}