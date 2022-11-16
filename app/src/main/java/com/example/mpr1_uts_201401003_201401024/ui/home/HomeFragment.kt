package com.example.mpr1_uts_201401003_201401024.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnTouchListener
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mpr1_uts_201401003_201401024.CardViewCourseAdapter
import com.example.mpr1_uts_201401003_201401024.Course
import com.example.mpr1_uts_201401003_201401024.R
import com.example.mpr1_uts_201401003_201401024.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    lateinit var courses : ArrayList<Course>
    lateinit var rvCourse : RecyclerView

    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.usertextview
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvCourse = view.findViewById(R.id.recyclerview)

        courseData()
        showRecyclerCardView()
    }

    fun showRecyclerCardView() {
        rvCourse.layoutManager = LinearLayoutManager(activity)
        val cardViewCourseAdapter = CardViewCourseAdapter(activity)
        cardViewCourseAdapter.setListCourses(courses)
        rvCourse.adapter=cardViewCourseAdapter
    }


    fun courseData(){
        courses = ArrayList()
        courses.add(Course("Algebra", "xxxxxxx",  R.drawable.ic_baseline_calculate_24,"#d3d3d3" ))
        courses.add(Course("Calculus", "xxxxxxx",  R.drawable.ic_baseline_calculate_24,"#ff7f7f"))
        courses.add(Course("Numerical", "xxxxxxx",  R.drawable.ic_baseline_calculate_24,"#90ee90"))
        courses.add(Course("Vector", "xxxxxxx",  R.drawable.ic_baseline_calculate_24,"#add8e6"))
        courses.add(Course("Algebra 2", "xxxxxxx",  R.drawable.ic_baseline_calculate_24,"#ffd580"))
        courses.add(Course("Algebra 3", "xxxxxxx",  R.drawable.ic_baseline_calculate_24,"#000000"))
    }


}