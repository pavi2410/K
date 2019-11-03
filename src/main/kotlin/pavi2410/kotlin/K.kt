package pavi2410.kotlin

object K {
    operator fun <T> get(vararg values: T): List<T> = listOf(*values)
}

fun <T> print(vararg msg: T): Unit = kotlin.io.print(msg.joinToString(" "))
fun <T> println(vararg msg: T): Unit = kotlin.io.println(msg.joinToString(" "))

operator fun <E> List<E>.get(range: IntRange): List<E> = slice(range)

infix fun < T> T.IF(condition: Boolean) = if (condition) this else null

infix fun <T> T?.ELSE(value: T): T = this ?: value
