# Escopo de Variáveis (Scope)

Baseado em `scope.kt`.

## Escopo de Bloco
Variáveis declaradas dentro de um bloco `{ ... }` (if, loop, função) só são visíveis dentro desse bloco.
- **Sombra (Shadowing)**: Uma variável interna pode ter o mesmo nome de uma externa, "escondendo" a externa dentro daquele escopo. Embora permitido, deve ser usado com cuidado para facilitar a leitura.
