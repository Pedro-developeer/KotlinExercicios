/*O Futebol Clube do  Recife deseja aumentar o salário de seus jogadores.
O ajuste salarial deve obedecer à seguinte tabela:
____________________________________________________________
Até  R$ 900,00 			 		 aumento de 20%
Acima de R$ 900,00 até R$ 1.300,00 		 aumento de 15%
Acima de R$ 1.3 00,00 até R$ 1.800,00 		 aumento de 10%
acima de 1.800,00  				 aumento de 5%
____________________________________________________________
Faça um programa  ler o  nome de um jogador e  seu salário atual e  calcular o  seu aumento e seu novo
salário. O programa deverá exibir a seguinte frase:
O jogador ___________ terá aumento de R$ __________ e passará a receber R$____________. */
fun main (){
    println("======-FUTEBOL CLUBE RECIFE-=======")
    print("Qual é seu nome ? ")
    val nome:String = readLine() !!.toString()
    print("Digite seu salario atual: ")
    val salario:Float = readLine() !!.toFloat()
    if (salario >=900) {
        val aumento = (salario * 0.20)
        val novoSalario = (salario * 1.20)
        println("O jogador $nome terá um aumento de R$$aumento e passara receber RS$novoSalario")
    }
    else if (salario<=1300) {
        val aumento = (salario * 0.15)
        val novoSalario = (salario * 1.15)
        println("O jogador $nome terá um aumento de R$$aumento e passara receber RS$novoSalario")
    }
    else if (salario<=1800){
        val aumento = (salario * 0.10)
        val novoSalario = (salario * 1.10)
        println("O jogador $nome terá um aumento de R$$aumento e passara receber RS$novoSalario")
    }
    else {
        val aumento = (salario * 0.05)
        val novoSalario = (salario * 1.05)
        println("O jogador $nome terá um aumento de R$$aumento e passara receber RS$novoSalario")
    }
}