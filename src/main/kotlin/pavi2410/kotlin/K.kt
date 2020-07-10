@file:Suppress("ClassName", "FunctionName", "unused")

package pavi2410.kotlin

object array {
    inline operator fun <reified T> get(vararg values: T): Array<T> = arrayOf(*values)
}

object list {
    inline operator fun <reified T> get(vararg values: T): List<T> = listOf(*values)
}

object set {
    inline operator fun <reified T> get(vararg values: T): Set<T> = setOf(*values)
}

object map {
    inline operator fun <reified K, reified V> get(vararg pairs: Pair<K, V>): Map<K, V> = mapOf(*pairs)
}

operator fun <E> List<E>.get(range: IntRange): List<E> = slice(range)
inline operator fun <reified E> List<E>.unaryPlus(): MutableList<E> = mutableListOf(*toTypedArray())

fun <T> printv(vararg msg: T): Unit = print(msg.joinToString(" "))
fun <T> printvln(vararg msg: T): Unit = println(msg.joinToString(" "))


// Pythonic Syntax
//val value = "yes" If ("foo".length >= 2) Else "no"
infix fun <T> T.If(condition: Boolean): T? = if (condition) {
    this
} else {
    null
}

infix fun <T> T?.Else(otherwise: T): T = this ?: otherwise

/// Conditionals

fun unless(condition: Boolean, then: () -> Unit) {
    if (!condition) {
        then()
    }
}

fun until(condition: Boolean, then: () -> Unit) {
    while (!condition) {
        then()
    }
}

/// Switch

fun <T> switch(test: T, switchScope: SwitchScope<T>.() -> Unit) {
    try {
        switchScope(SwitchScope(test))
    } catch (e: SwitchOut) {
        // do nothing
    }
}

class SwitchScope<T>(val test: T)

fun <T> SwitchScope<T>.case(b: T, function: () -> Unit) {
    if (test == b) function()
}

fun <T> SwitchScope<T>.default(function: () -> Unit) {
    function()
}

class SwitchOut : Exception("switch-out")

@Throws(SwitchOut::class)
fun <T> SwitchScope<T>.out() {
    throw SwitchOut()
}