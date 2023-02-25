package com.waleed.optionmenuproviderexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.core.view.MenuProvider
import androidx.lifecycle.Lifecycle

class MainActivity : AppCompatActivity(), MenuProvider {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // register menu directly to the activity
        // no need for the lifecycle owner or state here in the activity
        addMenuProvider(this)
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