

fun main() {
        //função para formatar a saida recebendo a quantidade de casas depois da virgula
        fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')

        print("Digite seu salario: ")
        val r = readLine()!!.toFloat()//funçao que recebe uma entrada do teclado convertendo para float
        var i = 0F

        if ( r <= 2000.00 ) {
                i
        } else if (r > 2000.0 && r <= 3000.00) {
                i = ((r - 2000) * 0.08).toFloat()
        } else if ( r > 3000.00 && r <= 4500.00 ) {
                i = (((r - 3000) * 0.18) + 80).toFloat()
        } else if (r > 4500) {
                i = ((( r - 4500 ) * 0.28) + 350).toFloat()
        }
        //formata a saida pasando a quantida de casa depois da virgula
        if (i == 0F) println("Isento") else println("R$ ${i.format(2)}")


}