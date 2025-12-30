# Atribuição e Operadores Unários

## Atribuição Composta (Augmented Assignment)
Programadores são preguiçosos (no bom sentido: eficientes). Em vez de repetir a variável, usamos atalhos para atualizar valores.

| Atalho | Equivalente |
| :---: | :--- |
| `a += b` | `a = a + b` |
| `a -= b` | `a = a - b` |
| `a *= b` | `a = a * b` |
| `a /= b` | `a = a / b` |
| `a %= b` | `a = a % b` |

Isso funciona para Strings também!
```kotlin
var s = "Olá"
s += " Mundo" // s vira "Olá Mundo"
```

## Operadores Unários (Incremento/Decremento)
Adicionar ou remover `1` é tão comum (em loops, contadores) que tem operadores próprios: `++` e `--`.

### A Diferença entre Pré e Pós (`++x` vs `x++`)
Parece igual, mas a ordem importa quando usado **dentro de outra expressão** (como um print ou atribuição).

1.  **Pós-fixado (`x++`)**: "Use o valor antigo, **depois** aumente".
    ```kotlin
    var x = 10
    println(x++) // Imprime 10 (usou o valor atual)
    println(x)   // Imprime 11 (agora já aumentou)
    ```

2.  **Pré-fixado (`++x`)**: "Aumente agora, **depois** use o novo valor".
    ```kotlin
    var y = 10
    println(++y) // Imprime 11 (aumentou antes de imprimir)
    ```

**Dica**: Para evitar confusão, evite usar `++` dentro de expressões complexas. Prefira fazer o incremento em uma linha separada.
