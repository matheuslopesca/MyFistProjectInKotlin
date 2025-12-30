# Controle de Fluxo em Loops

Baseado em `break.kt`, `continue.kt` e `label.kt`.

## Break e Continue
- **`break`**: Encerra o loop mais próximo.
- **`continue`**: Pula a iteração atual e vai para a próxima.

## Labels (Rótulos)
Permitem controlar loops aninhados (nested loops).
- Definição: `nome@` antes do loop.
- Uso: `break@nome` ou `continue@nome`.
Isso permite sair de um loop externo a partir de um loop interno.
```kotlin
loopExterno@ for (i in 1..10) {
    for (j in 1..10) {
        if (...) break@loopExterno
    }
}
```
