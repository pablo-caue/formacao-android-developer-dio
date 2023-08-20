package algumasFuncoes

fun writeCreationLog(p: Person){
    println("a new person ${p.name} was created")
}

fun main() {
    val jake = Person("Jake", 30, "Android developer")   // 1
        .also {                                          // 2
            writeCreationLog(it)                         // 3
        }
}