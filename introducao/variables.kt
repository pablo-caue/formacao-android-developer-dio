package introducao

fun main() {
    var a: String = "Initial"
    println(a)
    a = "final"
    println(a)
    val b: Int = 1
    val c = 3
    println(b)
    println(c)

    fun someCondicion() = true

    val d : Int

    if (someCondicion()){
        d = 1
    }else{
        d = 2
    }

    println(d)
}