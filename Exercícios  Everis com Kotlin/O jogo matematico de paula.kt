fun main(args: Array<String>) {

    var n = readLine()!!.toInt()
    val numeros = mutableListOf<Int>()

    while (n > 0) {
   // split delimita a entrada pelo "" e o run é uma funçao que recebe outra função
       // run ta recebendo a entrada e convertendo para o tipo MutableList()
        val entrada = readLine()!!.split("").run { this.toMutableList() }

        var n1 = entrada[1].toInt()
        var letra = entrada[2]
        var n2 = entrada[3].toInt()

        if (n1 != n2) {
            if (letra in "A".."Z") {//percorre o alfabeto
                numeros.add(n2 - n1)
            } else numeros.add(n2 + n1)
        } else numeros.add(n2 * n1)
        n--
    }
    //percorre a lista printando na tela
    numeros.forEach { item -> println(item) }
}