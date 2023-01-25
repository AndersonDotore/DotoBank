fun testaFuncionarios() {
    val lando = Funcionario(
        nome = "Lando Carlisle",
        cpf = "111.111.111-00",
        salario = 1000.0

    )

    println("Nome ${lando.nome}")
    println("Salario ${lando.salario}")
    println("Cpf ${lando.cpf}")
    println("Bonificação ${lando.bonificacao}")
    println()

    val hansolo = Gerente(
        nome = "Han Solo",
        cpf = "222.222.222-33",
        salario = 2000.0,
        senha = 1234
    )

    println("Nome ${hansolo.nome}")
    println("Salario ${hansolo.salario}")
    println("Cpf ${hansolo.cpf}")
    println("Bonificação ${hansolo.bonificacao}")

    if (hansolo.autentica(senha = 1234)) {
        println("Autenticação com sucesso")
    } else {
        println("Falha na autenticação")
    }
    println()

    val luke = Diretor(
        nome = "Luke Skywalker",
        cpf = "333.333.333-44",
        salario = 4000.0,
        plr = 200.0,
        senha = 4321
    )

    println("Nome ${luke.nome}")
    println("Salario ${luke.salario}")
    println("Cpf ${luke.cpf}")
    println("Bonificação ${luke.bonificacao}")
    println("Plr ${luke.plr}")

    if (luke.autentica(senha = 4321)) {
        println("Autenticação com sucesso")
    } else {
        println("Falha na autenticação")
    }
    println()

    val leia = Analista(
        nome = "Leia",
        cpf = "444.444.444-55",
        salario = 1500.00
    )

    println("Nome ${leia.nome}")
    println("Salario ${leia.salario}")
    println("Cpf ${leia.cpf}")
    println("Bonificação ${leia.bonificacao}")
    println()

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(hansolo)
    calculadora.registra(luke)
    calculadora.registra(lando)
    calculadora.registra(leia)

    println("Total de bonificação: ${calculadora.total}")
}