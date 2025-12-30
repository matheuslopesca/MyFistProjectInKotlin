# Parâmetros de Funções

Baseado em `functionWithParams.kt`, `namedParams.kt`, `deafultParams.kt`.

## Parâmetros Padrão (Default Arguments)
Permite definir valores padrão para parâmetros, reduzindo a necessidade de sobrecarga de métodos.
```kotlin
fun greet(msg: String = "Olá") { ... }
```

## Argumentos Nomeados (Named Arguments)
Ao chamar a função, pode-se nomear os argumentos para passar valores em qualquer ordem ou apenas para os que não têm valor padrão.
```kotlin
greet(message = "Hi", name = "User")
```
Isso aumenta muito a legibilidade do código.
