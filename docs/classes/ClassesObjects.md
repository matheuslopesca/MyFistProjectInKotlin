# Classes e Objetos: A Base da POO

Kotlin simplifica drasticamente a sintaxe para Orientação a Objetos comparado ao Java.

## Classe: O Molde
Uma classe define as características (propriedades) e comportamentos (funções/métodos) de um objeto.

```kotlin
class Carro {
    var cor: String = "Branco" // Propriedade
    
    fun ligar() {              // Método
        println("Vrumm")
    }
}
```

## Instanciando (Criando Objetos)
Em Java, usava-se a palavra `new`. Em Kotlin, **não existe `new`**.
Você chama a classe como se fosse uma função.
```kotlin
val meuFusca = Carro()
meuFusca.cor = "Azul"
meuFusca.ligar()
```

## Propriedades vs Campos (Fields)
Em Kotlin, `var cor: String` não é apenas um campo na memória. Por baixo dos panos, o Kotlin gera:
1.  Um campo privado (backing field).
2.  Um método `getCor()`.
3.  Um método `setCor(valor)`.

Quando você faz `carro.cor = "Azul"`, você está na verdade chamando o método `set`. Isso permite que no futuro você adicione lógica de validação no `set` sem quebrar o código de quem usa a classe.
