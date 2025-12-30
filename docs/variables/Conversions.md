# Conversão e Tipos sem Sinal

Documentação baseada em `variables4Convert.kt` e `variables5Unsign.kt`.

## Conversão Explícita (variables4Convert.kt)
Kotlin não realiza conversão implícita entre tipos numéricos (ex: atribuir Int para Long automaticamente) para evitar erros de precisão.
- Use métodos explícitos: `.toInt()`, `.toDouble()`, `.toLong()`, `.toByte()`.
- Exemplo: `val l1 = i1.toLong()`.

## Tipos Unsigned (variables5Unsign.kt)
Kotlin suporta tipos inteiros sem sinal, úteis para operações de baixo nível ou quando o valor nunca é negativo.
- **Tipos**: `UByte`, `UShort`, `UInt`, `ULong`.
- **Literais**: Sufixo `u` ou `U` (ex: `100U`).
- **Desempenho**: São implementados usando os tipos primitivos com sinal, mas interpretados como sem sinal.
