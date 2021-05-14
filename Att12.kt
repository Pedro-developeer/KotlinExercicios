/*Uma fábrica controla o tempo de trabalho sem acidentes pela quantidade de dias.
Faça um programa para converter este tempo em anos, meses e dias. Considere que
cada ano possui 365 dias e cada mês possui 30 dias.
 */
fun main () {
    println("-------------------------------")
    println("\t Control de acidentes")
    print("Informe o numero de dias: ")
    val dadosDias:Int = readLine() !!.toInt()
    val anos = dadosDias / 365
    val mes = dadosDias % 365 / 30
    val dias = dadosDias % 365 % 30
    println("-----------------------------")
    println("O numero de anos é: $anos anos")
    println("O numero de meses é: $mes meses")
    println("O numero de dias é: $dias meses")
}