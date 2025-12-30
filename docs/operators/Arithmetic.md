# Operadores Aritméticos

Baseado em `arithmetc.kt`, `arithmetcConversion.kt`, `operatorPrecedence.kt`.

## Operações Básicas
- Soma `+`, Subtração `-`, Multiplicação `*`, Divisão `/`, Módulo `%` (resto).
- A divisão entre inteiros resulta em inteiro (truncada). Para divisão decimal, pelo menos um operando deve ser ponto flutuante.

## Precedência
A ordem das operações segue a matemática padrão (PEMDAS):
1. Parênteses `()`
2. Multiplicação e Divisão
3. Soma e Subtração
Exemplo: `5 + 4 * 2` resulta em 13, não 18.

## Promoção de Tipo Aritmético
Ao operar com tipos diferentes (ex: `Int` e `Double`), o resultado é promovido para o "maior" tipo (`Double`) para preservar informações.
