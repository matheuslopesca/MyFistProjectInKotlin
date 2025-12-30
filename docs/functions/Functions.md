# Funções Básicas

Baseado em `simpleFunction.kt`, `simpleFunction2.kt`, `functionWithReturn.kt`, `unitReturn.kt`, `functionsAsExpression.kt`.

## Definição
Definidas com a palavra-chave `fun`.
```kotlin
fun nomeDaFuncao(param: Tipo): Retorno { corpo }
```

## Retorno Unit
Se a função não retorna nada útil, seu tipo de retorno é `Unit` (equivalente ao `void` do Java). Ele pode ser omitido na declaração.

## Single-Equation Functions
Se a função possui apenas uma expressão, pode-se omitir as chaves e usar `=`. O tipo de retorno é inferido.
```kotlin
fun multiply(a: Int, b: Int) = a * b
```
