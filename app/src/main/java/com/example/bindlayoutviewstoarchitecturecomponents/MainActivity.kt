package com.example.bindlayoutviewstoarchitecturecomponents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.bindlayoutviewstoarchitecturecomponents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        // Inflate view and obtain an instance of the binding class.
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Specify the current activity as the lifecycle owner.
        binding.setLifecycleOwner(this)

        // Obtain the ViewModel component.
        val viewModels = UserModel()
        binding.userViewModel = viewModels

        var view = ObservableViewModel()
        view.addOnPropertyChangedCallback();
        view.notifyChange()

    }
}