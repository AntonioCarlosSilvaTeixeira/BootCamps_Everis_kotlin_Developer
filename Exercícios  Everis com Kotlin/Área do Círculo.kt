import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    val raio = readLine()!!.toDouble()//funçao que recebe uma entrada do teclado convertendo para double
    val pi = 3.14159
    val area = raio * raio * pi
    //formata a saida pasando a quantida de casa depois da virgula
    val resultado = BigDecimal( area ).setScale(4, RoundingMode.HALF_EVEN)
    println("A = $resultado")

}