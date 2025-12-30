# Estrutura Condicional When

Baseado em `when.kt`, `when2.kt` e `whenExpression.kt`.

## When (O Switch melhorado)
O `when` substitui o `switch-case` com muito mais poder.
- **Argumento opcional**: Pode testar um valor (`when(x)`) ou condições arbitrárias (`when { ... }`).
- **Padrões diversos**: Aceita valores simples, faixas (`in 1..10`), tipos (`is String`), ou condições customizadas.
- **Smart Cast**: Ao verificar o tipo, a variável é automaticamente convertida.

## When como Expressão
Assim como o `if`, o `when` também retorna valor e pode ser atribuído a variáveis. O `else` é obrigatório se não cobrir todos os casos possíveis.
```kotlin
val tipo = when(x) {
    0, 1 -> "Binário"
    else -> "Outro"
}
```
