package pavi2410.kotlin

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class KTest {

    @Test
    fun `test array syntax`() {
        assertArrayEquals(
            arrayOf(1, 2, 3),
            array[1, 2, 3]
        )
    }

    @Test
    fun `test list syntax`() {
        assertEquals(
            listOf(1, 2, 3),
            list[1, 2, 3]
        )
    }

    @Test
    fun `test mutable list syntax`() {
        val muli = +list[1, 2, 3]
        muli += 4
        assertEquals(4, muli.size)
    }

    @Test
    fun `test set syntax`() {
        assertEquals(
            setOf(1, 2, 3),
            set[1, 2, 3]
        )
    }

    @Test
    fun `test map syntax`() {
        assertEquals(
            mapOf("foo" to 1, "bar" to 2, "qux" to 3),
            map["foo" to 1, "bar" to 2, "qux" to 3]
        )
    }

    @Test
    fun `test pythonic list slice`() {
        val li = listOf(1, 2, 3, 4, 5)

        assertEquals(
            li.slice(2..4),
            li[2..4]
        )
    }

    @Test
    fun `test vararg print`() {
        printvln("foo", "bar")
        assertTrue(true)
    }

    @Test
    fun `test switch statement syntax`() {
        val b = "b"

        switch (b) {
            case("a") { println("it is a"); out() }
            case("b") { println("it is b"); out() }
            case("c") { println("it is c"); out() }
            default { println("no match") }
        }
    }
}