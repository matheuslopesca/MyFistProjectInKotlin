# Diretrizes para o Agente de IA (Agent Directives)

Este documento define as regras e padrões para que futuros assistentes de IA mantenham e expandam a documentação deste projeto de aprendizado em Kotlin.

## 🎯 Objetivo
Manter a pasta `docs/` sincronizada com o código em `src/main/kotlin`, servindo como uma base de conhecimento pessoal do progresso do usuário na linguagem Kotlin.

## 📝 Regras Gerais
1.  **Idioma**: Toda documentação deve ser escrita em **Português (PT-BR)**.
2.  **Tom de Voz**: Educacional, claro e encorajador. Explique o *porquê* e o *como*.
3.  **Localização**:
    -   Código Fonte: `src/main/kotlin/<modulo>/<arquivo>.kt`
    -   Documentação: `docs/<modulo>/<NomeDescritivo>.md`

## ⚙️ Workflow para Novos Arquivos
Sempre que o usuário adicionar novos códigos ou exercícios:

1.  **Analise a Estrutura**:
    -   Identifique a qual módulo o arquivo pertence (ex: `collections`, `coroutines`).
    -   Se for um módulo novo, crie a pasta correspondente em `docs/` e adicione uma entrada no índice do `docs/README.md` e no `README.md` da raiz.

2.  **Crie a Documentação**:
    -   Crie um arquivo Markdown na pasta correspondente em `docs/`.
    -   **Nome do Arquivo**: Use PascalCase (ex: `Listas.md` ou `CoroutinesBasico.md`). Tente agrupar conceitos similares (ex: `ArrayList` e `LinkedList` podem estar em `Listas.md`).

3.  **Estrutura do Markdown**:
    ```markdown
    # Título do Conceito (NomeDoArquivo.kt)

    Breve introdução sobre o que é este conceito.

    ## Conceitos Chave
    - **Termo Importante**: Explicação.
    - **Outro Termo**: Explicação.

    ## Exemplo
    Explicação do que o código faz.
    
    \`\`\`kotlin
    // Trecho de código relevante
    val lista = listOf(1, 2, 3)
    \`\`\`
    ```

4.  **Atualize os Índices**:
    -   Se criou um novo arquivo `.md`, adicione-o ao `README.md` da raiz ou ao índice da pasta `docs/` se pertinente.

## 📂 Padrão de Diretórios
Mantenha o espelhamento da estrutura:
`src/main/kotlin/topico` ➡️ `docs/topico`

## 💡 Dicas Adicionais
-   Ao documentar exercícios (`src/main/kotlin/exercises`), atualize a tabela no arquivo `docs/exercises/Exercises.md` com o nome do arquivo e o conceito praticado.
-   Destaque diferenças entre Java e Kotlin se relevante (ex: "Ao contrário de Java, aqui...").
-   Foque nos "Code Snippets" que demonstram a sintaxe única do Kotlin.
