# variables11KeyboardInput.kt e variables12KeyboardScanner.kt

Entrada de dados via teclado.

## Conceitos
- **`readln()`**: Lê uma linha inteira do console como String.
- **`toInt()`, `toDouble()`**: Métodos de conversão explicíta para transformar a String lida em números.
- **`Scanner`**: Uso da classe `java.util.Scanner` para leitura de dados, útil para ler tokens específicos (como `nextInt()`), mostrando a interoperabilidade com Java.

```kotlin
val name = readln() // Leitura simples
val scanner = Scanner(System.`in`)
val n1 = scanner.nextInt() // Leitura com Scanner
```
