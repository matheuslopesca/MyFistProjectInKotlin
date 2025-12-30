# Variáveis: Mutabilidade e Inferência (Variables.kt)

As variáveis são containers para armazenar dados. Em Kotlin, a decisão mais importante ao criar uma variável não é "qual o tipo", mas sim "ela vai mudar?".

## `val` vs `var` (O Conceito de Mutabilidade)

### `val` (Value / Imutável)
Define uma variável **somente leitura** (read-only).
- **Comportamento**: Uma vez atribuído um valor, ele **não pode ser alterado**.
- **Analogia**: Pense em uma constante ou em escrever à caneta permanente.
- **Boas Práticas**: **Prefira sempre começar com `val`**. Isso torna o código mais seguro e fácil de entender, pois você garante que o valor não mudará inesperadamente em outra parte do programa.
- **Equivalente Java**: `final int x = 10;`

### `var` (Variable / Mutável)
Define uma variável cujo valor **pode ser reatribuído**.
- **Comportamento**: Você pode trocar o valor quantas vezes quiser, desde que respeite o tipo original.
- **Analogia**: Pense em uma caixa aberta onde você pode trocar o conteúdo.

```kotlin
val nascimento = 2000 // O ano de nascimento nunca muda
var idade = 23        // A idade muda todo ano

// nascimento = 2001 // ERRO: Val cannot be reassigned
idade = 24           // OK
```

## Inferência de Tipo (Type Inference)
Kotlin é uma linguagem **estaticamente tipada** (o tipo é verificado na compilação), mas é inteligente o suficiente para deduzir o tipo pelo contexto.

- **Explícito**: `val nome: String = "Matheus"` (Você diz que é String)
- **Inferido**: `val nome = "Matheus"` (O compilador vê as aspas e *sabe* que é String)

A inferência reduz a verbosidade do código sem perder a segurança dos tipos. Se você tentar atribuir um número a uma variável que nasceu como String, o compilador dará erro.

## Inicialização Tardia
Se você declarar uma variável sem atribuir valor inicial, **é obrigatório** dizer o tipo explicitamente.
```kotlin
val x: Int // Obrigatório dizer que é Int
x = 10     // Inicialização posterior
```
