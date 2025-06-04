# 📋 PLANO DE TESTE - Lojinha do Zé

---

## 1. 🎯 Objetivo dos Testes

Garantir que as funcionalidades de criação de carrinho, compra, busca por produto e ordenação de busca por preço ou marca operem corretamente.

---

## 2. 📦 Escopo dos Testes

### ✔️ O que será testado

Funcionalidades que serão testadas:

| Funcionalidade                     | Descrição                                                                                  |
| ---------------------------------- | ------------------------------------------------------------------------------------------ |
| Adicionar ao carrinho              | Usuário poderá adicionar produtos ao carrinho                                              |
| Comprar o que está no carrinho     | Usuário poderá finalizar a compra via carrinho                                             |
| Comprar sem o carrinho             | Usuário poderá comprar um produto individualmente                                          |
| Buscar por produtos por categorias | Usuário poderá buscar produtos por marca, preço ,etc                                       |
| Login de usuario                   | Usuário poderá fazer login no sistema                                                      |
| Cadastro de cartão                 | Usuário poderá fazer cadastro de multiplos cartões e escolher entre eles na hora da compra |
| Opções de pagamento                | Usuário poderá escolher outras formas de pagamento como boleto ou PIX                      |

### ❌ O que **não** será testado

Funcionalidades que estão fora do escopo deste plano de teste:

| Funcionalidade fora do escopo | Justificativa                           |
| ----------------------------- | --------------------------------------- |
| Segurança                     | Será avaliada em uma fase futura        |
| Teste de carga                | Fora do escopo por falta de ferramentas |

---

## 3. ✅ Critérios de Sucesso

Critérios para considerar o teste como **bem-sucedido**:

| Funcionalidade                     | Critério de sucesso                                                      |
| ---------------------------------- | ------------------------------------------------------------------------ |
| Adicionar ao carrinho              | Carrinho deve receber produtos enviados                                  |
| Comprar o que está no carrinho     | Finalizar a compra e limpar o carrinho após o término                    |
| Comprar sem o carrinho             | Comprar um único produto sem precisar colocar no carrinho e sem afetá-lo |
| Buscar por produtos por categorias | Mostrar produtos apenas que contém os critérios de busca                 |
| Login de usuario                   | Criação de usuário e checagem por e-mail válido e senha alphanumérica    |
| Cadastro de cartão                 | Criação e escolha de cartão na compra                                    |
| Opções de pagamento                | Na compra o usuário pode escolher a forma de pagamento                   |

---

## 4. 🧪 Estratégia de Teste

Descreva a abordagem dos testes que serão realizados:

### Tipos de Testes Utilizados:

- [x] Testes Funcionais
- [x] Testes de Interface (UI)
- [ ] Testes de Usabilidade

### Método de Execução:

- [x] Manual
- [x] Automatizado
- [ ] Híbrido

---

## 5. 🧰 Recursos Necessários

### Equipamentos:

| Equipamento     | Especificações mínimas              |
| --------------- | ----------------------------------- |
| Celular Android | Versão 10 ou superior               |
| Computador      | Navegador Chrome/Firefox atualizado |

### Ferramentas:

| Ferramenta     | Finalidade           |
| -------------- | -------------------- |
| JUnit          | Testes automatizados |
| Chrome         | Testes manuais       |
| Firefox        | Testes manuais       |
| Microsoft edge | Testes manuais       |

### Equipe Envolvida:

| Função        | Quantidade |
| ------------- | ---------- |
| Testador      | 2          |
| Desenvolvedor | 2          |

---

## 6. 🛠️ Plano de Execução

### Etapas de Execução:

1. Preparação dos ambientes de teste.
2. Instalação da versão de teste do sistema.
3. Execução dos casos de teste manuais.
4. Registro de defeitos encontrados.
5. Análise de resultados.

### Ambiente de Teste:

| Ambiente        | Descrição                                |
| --------------- | ---------------------------------------- |
| Desenvolvimento | Versão com novas funcionalidades         |
| Homologação     | Ambiente próximo ao ambiente de produção |

---

## 7. 📆 Cronograma

| Atividade                   | Data de Início | Data de Término |
| --------------------------- | -------------- | --------------- |
| Planejamento do Teste       | 04/06/2025     | 04/06/2025      |
| Preparação do Ambiente      | 04/06/2025     | 04/06/2025      |
| Execução dos Testes         | 04/06/2025     | 05/06/2025      |
| Documentação dos Resultados | 05/06/2025     | 05/06/2025      |

---

## 8. ⚠️ Riscos e Mitigações

| Risco Identificado                                | Possível Impacto                                       | Estratégia de Mitigação                 |
| ------------------------------------------------- | ------------------------------------------------------ | --------------------------------------- |
| Incompatibilidade com Android antigo              | Aplicativo não abre em alguns aparelhos                | Testar em diferentes versões do Android |
| Falta de dispositivos de teste                    | Atraso nos testes manuais                              | Uso de emuladores                       |
| Incompatibilidade com navegadores menos acessados | Aplicativo não abre corretamente em alguns navegadores | Testar em outras versões                |

---
