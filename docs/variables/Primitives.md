# Booleanos e Caracteres

Documentação baseada em `variables6Boolean.kt` e `variables7DataTypeChar.kt`.

## Boolean (variables6Boolean.kt)
Representa valores lógicos verdadeiro (`true`) ou falso (`false`).
- Operadores comuns: `==`, `!=`, `!`, `&&`, `||`.

## Char (variables7DataTypeChar.kt)
Representa um único caractere unicode.
- Delimitado por aspas simples: `'A'`.
- Propriedades úteis: `.code` (código unicode), `.isDigit()`, `.isLetter()`.
- Diferente de Java, Char não é tratado diretamente como número (não se pode somar `'A' + 1` diretamente sem conversão em alguns contextos, mas Kotlin permite `'A' + 1` resultando em 'B').
