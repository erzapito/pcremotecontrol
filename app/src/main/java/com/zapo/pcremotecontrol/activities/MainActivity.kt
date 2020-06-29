package com.zapo.pcremotecontrol.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.zapo.pcremotecontrol.R
import com.zapo.pcremotecontrol.fragments.AddFragment
import com.zapo.pcremotecontrol.network.ConnectionManager
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var connectionManager: ConnectionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timber.e("New activity")
        var addButton = findViewById(R.id.add) as View
        addButton.setOnClickListener { v -> addElement() }
    }

    fun addElement() {
        Timber.e("add element clicked")
        val fm: FragmentManager = supportFragmentManager
        val addFragment: AddFragment =
            AddFragment.newInstance()

        addFragment.show(fm,"Add element")
    }

}
