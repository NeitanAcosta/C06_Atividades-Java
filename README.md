# Projeto PCMania - C06 (Programação Orientada a Objetos)

Este repositório contém a solução de exercícios práticos, além do Projeto "PC Mania", desenvolvido como parte da disciplina de Programação Orientada a Objetos (C06) do Inatel.

## 👨‍🎓 Dados do Aluno
* **Nome:** Nathan Arruola da Costa
* **Curso:** GES
* **Matrícula:** 690

---

## 💻 Projeto: PC Mania
O sistema simula um terminal de compras de computadores com regras de precificação dinâmicas baseadas na matrícula do aluno.

## ⚙️ Funcionalidades do Sistema
* **Catálogo Dinâmico:** Exibição de 3 promoções de computadores (Apple, Samsung e Dell) com cálculo de preços em tempo real com base no número da matrícula.
* **Carrinho de Compras:** Adição contínua de itens ao carrinho com exibição do subtotal atualizado a cada iteração do menu.
* **Gestão de Dados Estáticos:** Tratamento dos dados do cliente e da matrícula de forma estática (hardcoded), isolando a entrada de dados (Scanner) estritamente para a seleção do menu, conforme os requisitos do projeto.
* **Resumo Final:** Geração de um "recibo" detalhando as configurações completas de cada máquina adquirida (Hardwares Básicos, Sistema Operacional e Memórias USB) e o valor total da compra.

---

## 🏗️ Estrutura e Arquitetura do Projeto
O projeto foi desenvolvido garantindo o alto rigor das regras de encapsulamento e dos relacionamentos UML exigidos:
* **Pacote Único (`pcmania`):** Todas as classes foram concentradas em um único pacote para facilitar a visibilidade "package-private" e evitar a criação de Getters e Setters desnecessários, evitando penalizações.
* **Composição (Losango Preto):** A instanciação de `HardwareBasico` e `SistemaOperacional` ocorre **dentro** da classe `Computador`, atrelando o ciclo de vida destas peças à existência da máquina.
* **Agregação (Losango Branco):** A `MemoriaUSB` é instanciada de forma independente e "injetada" no Computador através do método `addMemoriaUSB()`.
* **Métodos Utilitários:** Implementação do método `static` na classe `ProcessarPedido` para atuar como um *helper* independente.

---

## 🤖 Declaração de Uso de Inteligência Artificial

Em conformidade com as diretrizes da atividade, declaro o uso de Inteligência Artificial como assistente de arquitetura e depuração durante o desenvolvimento deste projeto. 

**Modelo Utilizado:** Google Gemini

**Prompts / Temas Discutidos:**
1. *"Tenho um diagrama UML e instruções. Como estruturar a classe Computador para respeitar estritamente as relações de Composição (com HardwareBasico e SistemaOperacional) e Agregação (com MemoriaUSB) em Java, sem utilizar a biblioteca ArrayList?"*
2. *"A instrução pede para organizar em pacotes, mas se eu criar pacotes separados para Cliente e Computador, acabo precisando criar setters indesejados. Qual a melhor prática estrutural neste caso?"*
3. *"Como aplicar o valor da minha matrícula (690) estaticamente para o cálculo dinâmico das promoções no switch case, de forma que o sistema já exiba o preço calculado no menu?"*
4. *"Análise de erro de compilação: 'cannot find symbol' ao tentar instanciar o Cliente e ajustes na utilização de métodos estáticos na classe ProcessarPedido."*

**Avaliação dos Resultados:**
O resultado da utilização da IA foi **altamente satisfatório**. Ao invés de apenas solicitar a geração do código completo, utilizei a ferramenta para debater decisões arquiteturais. A IA foi crucial para esclarecer a diferença prática de implementação entre Composição e Agregação no Java, orientar sobre a melhor organização de pacotes para manter o encapsulamento seguro (atributos `private` e zero métodos ociosos) e depurar pequenos erros de tipagem (como o uso do sufixo `f` em variáveis `float`). O processo foi transparente, ético e contribuiu profundamente para a sedimentação dos conceitos de POO ensinados em aula.
