package com.example.synrgy_intentfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        memuatFrag(BundleFragment())
        bottomNav.setOnNavigationItemSelectedListener (this)
    }

    private fun memuatFrag(fragment: Fragment): Boolean {
        if (fragment != null) {
            supportFragmentManager.beginTransaction()
                .replace(frameMain.id, fragment)
                .commit()
            return true
        }
        return false
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var fragment : Fragment? = null
        when (item.itemId) {
            R.id.itemNavigationBundle -> fragment = BundleFragment()
            R.id.itemNavigationParcelable -> fragment = ParcelableFragment()
            R.id.itemNavigationSerializable -> fragment = SerializableFragment()
            R.id.itemNavigationDial -> fragment = DialFragment()
            R.id.itemNavigationWhatsapp -> fragment = WhatsappFragment()
        }
        return memuatFrag(fragment!!)
    }
}