package com.mobiledestroyers.beerme.activities

import com.google.firebase.database.DatabaseReference

interface Callback {

    fun onSignout()
    fun onGetUserId(): String
    fun getUserDatabase(): DatabaseReference
    fun getChatDatabase(): DatabaseReference
    fun profileComplete()
    fun startActivityForPhoto()
}