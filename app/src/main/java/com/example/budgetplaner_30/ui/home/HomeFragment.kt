package com.example.budgetplaner_30.ui.home
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.budgetplaner_30.MonthOverviewActivity
import com.example.budgetplaner_30.databinding.FragmentHomeBinding
/*class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}*/
class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        //binding.lifecycleOwner = this
        //binding.lifecycleOwner = viewLifecycleOwner


        // ImageButton Click Event zuweisen
        binding.januaryImage.setOnClickListener {
            navigateToMonthOverviewActivity()
        }

        return binding.root
    }

    private fun navigateToMonthOverviewActivity() {
        val intent = Intent(activity, MonthOverviewActivity::class.java)
        startActivity(intent)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Wenn Sie eine nullable Binding-Variable verwenden
        //binding = null
    }
}

 