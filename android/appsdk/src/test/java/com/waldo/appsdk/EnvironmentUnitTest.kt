package com.waldo.appsdk

import org.junit.Test

import org.junit.Assert.*

class EnvironmentUnitTest {
    @Test
    fun not_inside_waldo() {
        assertEquals(false, isInsideWaldo())
    }
}