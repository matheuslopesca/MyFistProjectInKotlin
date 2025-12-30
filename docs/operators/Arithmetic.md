# Operadores Aritméticos

A matemática é a base da computação. Kotlin suporta as operações padrão, mas com detalhes importantes sobre tipos de dados.

## Operadores Básicos
| Símbolo | Operação | Exemplo (`a=10`, `b=3`) |
| :---: | :--- | :--- |
| `+` | Soma | `10 + 3` = `13` |
| `-` | Subtração | `10 - 3` = `7` |
| `*` | Multiplicação | `10 * 3` = `30` |
| `/` | Divisão | `10 / 3` = `3` (**Importante!**) |
| `%` | Módulo (Resto) | `10 % 3` = `1` |

## A "Pegadinha" da Divisão Inteira
Um erro muito comum de iniciantes é a divisão entre inteiros.
Em Kotlin (e Java), **Int dividido por Int sempre resulta em Int**. O resultado é truncado (a parte decimal é jogada fora), não arredondado.

```kotlin
println(5 / 2) // Imprime 2 (não 2.5)
```

**Como corrigir?**
Pelo menos um dos números deve ser Flutuante (`Double` ou `Float`) para que a divisão seja decimal.
```kotlin
println(5.0 / 2)   // Imprime 2.5
println(5 / 2.0)   // Imprime 2.5
println(5f / 2)    // Imprime 2.5
```

## Precedência (PEMDAS)
Kotlin segue as regras matemáticas universais.
1. `()` Parênteses
2. `*`, `/`, `%` Multiplicação e afins
3. `+`, `-` Soma e subtração

`5 + 2 * 3` é `11` (primeiro multiplica), não `21`.
Use parênteses para forçar a ordem desejada: `(5 + 2) * 3` resulta em `21`.

## Sobrescarga (Operadores em Objetos)
Curiosidade avançada: Em Kotlin, esses símbolos chamam funções ocultas.
`a + b` na verdade chama `a.plus(b)`. Isso permite que você ensine suas próprias classes a serem "somadas" (Operator Overloading), como somar duas matrizes ou duas datas.
