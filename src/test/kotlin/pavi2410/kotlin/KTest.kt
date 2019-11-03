package pavi2410.kotlin

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KTest {

    @Test
    fun testListOperator() {
        val list = K[1, 2, 3, 4, 5]
        val expected = listOf(1, 2, 3, 4, 5)
        assertEquals(expected, list)
    }

    @Test
    fun testPythonicListSliceOperator() {
        val list = listOf(1, 2, 3, 4, 5)

        val slice = list.slice(2..4)
        val Kslice = list[2..4]
        assertEquals(Kslice, slice)
    }

    @Test
    fun testVarargPrintFunction() {
        println("foo", "bar")
    }

    @Test
    fun testPythonicIfElseExpression() {
        val test = "foo" IF true ELSE "bar"
        assertEquals("foo", test)
    }
}