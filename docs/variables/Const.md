# variables10Const.kt

Constantes em tempo de compilação.

## Conceitos
- **`const val`**: Define uma constante cujo valor é conhecido em tempo de compilação.
- Deve ser declarada no "top-level" (fora de funções) ou em objetos companheiros.
- Diferente de `val` locais, `const val` é realmente constante no bytecode final.

```kotlin
const val msg = "Hi!" // Acessível globalmente
```
