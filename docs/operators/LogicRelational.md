# Operadores Lógicos e Relacionais

Estes operadores são o "cérebro" das tomadas de decisão (`if/else`) no seu código.

## Relacionais (Comparação)
Verificam a relação entre dois valores e **sempre retornam um Boolean** (`true` ou `false`).

- `>` Maior
- `<` Menor
- `>=` Maior ou Igual
- `<=` Menor ou Igual
- `==` Igualdade (Verifica o **conteúdo**)
- `!=` Diferença

### A Diferença entre `==` e `===`
- `a == b`: Compara o **conteúdo/valor**. (Equivalente ao `.equals()` do Java). É o que você usa 99% das vezes.
- `a === b`: Compara a **referência de memória**. Verifica se `a` e `b` são literalmente o *mesmo objeto* na memória RAM.

## Lógicos (Tabela Verdade)
Usados para combinar múltiplas condições.

| Operador | Nome | Lógica | Exemplo |
| :---: | :---: | :--- | :--- |
| `&&` | AND (E) | **Tudo** deve ser verdade para dar true. | "Tenho carteira" E "tenho carro"? |
| `||` | OR (OU) | **Pelo menos um** deve ser verdade. | "Aceita cartão" OU "aceita dinheiro"? |
| `!` | NOT (NÃO) | Inverte o valor. | Se era true vira false. |

## Curto-circuito (Short-Circuit)
O Kotlin (como muitas linguagens) é preguiçoso para otimizar desempenho.

1.  **NO AND (`&&`)**: Se a primeira condição for `false`, ele **nem olha a segunda**, pois o resultado final já será `false` de qualquer jeito.
    - `false && (expressao_pesada())` -> A expressão pesada nem roda.

2.  **NO OR (`||`)**: Se a primeira condição for `true`, ele **nem olha a segunda**, pois o resultado já será `true`.
    - `true || (expressao_pesada())` -> A expressão pesada nem roda.

Isso é útil para segurança. Ex:
`if (usuario != null && usuario.idade > 18)`
Se usuário for nulo, a segunda parte nem roda, evitando um erro de `NullPointerException`.
