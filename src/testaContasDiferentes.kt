fun testaConstasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Luke",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Leia",
        numero = 1001
    )

    contaCorrente.deposita(valor = 1000.0)
    contaPoupanca.deposita(valor = 1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(valor = 100.0)
    contaPoupanca.saca(valor = 100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(valor = 100.0, destino = contaPoupanca)

    println("saldo após transfe corrente: ${contaCorrente.saldo}")
    println("saldo após transfere poupança: ${contaPoupanca.saldo}")
}