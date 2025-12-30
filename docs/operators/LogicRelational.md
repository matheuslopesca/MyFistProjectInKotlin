# Operadores Lógicos e Relacionais

Baseado em `logic.kt` e `relational.kt`.

## Operadores Relacionais (relational.kt)
Comparam valores e retornam um `Boolean`.
- `==` (Igualdade estrutural)
- `!=` (Desigualdade)
- `>` (Maior que), `<` (Menor que), `>=` (Maior ou igual), `<=` (Menor ou igual)

## Operadores Lógicos (logic.kt)
Combinam expressões booleanas (Tabela Verdade).
- **`&&` (E/AND)**: Retorna true se ambos forem true.
- **`||` (OU/OR)**: Retorna true se pelo menos um for true.
- **`!` (NÃO/NOT)**: Inverte o valor booleano.

**Curto-circuito**: Como em outras linguagens, se o resultado de uma expressão lógica já puder ser determinado pelo primeiro operando (ex: `false && ...`), o segundo não é avaliado.
