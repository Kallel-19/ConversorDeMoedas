# 💱 Conversor de Moedas - Java

Aplicação em Java para conversão de moedas internacionais. O sistema consome uma API para obter taxas de câmbio atualizadas e permite converter valores entre diferentes moedas de forma simples e eficiente.

## 🚀 Funcionalidades

- ✅ Conversão de moedas entre:
  - 🇺🇸 USD → 🇦🇷 ARS (Dólar → Peso Argentino)
  - 🇦🇷 ARS → 🇺🇸 USD (Peso Argentino → Dólar)
  - 🇺🇸 USD → 🇧🇷 BRL (Dólar → Real Brasileiro)
  - 🇧🇷 BRL → 🇺🇸 USD (Real Brasileiro → Dólar)
  - 🇺🇸 USD → 🇨🇴 COP (Dólar → Peso Colombiano)
  - 🇨🇴 COP → 🇺🇸 USD (Peso Colombiano → Dólar)
- ✅ Obtenção de taxas de câmbio em tempo real via API
- ✅ Interface de console interativa
- ✅ Código modular e de fácil manutenção, seguindo boas práticas de POO

---

## 🏗️ Estrutura do Projeto

src/
├── App/
│ └── Main.java # Classe principal com o menu e execução
├── api/
│ ├── ConsultaAPI.java # Faz requisição à API de câmbio
│ └── ObterTaxas.java # Extrai taxas específicas
├── model/
│ ├── ConversorMoeda.java # Interface do conversor
│ └── ConversorPadrao.java # Implementação padrão de conversão
├── service/
│ └── FiltroMoedas.java # Record que representa as taxas filtradas

---

## 🔗 API Utilizada

- A API utilizada é a [ExchangeRate API](https://www.exchangerate-api.com/) ou uma API similar de câmbio.
- 🔑 **Observação:**
  
- É necessário possuir uma chave de API (API Key) se a API for protegida.

---

## ⚙️ Tecnologias

- Java (versão 17 ou superior recomendada)
- Biblioteca padrão Java (Scanner, HTTP e JSON)
- IDE recomendada: IntelliJ IDEA, Eclipse ou VSCode

---

## 🖥️ Como Executar o Projeto

### ✔️ Pré-requisitos
- Ter o **Java instalado** (versão 17 ou superior)
- (Opcional) Ter uma IDE instalada

### ✔️ Passos
1. Clone o repositório:
  git clone https://github.com/Kallel-19/conversor-moedas-java.git

🤝 Contribuições
Contribuições, sugestões e melhorias são bem-vindas! Sinta-se livre para abrir issues e pull requests.

👨‍💻 Autor
Desenvolvido por Kallel Vieira dos Santos. 🚀
