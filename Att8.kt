package Kotlin

/* Três amigos, Carlos, André e Felipe, decidiram rachar igualmente a conta em um bar. Faça um programa
para leia o valor total da conta e imprimir quanto cada um deve pagar, mas faça com que
Carlos e André não paguem centavos.
Por exemplo: uma conta de R$101,53   R$33,00 para Carlos, R$33,00 para André e R$ 35,53 para Felipe.
 */
fun main() {
    println("----------------------")
    println("CONTA DO BAR ")
    println("-----------------------")
    print("Qual o valor total da conta ?")
    val valorTotal = readLine() !!.toFloat()
    val carlos:Int = (valorTotal / 3).toInt()
    val andre:Int = (valorTotal / 3).toInt()
    val felipe = valorTotal - carlos - andre
    println("Carlos pagara a conta de R$$carlos")
    println("André pagara a conta de R$$andre")
    println("Felipe pagara a conta de R$$felipe")
}