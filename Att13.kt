/*Uma padaria vende certa quantidade de pães franceses e uma quantidade de pães de queijo a cada dia.
Cada pão francês custa R$ 0,12 e o pão de queijo custa R$ 1,50. Ao final do dia, o dono quer saber
quanto arrecadou com as vendas, e quanto deve guardar numa conta de poupança (10% do total arrecadado).
Faça um programa que leia a quantidade de pães franceses e pães de queijo, calcule e mostre o valor
arrecadado no dia e o valor que deve ser guardado na conta de poupança.
 */
fun main() {
    println("---------------------------------------")
    println("\t Panificadora Canto do Galo")
    print("Informe a quantidade de pães vendidos pela panificadora: ")
    val paes:Int = readLine() !!.toInt()
    print("Informe a quantidade de pães de quijo: ")
    val paesDeQuiejos:Int = readLine() !!.toInt()
    val totalVendas:Double = (paes * 0.12) + (paesDeQuiejos * 1.50)
    val poupanca = totalVendas * 0.10
    println("O valor total de vendas foi de $totalVendas ")
    println("foi pra poupança 10% do valor total das vendas R$$poupanca")

}