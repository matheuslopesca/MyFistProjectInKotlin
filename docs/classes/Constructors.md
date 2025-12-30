# Construtores: Do Nascimento do Objeto

Kotlin divide a construção de objetos em duas partes para manter o código limpo.

## 1. Construtor Primário (Primary Constructor)
Ele fica **no cabeçalho da classe**. É a forma principal de inicializar.

```kotlin
// "class Pessoa" declara a classe
// "(val nome: String, var idade: Int)" é o construtor E declaração de propriedades ao mesmo tempo
class Pessoa(val nome: String, var idade: Int)
```
Só de escrever essa linha, você já tem:
- Classe `Pessoa`.
- Propriedades `nome` e `idade`.
- Construtor que recebe nome e idade.
- Getters e Setters.

## 2. O Bloco `init`
Como o construtor primário não tem "corpo" (chaves), se você precisar rodar algum código na inicialização (ex: validar dados, imprimir log), use o bloco `init`.
```kotlin
class Pessoa(val nome: String) {
    init {
        println("Nasceu uma pessoa chamada $nome")
        if (nome.isBlank()) throw Exception("Nome inválido")
    }
}
```

## 3. Construtores Secundários
Usados quando você precisa de formas alternativas de instanciar a classe (menos comum).
Eles **precisam** chamar o construtor primário (direta ou indiretamente) usando `this()`.
```kotlin
class Pessoa(val nome: String) {
    // Construtor extra que não pede nome e assume "Anônimo"
    constructor() : this("Anônimo") {
        // corpo opcional do construtor secundário
    }
}
```
