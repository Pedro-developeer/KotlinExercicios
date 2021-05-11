/* 1 - Faça um programa que receba como entrada o nome e o salário de um funcionário
de uma empresa e que calcule o novo valor do salário de funcionário em conta que esse
teve um aumento de 25%. O programa deve exibir na saída da seguinte frase
O funcionário ________ teve um aumento de R $ _______ e passará a receber um salário de R $ ________ */
fun main() {
    print("Qual é o nome do fucionario ? ")
    val Fucionario = readLine() !!.toString()
    print("Qual o salario desse funcionario ? ")
    val Salario = readLine() !!.toInt()
    val Aumento = Salario * 0.25
    val NovoSalario = Salario * 1.25
    println ("O seu salario anterior era de $Salario")
    print ("O funcionário $Fucionario teve um aumento de R$Aumento e passará a receber um salário de  R$ $NovoSalario ")

}