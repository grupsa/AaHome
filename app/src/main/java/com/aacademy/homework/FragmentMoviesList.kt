package com.aacademy.homework

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.NavUtils
import androidx.fragment.app.Fragment

class FragmentMoviesList : Fragment() {

    companion object {
        fun newInstance() = FragmentMoviesList()
    }

    private var navigator: Navigator? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movies_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val avengers = view.findViewById<View>(R.id.item_avengers)
        avengers.setOnClickListener { navigator?.openScreen() }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        navigator = context as? Navigator
    }

    override fun onDetach() {
        navigator = null
        super.onDetach()
    }
}
