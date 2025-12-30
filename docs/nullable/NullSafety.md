# Segurança Nula (Null Safety)

Baseado em todo o pacote `nullable`.

## O Problema do Bilhão de Dólares
O sistema de tipos de Kotlin visa eliminar o perigo de referências nulas (`NullPointerException`).

## Tipos Anuláveis
Por padrão, tipos não aceitam `null`. Para permitir, adicione `?` ao tipo.
```kotlin
var s: String = "abc" // Não pode ser null
var s2: String? = null // Pode ser null
```

## Operadores de Segurança
1.  **Safe Call `?.`**: Acessa a propriedade/método somente se não for nulo. Caso contrário, retorna null.
    `val l = s?.length`
2.  **Elvis Operator `?:`**: Define um valor padrão caso a expressão à esquerda seja nula.
    `val l = s?.length ?: 0`
3.  **Not-Null Assertion `!!`**: Converte forçadamente um tipo anulável para não-anulável. Lança exceção se for null. Use com cuidado!
    `val l = s!!.length`
