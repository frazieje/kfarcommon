package net.farsystem.common

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTests {
    @Test
    fun testMe() {
        assertTrue(Sample().checkMe() > 0)
    }

    @Test
    fun testCommon() {
        assertTrue("Hi!" in testing())
    }
}