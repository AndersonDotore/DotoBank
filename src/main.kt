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
    println()

    val rafaella = Gerente(
        nome = "Rafaella",
        cpf = "222.222.222-33",
        salario = 5000.0,
        senha = 1234
    )

    println("Nome ${rafaella.nome}")
    println("Salario ${rafaella.salario}")
    println("Cpf ${rafaella.cpf}")
    println("Bonificação ${rafaella.bonificacao()}")

    if(rafaella.autentica(senha = 1234)){
        println("Auntenticação com sucesso")
    }else{
        println("Falha na autenticação")
    }
}


