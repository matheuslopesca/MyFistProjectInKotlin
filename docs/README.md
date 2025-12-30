# Documentação de Aprendizado Kotlin

Esta pasta contém a documentação detalhada e aprofundada de cada conceito da linguagem Kotlin, servindo como uma base de conhecimento completa.

## Guia de Estudo

### 1. Primeiros Passos (`fiststeps`)
- [Introdução e Main.kt](fiststeps/Main.md): O ponto de entrada, diferenças para Java e como o compilador trabalha.

### 2. Fundamentos (`variables`)
Conceitos que você usará em 100% dos códigos.
- [Leitura e Escrita (Input)](variables/Input.md)
- [Strings e Templates](variables/Strings.md)
- [Constantes (`const`)](variables/Const.md)
- [Tipos Numéricos](variables/NumericTypes.md): Int, Long, Double e o perigo do `0.1 + 0.2`.
- [Conversões](variables/Conversions.md)
- [Mutabilidade (`val` vs `var`)](variables/Variables.md): Por que preferir a imutabilidade?
- [Primitivos (Boolean/Char)](variables/Primitives.md)

### 3. Operadores (`operators`)
A matemática e lógica por trás do código.
- [Atribuição e Incremento](operators/Assignment.md)
- [Aritmética](operators/Arithmetic.md): A pegadinha da divisão inteira.
- [Lógica e Relacional](operators/LogicRelational.md): Curto-circuito e identidade.

### 4. Controle de Fluxo (`selection`, `repetition`)
- [Loops (For/While)](repetition/Loops.md)
- [Escopo e Shadowing](repetition/Scope.md): Onde as variáveis vivem.
- [Controle (Break/Continue)](repetition/FlowControl.md): Uso de Labels.
- [If / Else](selection/IfStructures.md): `if` como expressão.
- [When](selection/WhenStructures.md): O substituto poderoso do switch.

### 5. Funções (`functions`)
- [Parâmetros](functions/Parameters.md): Argumentos nomeados e valores padrão.
- [Funções Básicas](functions/Functions.md): Single-expression e retorno Unit.

### 6. Segurança (`nullable`)
- [Null Safety](nullable/NullSafety.md): Como o Kotlin evita o erro de um bilhão de dólares (NPE).

### 7. Orientação a Objetos (`classes`)
- [Modificadores de Visibilidade](classes/Visibility.md): public, private, internal.
- [Construtores](classes/Constructors.md): Primários, secundários e bloco `init`.
- [Classes e Objetos](classes/ClassesObjects.md): Propriedades vs Campos.

### 8. Prática (`exercises`)
- [Catálogo de Exercícios](exercises/Exercises.md): Lista do que foi praticado.
