fun testaComportamentosConta() {
    val contaLuke = ContaCorrente(titular = "Luke", numero = 1000)
    contaLuke.deposita(200.0)

    val contaLeia = ContaPoupanca(numero = 1001, titular = "Leia")
    contaLeia.deposita(300.0)

    println(contaLeia.titular)
    println(contaLeia.numero)
    println(contaLeia.saldo)

    println(contaLuke.titular)
    println(contaLuke.numero)
    println(contaLuke.saldo)

    println("depositando na conta do Luke")
    contaLuke.deposita(50.0)
    println(contaLuke.saldo)

    println("depositando na conta da Leia")
    contaLeia.deposita(70.0)
    println(contaLeia.saldo)

    println("sacando na conta do Luke")
    contaLuke.saca(250.0)
    println(contaLuke.saldo)

    println("sacando na conta da Leia")
    contaLeia.saca(100.0)
    println(contaLeia.saldo)

    println("saque em excesso na conta do Luke")
    contaLuke.saca(100.0)
    println(contaLuke.saldo)

    println("saque em excesso na conta da Leia")
    contaLeia.saca(500.0)
    println(contaLeia.saldo)

    println("Transferência da conta da Fran para o Luke")

    if (contaLeia.transfere(destino = contaLuke, valor = 300.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaLuke.saldo)
    println(contaLeia.saldo)
}
