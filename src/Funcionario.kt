abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double

){
    abstract val bonificacao: Double

}

// essa é a forma inicial da função. A versão de cima é a mais comun utilizada no Kotlin
//{
//    open fun bonificacao(): Double {
//        return salario * 0.1
//    }
//}