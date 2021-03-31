fun main() {
    var n = readLine()!!.toInt()
    var number = arrayListOf<Int>()
    if(n != 0) {
        while (n > 0) {
   // split delimita a entrada pelo " " e o map converte para int retornando um map(lista)
            val numeros = readLine()!!.split(" ").map { it.toInt() }
            n--
            number.add(mdc(numeros[0], numeros[1]))//adiciona os itens na lista
        }
    }
    //percorre a lista printando na tela
    number.forEach{elemento -> println(elemento)}
}
//função para achar o maior divisor comum
fun mdc( n1: Int, n2: Int): Int{
    var resto = 0
    var n1 = n1
    var n2 = n2
    while (n2 != 0) {
        resto = n1 % n2;
        n1 = n2
        n2 = resto;
    }
    return n1
}