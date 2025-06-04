## 🧪 ID: 001

### ✅ Nome do Teste:
Cadastro de novo usuário.

### 🎯 Descrição:
Sistema deve criar o cadastro de um novo usuário se os dados forem válidos.

### 🧰 Pré-requisitos:
- Usuário deve estar na tela inicial do sistema
- Banco de dados deve estar acessível

### 📝 Procedimentos (Passos para execução do teste):
1. Acessar a tela de cadastro.
2. Preencher os campos obrigatórios com dados válidos.
3. Clicar no botão de "Cadastrar".

### 🧾 Dados de Entrada:
| Campo            | Valor de Teste        |
|------------------|------------------------|
| Nome             | João da Silva          |
| Email            | joao@email.com         |
| Senha            | Senha123               |
| Confirmar Senha  | Senha123               |

### 💡 Resultado Esperado:
Usuário deve ser cadastrado com sucesso no banco de dados e ser redirecionado para página inicial da loja, com seu login já efetuado.

### 📌 Resultado Obtido:
Usuário foi cadastrado e redirecionado corretamente com o seu perfil logado.

### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---

## 🧪 ID: 002

### ✅ Nome do Teste:
Cadastro de novo usuário com dados inválidos.

### 🎯 Descrição:
Sistema NÃO deve criar o cadastro de um novo usuário com dados inválidos.

### 🧰 Pré-requisitos:
- Usuário deve estar na tela inicial do sistema.
- Banco de dados deve estar acessível.

### 📝 Procedimentos (Passos para execução do teste):
1. Acessar a tela de cadastro.
2. Preencher os campos obrigatórios com dados inválidos.
3. Clicar no botão de "Cadastrar".

### 🧾 Dados de Entrada:
| Campo            | Valor de Teste        |
|------------------|------------------------|
| Nome             | João                   |
| Email            | joao@email.com         |
| Senha            | senha123               |
| Confirmar Senha  | senha123               |

### 💡 Resultado Esperado:
Usuário não deve ser cadastrado com dados inválidos e se manter na mesma página de cadastro.

### 📌 Resultado Obtido:
Usuário não foi cadastrado e se manteve na página de cadastro.

### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---

## 🧪 ID: 003

### ✅ Nome do Teste:
Login do usuário no sistema.

### 🎯 Descrição:
Usuário deve entrar no sistema utilizando seu email e senha.

### 🧰 Pré-requisitos:
- Usuário deve estar na tela de login do sistema.
- Banco de dados deve estar acessível.

### 📝 Procedimentos (Passos para execução do teste):
1. Acessar a tela de login.
2. Preencher os campos obrigatórios com dados válidos.
3. Clicar no botão de "Login".

### 🧾 Dados de Entrada:
| Campo            | Valor de Teste        |
|------------------|------------------------|
| Email            | joao@email.com         |
| Senha            | senha123               |

### 💡 Resultado Esperado:
Usuário deve entrar no sistema e ser redirecionado pra página inicial da loja.

### 📌 Resultado Obtido:
Usuário entrou no sistema e foi redirecionado para página inicial da loja.

### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---

## 🧪 ID: 004

### ✅ Nome do Teste:
Adicionar produto ao carrinho.

### 🎯 Descrição:
Usuário deve conseguir adicionar produtos ao carrinho.

### 🧰 Pré-requisitos:
- Usuário deve estar na página do produto.

### 📝 Procedimentos (Passos para execução do teste):
1. Acessar a página do produto.
2. Clicar em "Adicionar ao carrinho".
3. Clicar no botão de "Confirmar".

### 💡 Resultado Esperado:
Usuário não deve ser redirecionado e produto deve ser adicionado à lista do carrinho.

### 📌 Resultado Obtido:
Usuário não foi redirecionado e produto foi adicionado ao carrinho.

### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---

## 🧪 ID: 005

### ✅ Nome do Teste:
Comprar produtos listados do carrinho.

### 🎯 Descrição:
Usuário deve entrar no carrinho de compras e comprar os produtos.

### 🧰 Pré-requisitos:
- Usuário deve estar na tela de carrinho de compras.

### 📝 Procedimentos (Passos para execução do teste):
1. Acessar a tela de carrinho de compras.
2. Clicar na opção de "Comprar agora".
3. Selecionar a forma de pagamento.
4. Clicar na opção de "Confirmar".

### 💡 Resultado Esperado:
Usuário deve ser redirecionado pra página de compra efetuada, com detalhes da compra.

### 📌 Resultado Obtido:
Usuário não foi redirecionado pois não há uma forma de pagamento cadastrada.

### ✅ Status do Teste:
- [ ] Aprovado
- [x] Reprovado

---

## 🧪 ID: 006

### ✅ Nome do Teste:
Cadastro de cartão na forma de pagamento.

### 🎯 Descrição:
Usuário deve cadastrar um cartão de crédito na página de pagamentos.

### 🧰 Pré-requisitos:
- Usuário deve estar na tela de formas de pagamento.
- Usuário deve estar logado na sua conta.

### 📝 Procedimentos (Passos para execução do teste):
1. Acessar a tela de "formas de pagamento".
2. Clicar em "Cadastrar novo cartão de crédito".
3. Inserir as informações do cartão de crédito, como número, data de vencimento e CVV.
4. Clicar no botão de "Cadastrar".

