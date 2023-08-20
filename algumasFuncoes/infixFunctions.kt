package algumasFuncoes

fun main() {

    infix fun Int.times(str: String) = str.repeat(this)        // 1
    println(2 times "Bye ")                                    // 2

    val pair = "Ferrari" to "Katrina"                          // 3
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)   // 4
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Personn("Sophia")
    val claudia = Personn("Claudia")
    sophia likes claudia                                       // 5
}

class Personn(val name: String) {
    val likedPeople = mutableListOf<Personn>()
    infix fun likes(other: Personn) { likedPeople.add(other) }  // 6
}