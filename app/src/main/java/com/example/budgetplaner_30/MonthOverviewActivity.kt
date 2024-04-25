package com.example.budgetplaner_30

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.budgetplaner_30.databinding.ActivityIntroBinding
import com.example.budgetplaner_30.databinding.ActivityMonthOverviewBinding
import com.example.budgetplaner_30.ui.categories.CategoriesViewModel

class MonthOverviewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMonthOverviewBinding
    private lateinit var viewModel: CategoriesViewModel
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMonthOverviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listView = findViewById(R.id.categorien_list)

        viewModel = ViewModelProvider(this).get(CategoriesViewModel::class.java)
        viewModel.categories.observe(this, Observer { categories ->
            listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, categories)
        })

    }
}
