package algumasFuncoes

fun main() {
    fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"  // 1
}