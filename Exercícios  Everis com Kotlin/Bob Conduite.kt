fun main( ) {

    val n = readLine()!!.toInt()
    val resultados = mutableListOf<Int>()
    for (i in 1..n) {//percorre de 1 ate N
        //o split é um delimitador que coloca uma string em cada posiçao do map pasando para int
        val raios = readLine()!!.split(" ").map { it.toInt() }
        resultados.add(raios[0] + raios[1])
    }
    resultados.forEach{elemento -> println(elemento)}
}