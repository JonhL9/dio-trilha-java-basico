# POO - Desafio

## Modelagem e Diagramação de um Componente iPhone
Com base no vídeo de [Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8), foi elaborado o diagrama de classes.

### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`
### Resultado
```mermaid
classDiagram
    class IPod {
        +avanvar()
        +recuar()
        +favoritar()
    }
    IPod : -List~Musica~ musicasFavoritas

    class AparelhoTelefonico {
        
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }
    AparelhoTelefonico : -List~Contatos~ contatos

    class Safari {
        +favoritar()
    }
    Safari : -List~String~ paginasFavoritas

    class iPhone {
    }

    class Musica {
        -String nome
        -String artista
    }

    class Contato {
        -String nome
        -String numero
    }

    class ReprodutorMusical{
    <<interface>>
    +tocar()
    +pausar()
    +selecionarMusica(String musica)
    }

    class NavegadorInternet{
    <<interface>>
    
    +exibirPagina(String url)
    +adicionarNovaAba()
    +atualizarPagina()
    }

    iPhone --> IPod
    iPhone --> AparelhoTelefonico
    iPhone --> Safari

    IPod ..|> ReprodutorMusical
    Safari ..|> NavegadorInternet

    IPod --o Musica
    AparelhoTelefonico --* Contato
```
