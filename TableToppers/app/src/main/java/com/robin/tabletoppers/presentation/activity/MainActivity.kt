package com.robin.tabletoppers.presentation.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBar
import android.view.MenuItem
import com.robin.tabletoppers.R
import com.robin.tabletoppers.presentation.fragments.BaseFragment
import com.robin.tabletoppers.presentation.fragments.GezelschapsspelFragment
import com.robin.tabletoppers.presentation.fragments.LoginFragment
import com.robin.tabletoppers.presentation.fragments.RegistreerFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),
    GezelschapsspelFragment.OnFragmentInteractionListener,
    LoginFragment.OnFragmentInteractionListener,
    RegistreerFragment.OnFragmentInteractionListener {

    private lateinit var mDrawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // custom viewbar instellen, nodig voor de menuknop die de drawer opent
        setSupportActionBar(findViewById(R.id.toolbar))

        // de menuknop toevoegen
        val actionbar: ActionBar? = supportActionBar
        actionbar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_menu)
        }

        mDrawerLayout = findViewById(R.id.drawer_layout)

    }

    override fun onStart() {
        super.onStart()
        viewpager_main.setSwipePagingEnabled(false)
        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener {
            //item als 'selected' aanduiden om te highlighten
            it.isChecked = true
            // drawer sluiten als item werd geklikt
            mDrawerLayout.closeDrawers()

            when (it.itemId) {
                R.id.navigation_item_alle_gezelschapsspelen -> {
                    viewpager_main.currentItem = BaseFragment.GEZELSCHAPSSPELEN
                    true
                }
                R.id.navigation_item_login -> {
                    viewpager_main.currentItem = BaseFragment.LOGIN
                    true
                }
                R.id.navigation_item_registreer -> {
                    viewpager_main.currentItem = BaseFragment.REGISTREER
                    true
                }
                else -> {
                    viewpager_main.currentItem = BaseFragment.GEZELSCHAPSSPELEN
                    true
                }

            }

        }


        viewpager_main.currentItem = BaseFragment.GEZELSCHAPSSPELEN

        viewpager_main.adapter = object : FragmentPagerAdapter(supportFragmentManager) {
            override fun getItem(p0: Int): Fragment {
                when (p0) {
                    BaseFragment.GEZELSCHAPSSPELEN -> return GezelschapsspelFragment.newInstance()
                    BaseFragment.LOGIN -> return LoginFragment.newInstance()
                    BaseFragment.REGISTREER -> return RegistreerFragment.newInstance()
                }
                return GezelschapsspelFragment()
            }

            override fun getCount(): Int {
                return 3
            }
        }
    }


    override fun toonGezelschapsspelen() {
        TODO("not implemented")
    }

    override fun loginClicked() {
        TODO("not implemented")
    }

    override fun registreerClicked() {
        TODO("not implemented")
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                mDrawerLayout.openDrawer(GravityCompat.START)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}
