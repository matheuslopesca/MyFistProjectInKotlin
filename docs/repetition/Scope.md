# Escopo de Variáveis (A Vida de uma Variável)

O "escopo" define onde uma variável nasce e onde ela morre (deixa de ser visível/acessível). Entender isso é vital para gerenciamento de memória e evitar bugs.

## Escopo de Bloco (Block Scope)
Em Kotlin, qualquer par de chaves `{ ... }` define um novo escopo. Variáveis nascem dentro das chaves e **morrem quando a chave fecha**.

```kotlin
fun main() { // Escopo da Main
    val a = 10
    
    if (true) {
        val b = 20
        println(a) // Eu vejo 'a' (ela é "pai")
        println(b) // Eu vejo 'b' (estou no mesmo bloco)
    }
    
    // println(b) // ERRO! 'b' morreu quando o if fechou.
}
```

## Shadowing (Sombra)
Kotlin permite que você crie uma variável com o **mesmo nome** de uma variável de um escopo externo. A interna "faz sombra" na externa.

```kotlin
val x = 10 // x global da main

if (true) {
    val x = 50 // x local do if (Shadowing)
    println(x) // Imprime 50 (a mais próxima ganha)
}

println(x) // Imprime 10 (a x local morreu, volta a valer a externa)
```
**Cuidado**: Embora permitido, shadowing excessivo pode confundir quem lê o código ("qual x é esse?"). Use com moderação.
