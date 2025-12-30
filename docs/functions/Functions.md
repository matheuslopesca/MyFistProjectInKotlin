# Funções: Os Blocos de Construção

Funções encapsulam lógica para ser reutilizada. Kotlin moderniza a sintaxe de funções para ser mais concisa e expressiva.

## Sintaxe Básica
```kotlin
fun nome(parametro: Tipo): TipoRetorno {
    return valor
}
```

## Unit (O novo Void)
Se uma função não retorna nada útil (apenas faz um efeito colateral, como imprimir na tela ou salvar no banco), ela retorna `Unit`.
- O `Unit` pode ser omitido explicitamente na assinatura.
- Diferente do `void` do Java, `Unit` é um objeto real (singleton), o que facilita programação genérica.

## Single-Expression Functions (Funções de uma linha)
Se sua função contém apenas uma expressão (uma conta, uma chamada, um if), você pode remover as chaves `{}` e o `return`, usando o igual `=`.

O compilador **infere o tipo de retorno** automaticamente.

```kotlin
// Tradicional
fun quadrado(x: Int): Int {
    return x * x
}

// Single-Expression (Muito mais Kotlin!)
fun quadrado(x: Int) = x * x
```
Isso incentiva a criação de funções pequenas e focadas.
