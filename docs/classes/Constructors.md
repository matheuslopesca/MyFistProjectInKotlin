# Construtores

Baseado em `App4AccountConstructors.kt` e `App5AccountOverloading.kt`.

## Construtor Primário
Faz parte do cabeçalho da classe.
```kotlin
class Account(val owner: String, var balance: Double)
```
As propriedades podem ser declaradas diretamente no construtor com `val` ou `var`.

## Construtor Secundário
Definido dentro do corpo da classe com `constructor`. Deve delegar para o primário (se existir) usando `this()`.

## Inicialização
O bloco `init { ... }` é executado logo após o construtor primário, útil para lógica de validação ou inicialização complexa.
