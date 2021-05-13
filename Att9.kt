/* Fazer um programa que calcule a função 𝑓(𝑥) = 2𝑥2 − 3,
 sendo que o valor de 𝑥 deve ser fornecido pelo usuário. O programa deve mostrar o valor de 𝑓( 𝑥).
 */
import kotlin.math.pow
fun main() {
    print("Informe o valor de X:")
    val x :Double = readLine() !!.toDouble()
    val funcao: Double = 2 * x.pow(2) -3
    println("A função f($x)= $funcao ")
}