package com.example.budgetplaner_30

import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.budgetplaner_30.databinding.ActivityMainBinding
import com.google.android.material.button.MaterialButton


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val email: TextView = findViewById(R.id.emailLayout)
        val password: TextView = findViewById(R.id.password)

        val loginbtn = findViewById<MaterialButton>(R.id.loginbtn)

        //admin and admin

        loginbtn.setOnClickListener {
            if(email.text.toString().equals("admin") && password.text.toString().equals("admin")){
                //correct
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
            }else{
                //incorrect
                Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT).show()
            }
        }





    }

}