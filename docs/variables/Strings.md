# Strings e Literais

Documentação baseada em `variables8DataTypeString.kt` e `variables9StringLiterais.kt`.

## Strings (variables8DataTypeString.kt)
Sequência de caracteres imutável.
- **Templates de String**: Uso de `$` para injetar variáveis (`$var`) ou expressões (`${v1 + v2}`) dentro da string. Isso substitui a concatenação verbosa.
- Propriedades: `.length`, índices `[0]`.

## Literais e Raw Strings (variables9StringLiterais.kt)
- **Escaped Strings**: Strings normais com caracteres de escape ex: `\n`, `\"`.
- **Raw Strings**: Delimitadas por aspas triplas `"""`.
  - Permitem múltiplas linhas sem usar `\n`.
  - Ignoram caracteres de escape (útil para Regex ou caminhos de arquivo).
  - Métodos `.trimIndent()` ou `.trimMargin()` ajudam a formatar a indentação do código.
