# Constantes em Tempo de Compilação (`const`)

Você já viu `val` e `var`, mas existe um terceiro tipo mais específico: `const val`.

## Diferença entre `val` e `const val`

### `val` (Runtime Constant)
É uma constante de tempo de execução. O valor é imutável, mas pode ser calculado quando o programa roda (ex: pegar data atual, ler input do usuário).
```kotlin
val dataAtual = LocalDate.now() // Calculado na execução
```

### `const val` (Compile-time Constant)
É uma constante "verdadeira", cujo valor deve ser conhecido **no momento em que você compila o código**.
- **Restrições**:
  1. Só pode ser `String` ou tipo primitivo (`Int`, `Double`, `Boolean`, etc).
  2. Deve estar no "nível superior" (top-level) fora de qualquer função, ou dentro de um `object`.
  3. Não pode ser o resultado de uma função (a menos que seja `intrinsic`).

```kotlin
const val PI = 3.14159 // O compilador troca todas as referências de PI pelo número direto.
```

## Por que usar?
- **Desempenho**: Como o valor é substituído diretamente no bytecode, é ligeiramente mais rápido do que buscar o valor em uma variável de memória.
- **Anotações**: Apenas `const val` pode ser usado em argumentos de anotações (ex: `@Deprecated(message = MENSAGEM_CONSTANTE)`).

**Regra de Ouro**: Se for um valor fixo universal (como URL de API, Matemático, Configuração fixa), use `const val`. Se depender de lógica, use `val`.
