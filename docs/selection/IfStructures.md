# Estrutura Condicional: `if` e `else`

O `if` é a ferramenta básica para bifurcar o código: "Se A for verdade, faça X. Senão, faça Y".

## O Básico (Declaração Statement)
Funciona exatamente como em C, Java ou JavaScript.
```kotlin
if (idade >= 18) {
    println("Maior de idade")
} else {
    println("Menor de idade")
}
```
O `else if` permite testar múltiplas condições em cascata.

## O Super Poder: `if` como Expressão
Aqui o Kotlin brilha. Em Java, `if` é apenas uma instrução de controle. Há um operador ternário separado para atribuição: `int max = (a > b) ? a : b;`.

Em Kotlin, **NÃO existe ternário** (`? :`). Por que?
Porque o próprio `if` **retorna um valor**.

```kotlin
// Em uma linha, elegante e legível
val max = if (a > b) a else b

// Ou em bloco
val status = if (nota > 7) {
    println("Aprovado com louvor")
    "Aprovado" // A última linha é o retorno
} else {
    println("Estude mais")
    "Reprovado" // A última linha é o retorno
}
```

**Regra**: Quando usado como expressão (para retornar valor), o ramo `else` se torna **obrigatório**. O compilador precisa saber o que devolver caso a condição falhe.
