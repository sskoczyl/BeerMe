package com.mobiledestroyers.beerme.activities

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageButton
import com.mobiledestroyers.beerme.R


class StartupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startup)

        val facebookButton = findViewById<View>(R.id.facebook_button) as ImageButton
        facebookButton.setOnClickListener {

                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"))
                startActivity(browserIntent)

        }

        val instagramButton = findViewById<View>(R.id.instagram_button) as ImageButton
        instagramButton.setOnClickListener {

            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com"))
            startActivity(browserIntent)

        }
    }

    fun onLogin(v: View) {
        startActivity(LoginActivity.newIntent(this))
    }

    fun onSignup(v: View) {
        startActivity(SignupActivity.newIntent(this))
    }

    companion object {
        fun newIntent(context: Context?) = Intent(context, StartupActivity::class.java)
    }
}
