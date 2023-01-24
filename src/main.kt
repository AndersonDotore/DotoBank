fun main() {
    println("Bem vindo ao Dotobank ")

    val anderson = Funcionario(
        nome = "Anderson",
        cpf = "111.111.111-00",
        salario = 2000.0
    )

    println("nome ${anderson.nome}")
    println("salario ${anderson.salario}")
    println("cpf ${anderson.cpf}")
    println("bonificação ${anderson.bonificacao()}")
}


