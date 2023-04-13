package com.waldo.appsdk

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class EnvironmentInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.waldo.appsdk.test", appContext.packageName)
    }

    @Test
    fun not_inside_waldo() {
        assertEquals(false, isInsideWaldo())
    }
}