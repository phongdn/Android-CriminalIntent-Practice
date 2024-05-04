package com.example.criminalintentpractice

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager

class CriminalIntentActivity : AppCompatActivity() {
    companion object {
        val tag: String = this::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crime)

        var criminalIntentFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container)

        if (criminalIntentFragment == null) {
            criminalIntentFragment = CriminalIntentFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, criminalIntentFragment).commit()
        }
    }
}