/* A  nota  de  um  aluno  em  uma  disciplina  é  a  média  ponderada  das  notas  de  suas  duas
avaliações  parciais.  A  primeira avaliação parcial tem peso 2  e a segunda avaliação parcial
tem peso  3. Se a média do aluno  for maior ou igual a sete, o aluno está  aprovado. Se a  média
do aluno for menor  que três, o  aluno está reprovado . Se a média do aluno for menor que  sete e
 maior  ou  igual  a  três,  o  aluno  irá  para  a  recuperação.  Faça  um  programa  para  c
 alcular  a  média  de  u m  aluno  em  uma determinada disciplina e informar o seu estado
 final. O programa deverá exibir a seguinte frase:
 O aluno ______________ obteve média ____________ e está  __________________.
 */
fun main() {
    println("--------------------------")
    print("Digite seu nome: ")
    val nome:String = readLine() !!.toString()
    print("Informea nota da primeira avaliação parfical:  ")
    val avaliacaoParcial1:Float = readLine() !!.toFloat()
    print("Informe a nota da segunda avaliação parcial: ")
    val avaliacaoParcial2:Float = readLine() !!.toFloat()
    val media:Float =  ((avaliacaoParcial1 * 2) + (avaliacaoParcial2 * 3 ))/ 5

    if (media >= 7) {
        println("O aluno $nome tirou a media $media está APROVADO!")
    }
    else if (media < 3) {
        println("O aluno $nome obteve a media $media está REPROVADO!")
    }
    else if (media < 7 && media >= 3 ) {
        println("O aluno $nome obteve a media $media está RECUPERAÇÃO! ")
    }
}