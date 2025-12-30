# Modificadores de Visibilidade

Controlam quem pode ver e mexer no seu código. Isso é crucial para o **Encapsulamento** (proteger o estado interno do objeto).

| Modificador | Visibilidade | Quem Acessa? |
| :--- | :--- | :--- |
| **`public`** | Pública (**Padrão**) | Todo mundo, em qualquer lugar. Se você omitir, é public. |
| **`private`** | Privada | Apenas dentro do **arquivo** (se for top-level) ou dentro da **classe**. Ninguém de fora vê. |
| **`protected`** | Protegida | A própria classe e suas **filhas (subclasses)**. |
| **`internal`** | Interna (Novo!) | Qualquer código dentro do **mesmo módulo** (projeto compilado junto). Invisível para quem importar sua biblioteca (jar) de fora. |

## Diferença chave para Java
- Em Java, o padrão (sem modificador) é "package-private" (visível no pacote).
- Em Kotlin, o padrão é `public`.
- O `internal` é uma invenção do Kotlin muito útil para criar componentes modulares onde várias classes conversam entre si, mas a API pública é limpa.
