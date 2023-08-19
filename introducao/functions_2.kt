package introducao

import java.util.logging.LogManager

fun main() {

    fun printALL(vararg messages: String){
        for (m in messages) println(m)
    }
    printALL("Hello", "Hallo", "Salut", "Hola", "Olá")

    fun printAllWithPrefix(vararg messages: String, prefix: String){
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
            "Hello", "Hallo", "Salut", "Hola", "Olá",
            prefix = "Greeting: "
    )

    fun Log(vararg entries: String){
        printALL(*entries)
    }
    Log("Hello", "Hallo", "Salut", "Hola", "Olá")
}