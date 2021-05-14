/* Faça um programa para ler dois números inteiros M e N e determinar se M é divisível por N. */
fun main() {
    println("------------------------------")
    print("informe o valo de M: ")
    val m:Int = readLine() !!.toInt()
    print("Inform o valor de N: ")
    val n:Int = readLine() !!.toInt()
    val x = m / n
    val y =m % n
    if (y==0) {
        println("O numero $m é divisivel por $n")
    }
    else {
        println("o numero $m não é divisivel por $n")
    }
    if (y == 0){
        println("O resultado da divisão é $y")
    }

}