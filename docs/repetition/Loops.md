# Estruturas de Repetição (Loops)

Bases para iterar sobre dados ou repetir tarefas.

## O Laço `for` (Para cada)
O `for` do Kotlin é equivalente ao "for-each" de outras linguagens. Ele navega sobre qualquer coisa que seja "iterável" (Arrays, Listas, Intervalos/Ranges).

### Sintaxe de Ranges (Intervalos)
Kotlin tem uma sintaxe muito expressiva para criar intervalos numéricos:

- **Crescente (INCLUSIVO)**: `1..10` -> [1, 2, ..., 10]
- **Exclusivo no final**: `1 until 10` -> [1, 2, ..., 9] (bom para arrays onde o índice vai até size-1)
- **Decrescente**: `10 downTo 1` -> [10, 9, ..., 1]
- **Com Passo (Step)**: `0..10 step 2` -> [0, 2, 4, 6, 8, 10]

```kotlin
for (i in 0..10 step 2) {
    print("$i ") 
}
```

## O Laço `while` e `do-while`
Usado quando você **não sabe** quantas vezes vai repetir, apenas sabe a condição de parada.

### `while` (Enquanto)
Checa a condição **antes**. Se já for falsa no início, o código dentro nunca roda.
```kotlin
while (jogoRodando) { updateTela() }
```

### `do-while` (Faça... Enquanto)
Checa a condição **depois**. Garante que o código rode **pelo menos uma vez**.
```kotlin
do {
    println("Digite a senha:")
    val s = readln()
} while (s != "1234")
```
Útil quando você precisa pedir um dado para o usuário antes de verificar se é válido.
