// Faça um programa para ler os coeficientes (a,b,c,d,e,f) das equações e calcular e exibir os valores de x e y.
fun main() {
    print("Informe o valor de a: ")
    val a = readLine() !!.toFloat()
    print("Informe o valor de b: ")
    val b = readLine() !!.toFloat()
    print("Informe o valor de c: ")
    val c = readLine() !!.toFloat()
    print("Informe o valor de d: ")
    val d = readLine() !!.toFloat()
    print("Informe o valor de e: ")
    val e = readLine() !!.toFloat()
    print("Inform o valor de f:")
    val f = readLine() !!.toFloat()
    val x = ( (c*e) - (b*f) ) / ( (a*e) - (b*d) )
    val y = ( (a*f) - (c*d) ) / ( (a*e) - (b*d) )
    print("X =$x e Y= $y ")
}