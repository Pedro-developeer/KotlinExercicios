import kotlin.math.pow
import kotlin.math.sqrt

/* Fazer um programa que calcule a função 𝑓(𝑥) = 2𝑥2 − 3,
 sendo que o valor de 𝑥 deve ser fornecido pelo usuário. O programa deve mostrar o valor de 𝑓( 𝑥).
 */
fun main () {
    print("Inform o valor de X: ")
    val x:Double = readLine() !!.toDouble()
    val fx:Double = 2 * x.pow(2) + 3 * x
    val gx:Double = sqrt(3 * x.pow(2)+2)
    val hx:Double = 1 / x
    val a:Double = fx + gx
    val b:Double = fx + hx
    val c:Double = 2 * gx.pow(2) + gx
    println("A função a é = $a")
    println("A função b é = $b")
    println("A função c é = $c")
}