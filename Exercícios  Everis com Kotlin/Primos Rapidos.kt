import kotlin.math.sqrt

fun main(){

    print("Digite a quantidade de número:  ")
    var n = readLine()!!.toInt()//funçao que recebe uma entrada do teclado convertendo para inteiro
    val numeros = arrayListOf<String>()
    var divisores = 0

    while (n > 0 ){
        print("Digite um número:  ")
        var num = readLine()!!.toLong()//funçao recebe entrada do teclado convertendo para inteiro
        var raiz = sqrt(num.toDouble()) //função de achar a raiz quadrada

        for (i in 2..raiz.toInt()){
            if (num % i == 0L){
                divisores++
                break
            }
        }

        if (divisores == 1 || num == 1L){
            numeros.add("Not Prime")
        } else numeros.add("Prime")

        divisores = 0
        n--
    }
    //percorre a lista printando na tela
    numeros.forEach{elemento -> println(elemento)}
}