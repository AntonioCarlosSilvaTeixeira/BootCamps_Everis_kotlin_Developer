fun main() {

    while (true) {
        try {
            val l = readLine()!!.toInt()
            // função run pega cada entrada delimitada pelo o split(delimitador " ")
            // ele(run) pega as entradas e joga dentro de uma funçao dentro dele
            val v = readLine()!!.split(" ").run {
                val numbers: ArrayList<Int> = arrayListOf()
                for (i in this) {
                    numbers.add(i.toInt())
                }
                numbers
            }
            v.sort()// essa linha percore a lista e ordena em ordem crescente
            when (v.last()) { //essa linha percorre a lista e retorna o ultimo item
                in 1..9 -> println("1")
                in 10..19 -> println("2")
                in 20..50 -> println("3")
            }
        } catch (e : Exception ) {
            break
        }
    }
}
