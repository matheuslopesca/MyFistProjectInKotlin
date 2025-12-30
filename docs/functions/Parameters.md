# Parâmetros: Flexibilidade e Clareza

Kotlin resolve dois grandes problemas de verbosidade do Java: Sobrecarga de Métodos (Overloading) e leitura de parâmetros booleanos.

## Argumentos Padrão (Default Arguments)
Você pode definir valores padrão para os parâmetros. Se quem chamar a função não passar o valor, o padrão é usado.
Isso elimina a necessidade de criar 5 versões da mesma função (`funcao()`, `funcao(a)`, `funcao(a, b)`...).

```kotlin
fun criarJanela(titulo: String, largura: Int = 800, altura: Int = 600) { ... }

// Chamadas possíveis:
criarJanela("Home")              // Usa 800x600
criarJanela("Login", 300)        // Usa 300x600 (assume ordem)
criarJanela("Intro", 1920, 1080) // Usa tudo customizado
```

## Argumentos Nomeados (Named Arguments)
Ao chamar a função, você pode dizer explicitamente qual parâmetro está preenchendo. Isso permite:
1.  **Mudar a ordem** dos argumentos.
2.  **Pular argumentos** do meio (que tenham valor padrão).
3.  **Clareza extrema** (adeus `funcao(true, false, null)` que ninguém sabe o que significa).

```kotlin
// Muito mais claro o que é largura e o que é altura
criarJanela(largura = 400, altura = 200, titulo = "Pop-up") 
```
