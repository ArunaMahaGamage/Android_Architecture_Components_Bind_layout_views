package com.example.bindlayoutviewstoarchitecturecomponents

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserModel : ViewModel {
    val userLiveData: MutableLiveData<User> = MutableLiveData<User>()

    constructor() {
        // trigger user load.
        doAction()
    }

    fun doAction() {
        // depending on the action, do necessary business logic calls and update the
        // userLiveData.
        // Do api Call
        val user = User()
        user.firstName = "Aruna"
        user.lastName = "Gamage"
        user.age = 31
        userLiveData.postValue(user)
    }
}