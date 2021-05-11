/*
O custo do seguro contra granizo numa comunidade típica de fazendeiros  é 3,5%  do  valor de cobertura
 solicitado (para cada  acre), multiplicado pelo  número  de acres  plantados.  Supondo  que as
  possibilidades de colheita sejam limitadas a milho, feijão e café, faça um programa para ler
  a cobertura desejada e o número de acres plantados para cada uma das três plantações e calcular
 o custo de seguro para cada produto e o custo total do seguro para o cliente.
 */
fun main (){
    print ("Informe a quantidade de acres para milho: ")
    val acreMilho = readLine() !!.toFloat()
    print ("Informe a quantidade de acres feijão: ")
    val acreFeijao = readLine() !!.toFloat()
    print ("Informe a quantidade de acre cafe: ")
    val acreCafe = readLine() !!.toFloat()
    print ("Informe o valor do acre para milho: ")
    val precoMilho = readLine() !!.toFloat()
    print ("Informe o valor acre para feijão:  ")
    val precoFeijao = readLine() !!.toFloat()
    print ("Informe a o valor do acre para Café: ")
    val precoCafe = readLine() !!.toFloat()
    val seguroMilho = 0.035 * (acreMilho*precoMilho);
    val seguroFeijao = 0.035 * (acreFeijao*precoFeijao);
    val seguroCafe = 0.035 * (acreCafe*precoCafe);
    val seguro = seguroMilho + seguroCafe + seguroFeijao;
    println("O valor do seguro do milho é R$ $seguroMilho")
    println("O valor do seguro do feijão é R$ $seguroFeijao")
    println("O valor do seguro do cafe é R% $seguroCafe")
    println("O custo total é de R$ $seguro")
}