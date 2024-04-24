package com.example.budgetplaner_30.ui.standingOrders

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.budgetplaner_30.databinding.FragmentStandingOrdersBinding

class StandingOrdersFragment : Fragment() {

    private var _binding: FragmentStandingOrdersBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val standingOrdersViewModel =
            ViewModelProvider(this).get(StandingOrdersViewModel::class.java)

        _binding = FragmentStandingOrdersBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textStandingOrders
        standingOrdersViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}