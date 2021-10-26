package com.akshayteli.kotlinbottomnavigationusingnavigationcomponent

import android.graphics.Typeface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBar.DISPLAY_SHOW_CUSTOM

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.ActionBar.LayoutParams

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController

        val appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment,R.id.employeeFragment,R.id.aboutUsFragment))

        setupActionBarWithNavController(navController,appBarConfiguration)

        bottomNavigation.setupWithNavController(navController)

//      ---------------------  Center alignment of title
//        supportActionBar?.apply {
//            // show custom title in action bar
//           customView = actionBarCustomTitle()
//
//            displayOptions = DISPLAY_SHOW_CUSTOM
//
//            setDisplayShowHomeEnabled(true)
//            setDisplayUseLogoEnabled(true)
//           // setLogo(R.drawable.ic_camera)
//        }


    }

//    fun actionBarCustomTitle(): TextView? {
//        return TextView(this).apply {
//
//            text = "str"
//
//            val params = LayoutParams(
//                LayoutParams.WRAP_CONTENT,
//                LayoutParams.WRAP_CONTENT
//            )
//            // center align the text view/ action bar title
//            params.gravity = Gravity.CENTER_HORIZONTAL
//            layoutParams = params
//
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                setTextAppearance(
//                    android.R.style.TextAppearance_Material_Widget_ActionBar_Title
//                )
//            }else{
//                // define your own text style
//                setTextSize(TypedValue.COMPLEX_UNIT_SP,17F)
//                setTypeface(null, Typeface.BOLD)
//            }
//        }
//    }
}