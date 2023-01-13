// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(val codigo: String, val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

class Aluno(s: String) {

}

fun main() {
    val alunos = listOf(
        Aluno("João"),
        Aluno("Maria"),
        Aluno("José")
    )
    val conteudos = listOf(
        ConteudoEducacional("GITL01", "GitLab - Conceitos Básicos", 20),
        ConteudoEducacional("GITL02", "Entendendo a Arquitetura do GitLab", 40),
        ConteudoEducacional("GITL03", "Pipeline com Publicação em um Cluster Kubernetes"),

    )
    val formacoes = listOf(
    Formacao(
        "CI/CD com GitLab", listOf("GITL01", "GITL02", "GITL03")),
        Formacao(
        "Web3 Fundamentals", listOf("")
    )

    initializeData()
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
