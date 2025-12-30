# Classes e Objetos

Baseado em `Account.kt` e `App1Account.kt`.

## Definição de Classe
Toda classe é um "molde" para objetos.
```kotlin
class Account {
    var balance: Double = 0.0
    var owner: String = ""

    fun deposit(amount: Double) {
        balance += amount
    }
}
```

## Instanciação
Não se usa a palavra `new`. Basta chamar o construtor como uma função.
```kotlin
val conta = Account()
```
