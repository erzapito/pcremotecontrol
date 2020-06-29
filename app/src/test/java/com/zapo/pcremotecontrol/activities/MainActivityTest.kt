package com.zapo.pcremotecontrol.activities

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltTestApplication
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@HiltAndroidTest
@Config(application = HiltTestApplication::class)
class MainActivityTest : Assert() {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Test
    fun checkLocationPermissionChanged_from_no_location_to_location2() {
        var scenario = ActivityScenario.launch(MainActivity::class.java);
        scenario.moveToState(Lifecycle.State.RESUMED);
        scenario.onActivity { activity -> run {
            assertNotNull(activity.connectionManager)
        } }

    }

}