# Estrutura Condicional If

Baseado em `if.kt`, `ifElse.kt`, `ifElseif.kt` e `ifExpression.kt`.

## Estrutura Básica
Funciona como na maioria das linguagens C-like:
```kotlin
if (condicao) {
    // bloco
} else if (outraCondicao) {
    // bloco
} else {
    // bloco
}
```

## If como Expressão
Em Kotlin, `if` é uma expressão, o que significa que ele retorna um valor. Isso substitui o operador ternário (`? :`).
```kotlin
val max = if (a > b) a else b
```
A última linha do bloco é o valor retornado.
