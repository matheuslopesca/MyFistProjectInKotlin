# Estrutura Condicional: `when`

O `when` é a evolução moderna e superpoderosa do antigo `switch/case`. Ele torna códigos complexos de decisão muito mais legíveis.

## Versatilidade do `when`
Diferente do `switch` (que tradicionalmente só aceitava constantes), o `when` aceita quase tudo.

### 1. Argumento Simples
```kotlin
val x = 10
when (x) {
    1 -> print("Um")
    2, 3 -> print("Dois ou Três") // Agrupamento
    else -> print("Outro")       // Default case
}
```

### 2. Argumento Inteligente (Ranges e Tipos)
Você pode checar se está em um intervalo ou se é de um tipo específico.
```kotlin
when (x) {
    in 1..10 -> print("Entre 1 e 10")
    !in 10..20 -> print("Fora de 10 a 20")
    is Int -> print("É um inteiro")
}
```

### 3. Sem Argumento (`when` puro)
Funciona como um substituto mais limpo para vários `if-else if` encadeados.
```kotlin
when {
    x > 0 -> print("Positivo")   // Equivalente a if (x > 0)
    x < 0 -> print("Negativo")   // Equivalente a else if (x < 0)
    else -> print("Zero")        // Equivalente a else
}
```

## `when` como Expressão
Assim como o `if`, o `when` pode retornar valor. Isso é extremamente útil para converter estados.
```kotlin
val tipo = when (cor) {
    "Vermelho" -> 1
    "Azul" -> 2
    else -> 0
}
```
**Dica**: Se você usar `when` em `Enums` ou `Sealed Classes`, o compilador te obriga a cobrir todas as opções, garantindo que você não esqueça nenhum caso caso adicione um novo tipo no futuro. Isso se chama **Verificação de Exaustividade** (Exhaustiveness Check).
