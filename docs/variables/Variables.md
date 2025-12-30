# variables.kt

Introdução à declaração de variáveis em Kotlin.

## Conceitos
- **`var` (Mutable)**: Variáveis cujo valor pode ser alterado.
- **`val` (Immutable)**: Variáveis de leitura apenas (read-only), similares a `final` em Java. Recomenda-se usar `val` por padrão.
- **Inferência de Tipo**: O compilador Kotlin consegue deduzir o tipo da variável com base no valor atribuído (ex: `var counter = 10` é inferido como `Int`).

```kotlin
    var counter = 10 // Mutável
    val counter2 = 10 // Imutável
```
