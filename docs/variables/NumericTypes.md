# Tipos Numéricos Primitivos

Diferente de linguagens dinâmicas (como Python ou JS), Kotlin tem tipos específicos para números, dependendo do tamanho e da precisão que você precisa. Escolher o tipo certo economiza memória e evita erros.

## Tipos Inteiros (Sem casas decimais)

| Tipo | Tamanho (bits) | Valor Mínimo | Valor Máximo | Uso Comum |
| :--- | :---: | :--- | :--- | :--- |
| **Byte** | 8 | -128 | 127 | Manipulação de arquivos binários, streams de rede. Raro em lógica de negócios. |
| **Short** | 16 | -32.768 | 32.767 | Compatibilidade com bibliotecas antigas. |
| **Int** | 32 | -2 bilhões | ~2 bilhões | **Padrão** para contagens, índices e matemática geral. |
| **Long** | 64 | -9 quintilhões | ~9 quintilhões | IDs de banco de dados, timestamps, números astronômicos. |

**Nota sobre Literais**:
- Um número puro (`10`) é interpretado como `Int`.
- Para indicar que é `Long`, use o sufixo `L`: `10L`.

## Tipos Flutuantes (Com casas decimais)

| Tipo | Tamanho | Precisão | Sufixo Obrigatório |
| :--- | :--- | :--- | :--- |
| **Float** | 32 bits | ~6-7 dígitos | `F` ou `f` (ex: `3.14F`) |
| **Double** | 64 bits | ~15-16 dígitos | Nenhum (ex: `3.14`) |

**Atenção com Precisão**:
O `Double` é o padrão e é mais preciso que `Float`.
```kotlin
val pi = 3.1415926535 // Double (padrão)
val altura = 1.75F    // Float (definido pelo F)
```

## Por que não usar Double para dinheiro?
Tipos flutuantes (`Double`/`Float`) têm problemas de arredondamento devido à forma como o computador armazena binários (padrão IEEE 754).
- Exemplo: `0.1 + 0.2` pode resultar em `0.30000000000000004` e não `0.3`.
- **Dica Profissional**: Para sistemas financeiros, use a classe `BigDecimal` (do Java) para garantir a precisão exata dos centavos.

## Conversões
Kotlin **não converte automaticamente** tipos menores para maiores para evitar perda de dados silenciosa ou confusão.
```kotlin
val i: Int = 10
val l: Long = i // ERRO DE COMPILAÇÃO
val l: Long = i.toLong() // CORRETO
```
Você deve usar métodos explícitos: `.toByte()`, `.toShort()`, `.toInt()`, `.toLong()`, `.toFloat()`, `.toDouble()`.