### 💡 Resultado Esperado:
Usuário deve ser redirecionado pra página de formas de pagamento, que mostra o novo cartão cadastrado.

### 📌 Resultado Obtido:
Usuário foi redirecionado pra página de formas de pagamento, mostrando novo cartão cadastrado.

### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---

## 🧪 ID: 007

### ✅ Nome do Teste:
Comprar produtos listados do carrinho.

### 🎯 Descrição:
Usuário deve entrar no carrinho de compras e comprar os produtos.

### 🧰 Pré-requisitos:
- Usuário deve estar na tela de carrinho de compras.

### 📝 Procedimentos (Passos para execução do teste):
1. Acessar a tela de carrinho de compras.
2. Clicar na opção de "Comprar agora".
3. Selecionar a forma de pagamento.
4. Clicar na opção de "Confirmar".

### 💡 Resultado Esperado:
Usuário deve ser redirecionado pra página de compra efetuada, com detalhes da compra.

### 📌 Resultado Obtido:
Usuário foi redirecionado para página de compra efetuada.

### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---

## 🧪 ID: 008

### ✅ Nome do Teste:
Comprar produtos individuais.

### 🎯 Descrição:
Usuário deve entrar na página do produto e comprar.

### 🧰 Pré-requisitos:
- Usuário deve estar na página do produto.
- Usuário deve ter um cartão cadastrado.

### 📝 Procedimentos (Passos para execução do teste):
1. Acessar a tela de produto.
2. Clicar na opção de "Comprar agora".
3. Selecionar a forma de pagamento.
4. Clicar na opção de "Confirmar".

### 💡 Resultado Esperado:
Usuário deve ser redirecionado pra página de compra efetuada, com detalhes da compra.

### 📌 Resultado Obtido:
Usuário foi redirecionado para página de compra efetuada.

### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---

## 🧪 ID: 009

### ✅ Nome do Teste:
Buscar produtos por categoria.

### 🎯 Descrição:
Usuário deve buscar por uma categoria de produto a ser listado.

### 🧰 Pré-requisitos:
- Usuário deve estar na tela inicial da loja.

### 📝 Procedimentos (Passos para execução do teste):
1. Clicar na opção de "Buscar".
2. Inserir a categoria.
3. Clicar em "Pesquisar".

### 🧾 Dados de Entrada:
| Campo de busca           |
|------------------|
| Tênis        |


### 💡 Resultado Esperado:
Deve ser listado uma lista de produtos da categoria "tênis".

### 📌 Resultado Obtido:
Foi listado uma lista de produtos da categoria "tênis".

### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---

## 🧪 ID: 010

### ✅ Nome do Teste:
Comprar produto com boleto.

### 🎯 Descrição:
Usuário deve comprar produto com a opção de pagamento boleto.

### 🧰 Pré-requisitos:
- Usuário deve estar logado no seu perfil.
- Usuário deve estar na tela de formas de pagamentos.

### 📝 Procedimentos (Passos para execução do teste):
1. Clicar na opção de "Comprar".
2. Selecionar a forma de pagamento "Boleto".
3. Clicar em "Comprar".

### 💡 Resultado Esperado:
Usuário deve ser redirecionado pra tela de "Confirmação de compra", onde deve ter a opção de gerar o boleto de pagamento.

### 📌 Resultado Obtido:
Usuário foi redirecionado pra tela de "Confirmação de compra" e apareceu a opção de gerar boleto de pagamento.

### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---

## 🧪 ID: 011

### ✅ Nome do Teste:
Testar sistema em versão antiga do Android.

### 🎯 Descrição:
Teste de funcionamento de sistema no Android 2.3.4 de 2011.

### 🧰 Pré-requisitos:
- Usuário deve usar um sistema de Android na versão 2.3.4 de 2011.
- Usuário deve ter um emulador de um Sony Ericsson Xperia Play.

### 📝 Procedimentos (Passos para execução do teste):
1. Fazer o download do sistema.
2. Acessar a aplicação.

### 💡 Resultado Esperado:
Usuário deve conseguir navegar normalmente pelo sistema da loja.

### 📌 Resultado Obtido:
Usuário não conseguiu acessar ao aplicativo, causando travamento e quebra de estilos. Não mostrando cores, fontes e imagens.

### ✅ Status do Teste:
- [ ] Aprovado
- [x] Reprovado

---

## 🧪 ID: 012

### ✅ Nome do Teste:
Testar sistema em navegador Netscape.

### 🎯 Descrição:
Teste de funcionamento de sistema no navegador antigo Netscape.

### 🧰 Pré-requisitos:
- Usuário deve usar navegador Netscape.

### 📝 Procedimentos (Passos para execução do teste):
1. Acessar o navegador Netscape.
2. Acessar a URL da loja online.

### 💡 Resultado Esperado:
Usuário deve conseguir navegar normalmente pelo sistema da loja.

### 📌 Resultado Obtido:
Usuário não conseguiu acessar ao site, causando quebra de estilos. Não mostrando cores, fontes e imagens.

### ✅ Status do Teste:
- [ ] Aprovado
- [x] Reprovado

---