# Estruturas de Repetição (Loops)

Baseado em `for.kt`, `while.kt`, `doWhile.kt`.

## For Loop
O `for` em Kotlin itera sobre qualquer coisa que forneça um iterador (ranges, arrays, collections).
- Sintaxe: `for (item in colecao)`.
- **Ranges**:
  - `1..10` (inclusive).
  - `1 until 10` (exclui o 10).
  - `10 downTo 1` (decrescente).
  - `step 2` (passo).

## While e Do-While
- **While**: Verifica a condição antes de executar. Pode não executar nenhuma vez.
- **Do-While**: Verifica a condição depois. Garante pelo menos uma execução.
```kotlin
do {
    // corpo
} while (condicao)
```
