# Tablensor: Suíte de Ferramentas Desktop com JavaFX

## 1\. Introdução

Tablensor é uma aplicação desktop desenvolvida em Java, utilizando o framework JavaFX para a construção da interface gráfica. O projeto foi concebido como um portfólio de aprendizado, com o objetivo de aplicar e testar conceitos fundamentais de desenvolvimento de software, incluindo a criação de interfaces com FXML, manipulação de eventos e a aplicação do padrão arquitetural Model-View-Controller (MVC).

A aplicação consiste em um menu principal que serve como um hub para acessar diversas ferramentas de utilidade, cada uma operando em sua própria janela.

## 2\. Funcionalidades Principais

  * **Menu Principal Interativo:** Interface central com background de vídeo.
  * **Calculadora Padrão:** Ferramenta para realizar operações aritméticas básicas.
  * **Gerador de Senhas:** Utilitário para a criação de senhas seguras com base em critérios customizáveis.
  * **Conversor de Temperatura:** Módulo para a conversão de valores entre as escalas Celsius, Kelvin e Fahrenheit.
  * **Contador de Cliques:** Aplicação simples para registrar e exibir eventos de clique.

## 3\. Tecnologias Utilizadas

  * **Linguagem de Programação:** Java 17+
  * **Framework Gráfica:** JavaFX 21+
  * **Construção de UI:** FXML e Scene Builder
  * **IDE de Desenvolvimento:** IntelliJ IDEA

## 4\. Estrutura do Projeto

O projeto é organizado de forma modular, separando a lógica de cada ferramenta em seu próprio pacote para promover a coesão e o baixo acoplamento entre os componentes.

```
tablensor/
├── src/
│   └── application/
│       ├── Main.java                 # Ponto de entrada da aplicação
│       ├── MainMenu.fxml             # View do menu principal
│       ├── MainMenuController.java   # Controller do menu principal
│       │
│       ├── calculadora/
│       │   ├── Calculadora.fxml
│       │   └── CalculadoraController.java
│       │
│       ├── conversor/
│       │   ├── Conversor.fxml
│       │   └── ConversorController.java
│       │
│       ├── contador/
│       │   ├── Contador.fxml
│       │   └── ContadorController.java
│       │
│       └── gerador/
│           ├── Gerador.fxml
│           └── GeradorController.java
│
└── resources/
    ├── img/                          # Imagens e ícones
    └── videos/                       # Recursos de vídeo para o background
```

## 5\. Como Executar

Para compilar e executar o projeto localmente, siga os passos abaixo.

### Pré-requisitos

  * JDK (Java Development Kit) versão 17 ou superior.
  * JavaFX SDK versão 21 ou superior.
  * IntelliJ IDEA ou outra IDE com suporte a projetos Java.

### Configuração

1.  Clone o repositório para a sua máquina local:

    ```bash
    git clone https://github.com/seu-usuario/tablensor.git
    ```

2.  Abra o projeto na sua IDE.

3.  Configure o JavaFX SDK como uma biblioteca global no seu ambiente de desenvolvimento.

4.  Na configuração de execução (Run Configuration) da classe `application.Main`, adicione as seguintes opções de VM (VM Options):

    ```
    --module-path "CAMINHO_PARA_SUA_PASTA_LIB_DO_JAVAFX" --add-modules javafx.controls,javafx.fxml,javafx.media
    ```

    *Substitua `"CAMINHO_PARA_SUA_PASTA_LIB_DO_JAVAFX"` pelo caminho absoluto para a pasta `lib` do JavaFX SDK no seu sistema.*

5.  Execute a classe `application.Main`.

## 6\. Funcionalidades Detalhadas

### 6.1. Calculadora

Implementa as quatro operações aritméticas básicas (adição, subtração, multiplicação e divisão), processando a entrada do usuário e exibindo o resultado em tempo real.

### 6.2. Gerador de Senhas

Permite a criação de senhas seguras com base em critérios selecionados pelo usuário, incluindo o uso de letras maiúsculas, minúsculas, números e caracteres especiais. A senha gerada pode ser copiada para a área de transferência com um único clique.

### 6.3. Conversor de Temperatura

Realiza conversões bidirecionais entre as escalas Celsius, Kelvin e Fahrenheit. A interface permite que o usuário insira um valor, selecione as unidades de origem e destino, e calcule o resultado instantaneamente.

### 6.4. Contador de Cliques

Uma ferramenta simples projetada para registrar e exibir o número total de cliques em um botão
