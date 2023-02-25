package com.waleed.optionmenuproviderexample

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.core.view.MenuProvider
import androidx.lifecycle.Lifecycle


class MainFragmentForMenu : Fragment(), MenuProvider {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_main_for_menu, container, false)



        // register menu to the fragment
        requireActivity().addMenuProvider(this, viewLifecycleOwner, Lifecycle.State.RESUMED)


        return rootView
    }

    override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
        // Add the menu file here
        menuInflater.inflate(R.menu.main_menu, menu)
    }

    override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
        // Handle item selection to do some action
        return when (menuItem.itemId) {
            R.id.menu_one -> {
                // do something
                true
            }
            R.id.menu_two -> {
                // do something
                true
            }
            else -> super.onOptionsItemSelected(menuItem)
        }
    }


}