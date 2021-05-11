/* No colégio, “Minha Escolinha”,  a nota bimestral de um aluno em uma disciplina é
 a média ponderada das notas  parciais. A primeira  nota parcial tem peso 2 e a
  segunda nota parcial tem peso 3. Faça  um  programa para obter o nome e as notas
  de um aluno em uma determinada disciplina  e calcular sua média. O programa deverá
   exibir a seguinte frase: O aluno _________ obteve média _________ */

fun main() {
    println("Escolinha media")
    print("Insira a primeira nota parcial: ")
    val mediaA = readLine() !!.toFloat()
    print("Insira a segunda nota parcial: ")
    val mediaB = readLine() !!.toFloat()
    val mediaTotal = (mediaA * 2 + mediaB * 3) /5
    println("A media do aluno é $mediaTotal")

}