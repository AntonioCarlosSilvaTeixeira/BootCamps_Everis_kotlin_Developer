fun main(args: Array<String>) {

    val padrao = Regex("(^\\w{2})(\\w*)")//expressão regular
    val hexa = Regex("^0x")//expressão regula para verificar o hexadecimal
    var numero = 0
    var resultados = mutableListOf<String>()

    while (numero >= 0){
        var entrada = readLine().toString()
        //if que converte de hexadecimal / Decimal
        if (hexa.containsMatchIn(entrada)){//verifica se o numero é hexadecimal
            //converte de hexadecimal / Decimal
            val aux = Integer.valueOf(entrada.replace(padrao,"$2"), 16).toInt()
            resultados.add(aux.toString())
        }else{
            numero = entrada.toInt()
            //if que converte de decimal / hexadecimal
            if (numero > 0){
                //converte de Decimal / hexadecimal
                var aux = Integer.toHexString(numero)
                aux = aux.toUpperCase()//coloca a string em maiuscula
                resultados.add("0x$aux")
            }
        }
    }
    resultados.forEach { it -> println(it) }
}
