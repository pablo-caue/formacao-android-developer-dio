package introducao

class MutableStackk<E>(vararg items: E) {              // 1

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)        // 2

    fun peek(): E = elements.last()                     // 3

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun <E> mutableStackOf(vararg elements: E) = MutableStackk(*elements)

fun main() {
    val stack = mutableStackOf("A", "B", "C")
    stack.push("9.87")
    println(stack)

    for (i in 1..stack.size()){
        println("pop(): ${stack.pop()}")
        println(stack)
    }
}