# ✨AutomatedTests - Projeto de nivelamento sobre testes automatizados✨

## Testes Automatizados 🚀
Automação de teste é o uso de software para controlar a execução do teste de software, a comparação dos resultados esperados com os resultados reais. Este Script foi desenvolvido para demonstrar meu nível de conhecimento sobre testes automatizados, tem por objetivo testar e validar casos de uso para o site de [AutomaçãoWeb](https://automacaocombatista.herokuapp.com).

## Pré-requisitos 📝
Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas ou dependências:
- [Git](https://git-scm.com)
- [Java](https://www.java.com/pt-BR/)
- [JDK](https://www.oracle.com/java/technologies/downloads/)
- [JUnit 5](https://junit.org/junit5/docs/current/user-guide/)
- [Maven](https://maven.apache.org)

Além disto é bom ter uma IDE Java para trabalhar com o código como por exemplo o [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/) ou [Ecplipse](https://www.eclipse.org/downloads/) dentre outras.

## Execução 🚧👷
Esse tópico tem como objetivo ensinar como executar o projeto em questão.
- Abra o projeto
- Navegar até o pacote src/test/java/tests/
- Na classe de **teste** que deseje executar clique com o botão direito
- Clique no menu "Run **teste**"

## Padrão utilizado 📦
Aqui tem de forma exemplificada como são divididos os pacotes do projeto e o motivo.
- **projeto/src/main/model** - Pacote no qual fica classes modelos do projeto.
- **projeto/src/main/utilities** - Grupo de classes utilitárias que dão suporte ao projeto.
- **projeto/src/test/pages** - Responsável pelos elementos das páginas, tais como: selects, labels e etc... .
- **projeto/src/test/tasks** - Pacote que fica  as classes de meio campo entre classes de páginas e testes, responsáveis pelos métodos no qual fazem o teste acontecer partir de chamadas dos elementos das páginas.
- **projeto/src/test/tests** - Pacote que fica as classes responsáveis pelos testes e tem como prioridades chamar os métodos das classes de tasks. 

## GERAÇÃO DE RELATÓRIO ✔️
Após executar os testes, os relatórios serão gerados automaticamente na pasta **reports** na raiz do projeto, no qual vão ter o passo a passo, descrição e o resultado final de cada teste rodado.
