# Introdução e Ponto de Entrada (Main.kt)

Este arquivo representa o primeiro contato com a linguagem Kotlin, demonstrando a estrutura mínima necessária para um programa executável.

## O Que é a Função `main`?
Em Kotlin, a função `main` é o **ponto de entrada** (entry point) da aplicação. Quando você executa o programa, a Máquina Virtual Java (JVM) procura especificamente por essa assinatura para começar a execução.

### Diferenças para Java
Se você vem do Java, notará uma diferença drástica:
- **Sem Classe Invólucro**: Em Kotlin, funções podem existir no "nível superior" (top-level) de um arquivo. Você não precisa criar uma `class Main` para segurar estaticamente a função.
- **Sem `static`**: O conceito de estático é tratado de forma diferente em Kotlin (geralmente via `companion object` ou funções top-level), tornando o código mais limpo.
- **Sem `String[] args` obrigatório**: A partir do Kotlin 1.3, os argumentos de linha de comando são opcionais na declaração se você não for usá-los.

## Entendendo o Código
```kotlin
fun main() {
    println("Hello Kotlin")
}
```

1.  **`fun`**: Palavra-chave usada para declarar uma função.
2.  **`main`**: Nome reservado para a função principal.
3.  **`()`**: Lista de parâmetros (vazia neste caso).
4.  **`{ ... }`**: Corpo da função, onde o código a ser executado reside.
5.  **`println(...)`**: Função padrão (da biblioteca `kotlin.io`) que imprime uma mensagem no console e pula para a próxima linha (`ln` = line).

## Curiosidade: Compilação
Embora pareça que não há classe, o compilador Kotlin cria uma classe "nos bastidores" para a JVM. Se o arquivo se chama `Main.kt`, o compilador gera uma classe `MainKt` com um método estático `main`. Isso garante total compatibilidade com o ecossistema Java.
