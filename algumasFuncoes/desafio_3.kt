package algumasFuncoes

data class Pais(var habitantes: Double, val taxaCrescimento: Double) {
    fun crescerPopulacaoAnual(): Double {
        return habitantes*(taxaCrescimento/100)
    }
}

fun main() {
    val habitantesPaisA = readLine()!!.toDouble();
    val habitantesPaisB = readLine()!!.toDouble();
    val paisA = Pais(habitantesPaisA, taxaCrescimento = 3.0)
    val paisB = Pais(habitantesPaisB, taxaCrescimento = 1.5)

    var quantidadeAnos = 0
    while (paisA.habitantes < paisB.habitantes) {
        paisA.habitantes += paisA.crescerPopulacaoAnual()
        paisB.habitantes += paisB.crescerPopulacaoAnual()
        quantidadeAnos += 1
    }

    println("$quantidadeAnos anos")
}