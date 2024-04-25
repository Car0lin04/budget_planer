package com.example.budgetplaner_30.ui.categories

import android.os.Bundle
import android.text.InputType
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import com.example.budgetplaner_30.R
import com.example.budgetplaner_30.databinding.FragmentCategoriesBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CategoriesFragment : Fragment() {



    private var _binding: FragmentCategoriesBinding? = null
    private lateinit var categorienList: ListView
    private lateinit var fab: FloatingActionButton
    private lateinit var categorienItems: ArrayList<String>
    private lateinit var itemAdapter: ArrayAdapter<String>

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val categoriesViewModel =
            ViewModelProvider(this).get(CategoriesViewModel::class.java)

        _binding = FragmentCategoriesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        categorienList = root.findViewById(R.id.categorien_list)
        fab = root.findViewById(R.id.categorie_add_btn)
        categorienItems = ArrayList()

        categorienItems.add("Lebensmittel")
        categorienItems.add("Haushalt")

        itemAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, categorienItems)
        categorienList.adapter = itemAdapter //Verknüpfung mit ListView

        categorienList.setOnItemLongClickListener { _, _, position, _ ->
            categorienItems.removeAt(position)
            itemAdapter.notifyDataSetChanged()
            true
        }

        fab.setOnClickListener {
            var builder = this.context?.let { it1 -> AlertDialog.Builder(it1) }
            if (builder != null) {
                builder.setTitle("Hinzufügen")
            }

            var input = EditText(this.context)
            input.hint = "Text eingeben"
            input.inputType = InputType.TYPE_CLASS_TEXT

            if (builder != null) {
                builder.setView(input)
            }
            if (builder != null) {
                builder.setPositiveButton("OK") { _, _ ->
                    categorienItems.add(input.text.toString())
                    itemAdapter.notifyDataSetChanged()
                }
            }


            if (builder != null) {
                builder.show()
            }

        }

        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
