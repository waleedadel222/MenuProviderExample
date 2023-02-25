package com.waleed.optionmenuproviderexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.core.view.MenuProvider

class SecondMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_menu)

        setupMenu()
    }

    private fun setupMenu() {

        // in the activity , no need for the menu host because android already know who is the host
        // you just assign the menu provider directly to your activity
        addMenuProvider(object : MenuProvider {

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
        }
        )
    }
}