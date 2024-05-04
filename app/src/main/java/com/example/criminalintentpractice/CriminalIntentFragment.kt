package com.example.criminalintentpractice

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import com.example.criminalintentpractice.models.CrimeModel

class CriminalIntentFragment : Fragment() {
    private lateinit var viewHolder: ViewHolder
    private val crime = CrimeModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_crime, container, false)
        viewHolder = ViewHolder(view)
        return view
    }

    inner class ViewHolder(view: View) {
        private val crimeTitle: TextView = view.findViewById(R.id.crime_title)
        private val editText: EditText = view.findViewById(R.id.crime_title_edit_text)
        private val dateButton: Button = view.findViewById(R.id.crime_date_button)
        private val crimeSolvedCheckbox: CheckBox = view.findViewById(R.id.crime_solved_checkbox)

        init {
            editText.doOnTextChanged { text, start, before, count ->
                crimeTitle.text = text
            }

            dateButton.text = crime.date.toString()

            crimeSolvedCheckbox.setOnCheckedChangeListener { buttonView, isChecked ->
                crime.solved = isChecked
                Log.d("CriminalIntentFragment", "Checked: $isChecked")
            }
        }
    }
}