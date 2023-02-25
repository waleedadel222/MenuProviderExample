package com.waleed.optionmenuproviderexample

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.lifecycle.Lifecycle


class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_second, container, false)

        // just another way to set menu to the fragment
        // using separated  function to create the menu host
        // add set the menu provider to the fragment or activity
        setupMenu()


        return rootView
    }

    private fun setupMenu() {

        // in the Fragment , you need to tell the android who will be the host of your menu
        (requireActivity() as MenuHost).addMenuProvider(object : MenuProvider {

            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
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
                    else -> false
                }
            }
        }, viewLifecycleOwner, Lifecycle.State.RESUMED)
    }

}