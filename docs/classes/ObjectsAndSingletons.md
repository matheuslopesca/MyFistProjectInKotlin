# Objetos e Singletons

Em Kotlin, a palavra-chave `object` é usada para criar uma classe e uma instância dela ao mesmo tempo. Isso é a implementação nativa do padrão de projeto **Singleton**.

## Object Declaration (O Singleton)
Baseado em `MathObjectDeclaration.kt`.

Quando você declara um `object`, ele é inicializado na primeira vez que é acessado e existe apenas uma única instância dele em toda a aplicação. É útil para utilitários, configurações globais ou fontes de dados compartilhadas.

```kotlin
object Math2 {
    fun sum(a: Int, b: Int) = a + b
}

// Uso direto (sem parênteses de construtor)
Math2.sum(10, 20)
```
**Diferença para Class**: Não tem construtores (pois você não cria instâncias manualmente).

## Companion Object (O substituto do Static)
Baseado em `MathCompanionObjctive.kt`.

Kotlin não tem a palavra-chave `static` como no Java. Para ter métodos ou variáveis que pertencem à classe (e não a uma instância específica), usamos o `companion object` (Objeto Companheiro).

```kotlin
class Math {
    // Método de Instância (precisa de um objeto Math() pra chamar)
    fun subtract(a: Int, b: Int) = a - b

    // Método "Estático" (chama direto na classe)
    companion object {
        fun sum(a: Int, b: Int) = a + b
    }
}

Math.sum(10, 5) // Chama o companion
Math().subtract(10, 5) // Chama a instância
```

## Padrão Factory (Fábrica)
Baseado em `Factory.kt`.

O `object` é excelente para implementar o padrão Factory, onde um objeto é responsável por criar outros.

```kotlin
object Factory {
    var instanceCounter = 0

    fun newCar(): Car {
        instanceCounter++ // Mantém estado compartilhado globalmente
        return Car()
    }
}

val carro = Factory.newCar()
```
No exemplo acima, `instanceCounter` conta quantos carros foram criados no total da aplicação, provando que `Factory` é uma instância única compartilhada.
