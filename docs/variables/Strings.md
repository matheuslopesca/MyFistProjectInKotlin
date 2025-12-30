# Strings e Manipulação de Texto

String é um dos tipos mais fundamentais na programação. Em Kotlin, elas são "cidadãs de primeira classe" com funcionalidades poderosas para facilitar a vida do desenvolvedor.

## O Que é uma String?
É uma sequência imutável de caracteres. "Imutável" significa que métodos que parecem alterar a string (como `toUpperCase`) na verdade **criam uma nova string** com a alteração, mantendo a original intacta.

## Templates de String (Adeus Concatenação!)
Em linguagens antigas, usávamos o `+` para juntar textos: `"Olá " + nome + "!"`. Isso é verboso e ineficiente.
Kotlin introduz **String Templates** com o símbolo `$`.

- **Variável Simples**: `$nome`
- **Expressão Complexa**: `${operacao}` (obrigatório uso de chaves)

```kotlin
val nome = "Matheus"
val idade = 23
// Muito mais legível:
println("Nome: $nome, Idade ano que vem: ${idade + 1}")
```

## Raw Strings (Strings Cruas)
Às vezes precisamos escrever textos com muitas aspas, barras invertidas (regex ou caminhos de arquivo) ou múltiplas linhas (SQL, JSON, HTML).
As **Raw Strings** usam aspas triplas `"""` e preservam **tudo** o que está dentro, inclusive quebras de linha e formatação.

```kotlin
val menu = """
    MENU PRINCIPAL
    1. Iniciar
    2. Configurações
    3. Sair
""".trimIndent() // Remove a indentação extra do código
```

## Métodos Úteis
Como tudo é objeto, Strings têm métodos poderosos embutidos:
- `str.length`: Tamanho do texto.
- `str[0]`: Acessa o primeiro caractere (como um array).
- `str.uppercase()` / `str.lowercase()`: Caixa alta/baixa.
- `str.trim()`: Remove espaços em branco do início e fim.
- `str.isBlank()`: Retorna true se estiver vazia ou só tiver espaços (muito útil para validação de formulários!).
