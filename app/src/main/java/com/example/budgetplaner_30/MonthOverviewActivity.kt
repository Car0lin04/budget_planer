package com.example.budgetplaner_30

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.budgetplaner_30.databinding.ActivityIntroBinding
import com.example.budgetplaner_30.databinding.ActivityMonthOverviewBinding

class MonthOverviewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMonthOverviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMonthOverviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
