fun main () {
    println("-----------------------------------------")
    println("\t FABRICA DE REFRIGERANTE GOIÂNINHO")
    println("-----------------------------------------")
    print(" Digite a quantidade de lata de 350 ml: ")
    val lata350ml:Int = readLine() !!.toInt()
    print("Digite a quantidade de lata de 600 ml: ")
    val garrafa600ml:Int = readLine() !!.toInt()
    print("Digite a quantidade de garrafa de 2L: ")
    val garrafa2L:Int = readLine() !!.toInt()
    val quantLata350 = lata350ml * 350 / 1000
    val quantGarrafa600 = garrafa600ml *600 /1000
    val total = quantLata350 + quantGarrafa600 + 2 * garrafa2L
    print("\n A quantidade de litros comprados é  $total Litros")

}