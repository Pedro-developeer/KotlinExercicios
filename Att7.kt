package Kotlin
/* No curso de Programação, a  nota final de um estudante é  calculada a partir de seu  desempenho  em  três avaliações:
 um exame intermediário que vale 30% da nota final, um trabalho prático que corresponde a 20%
da  nota  final e um exame  final que  completa os 50%  restantes.  Faça um programa para ler o  nome
de  um aluno e suas notas nas três avaliações. O programa deve calcular sua nota final e exibir
a seguinte frase:
O aluno _________ teve nota final _________. */
fun main() {
    println("-------------------")
    println("NOTA DO ESTUDANTE ")
    println ("__________________")
    print("Qual nome do estudante ? ")
    val nome = readLine() !!.toString()
    print("Digite a nota exame N1 obtida: ")
    val notaN1 = readLine() !!.toFloat()
    print("Digite a nota obtida pelo trabalh : ")
    val notaN2 = readLine() !!.toFloat()
    print ("Digite a nota final: ")
    val notaFinal = readLine() !!.toFloat()
    val avaliacao1 = notaN1 * 0.30
    val avaliacao2 = notaN2 * 0.20
    val avaliacao3 = notaFinal * 0.50
    val media = avaliacao1 + avaliacao2 + avaliacao3
    println("O aluno $nome obteve a media de $media")
}