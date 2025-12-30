# Controle de Fluxo: Break, Continue e Labels

Durante um loop, às vezes precisamos de um controle mais fino: sair antes da hora ou pular uma etapa.

## Comandos Básicos
- **`break`**: "Abortar missão". Sai do loop imediatamente.
  - Ex: Procurar um item numa lista. Achou? Dá `break` pra não gastar tempo procurando no resto.
- **`continue`**: "Pula essa, vai pra próxima". Encerra a iteração atual e volta pro topo do loop com o próximo valor.
  - Ex: Imprimir números, mas pular os pares. Se for par, `continue`.

## Rótulos (Labels): O Poder dos Nested Loops
Imagine que você tem um loop dentro de outro (matriz, por exemplo).
Um `break` normal só sai do loop **mais interno** onde ele está. Mas e se você quiser sair de **tudo**?

Em Java/C, você precisaria de flags boleanas complexas (`boolean achou = false; if (achou) break;`).
Em Kotlin, você usa **Labels**. Um label é um nome seguido de `@`.

```kotlin
linha@ for (i in 1..10) { // Dei o nome 'linha' pra esse loop
    coluna@ for (j in 1..10) {
        if (i == 5 && j == 5) {
            // Sai do loop 'linha' (o externo), encerrando TUDO.
            break@linha 
        }
    }
}
```
Isso torna a manipulação de algoritmos complexos de busca muito mais limpa.
