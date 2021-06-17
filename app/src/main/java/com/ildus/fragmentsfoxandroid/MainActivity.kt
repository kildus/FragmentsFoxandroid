package com.ildus.fragmentsfoxandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentContainerView
import com.ildus.fragmentsfoxandroid.databinding.ActivityMainBinding

const val TAG = "myTag"

class MainActivity : AppCompatActivity() {

//    lateinit var fragmentContainerView: FragmentContainerView
//    lateinit var button1: Button
//    lateinit var button2: Button

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate")

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        fragmentContainerView = findViewById(R.id.fragmentContainerView)
//        button1 = findViewById(R.id.button1)
//        button2 = findViewById(R.id.button2)


    }

    override fun onStart() {
        super.onStart()

        binding.button1.setOnClickListener {
            Log.d(TAG, "button1")

            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainerView, Fragment1())
            fragmentTransaction.commit()

            Toast.makeText(baseContext, "button1", Toast.LENGTH_SHORT).show()
        }

        binding.button2.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainerView, Fragment2())
            fragmentTransaction.commit()
        }
    }

}