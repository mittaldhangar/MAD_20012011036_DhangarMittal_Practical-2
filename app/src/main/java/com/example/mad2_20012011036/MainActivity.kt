package com.example.mad2_20012011036

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var mycl: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl = findViewById(R.id.mycl)
        Log.i(TAG, "onCreate function called")
        Toast.makeText(this, "onCreate function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onCreate function called", Snackbar.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onCreate function called")
        Toast.makeText(this, "onCreate function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onCreate function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onCreate function called", Snackbar.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onCreate function called")
        Toast.makeText(this, "onCreate function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onCreate function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onCreate function called", Snackbar.LENGTH_LONG).show()

    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onCreate function called")
        Toast.makeText(this, "onCreate function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onCreate function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onCreate function called", Snackbar.LENGTH_LONG).show()

    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onCreate function called")
        Toast.makeText(this, "onCreate function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onCreate function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onCreate function called", Snackbar.LENGTH_LONG).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onCreate function called")
        Toast.makeText(this, "onCreate function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onCreate function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onCreate function called", Snackbar.LENGTH_LONG).show()
    }
}



