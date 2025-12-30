# Null Safety: O Fim do Erro de Bilhão de Dólares

O criador do conceito de referência nula (Tony Hoare) chamou isso de seu "erro de um bilhão de dólares", devido à quantidade de falhas de sistema causadas por `NullPointerException` (NPE) na história.
O sistema de tipos do Kotlin foi desenhado para eliminar o NPE do código.

## Tipos Nullable vs Non-Nullable
Kotlin separa o mundo em dois:

1.  **Não-Nulo (Padrão)**: `String`, `Int`, `Carro`.
    -   Nunca, em hipótese alguma, podem guardar `null`.
    -   Seguro de usar métodos e propriedades.
    -   `var s: String = null` -> **Erro de Compilação!** (O programa nem roda).

2.  **Anulável (Nullable)**: `String?`, `Int?`, `Carro?`.
    -   Podem guardar um valor ou `null`.
    -   Para acessar métodos, você é **obrigado** a verificar antes.
    -   `val l = s.length` -> **Erro de Compilação!** (E se s for null?).

## Ferramentas de Manuseio

### 1. Safe Call (`?.`)
"Se não for nulo, acesse. Se for nulo, retorne nulo e não quebre".
```kotlin
val tamanho: Int? = texto?.length 
// Se texto for null, tamanho vira null. O programa continua.
```

### 2. Elvis Operator (`?:`)
Dá um valor padrão caso o resultado seja nulo. (Parece o topete do Elvis).
```kotlin
val tamanho: Int = texto?.length ?: 0
// Se texto for null, usa 0. Garante que 'tamanho' nunca será nulo.
```
É muito usado para early-return: `val nome = pessoa.nome ?: return`

### 3. Not-Null Assertion (`!!`)
"Eu juro que não é nulo, confia em mim".
Converte forçadamente `String?` para `String`.
```kotlin
val t = texto!!.length
```
**Perigo**: Se você estiver errado e `texto` for nulo, o programa explode com `NullPointerException`. **Evite usar em produção** a menos que tenha 100% de certeza absoluta.
