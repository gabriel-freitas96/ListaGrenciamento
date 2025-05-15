# 📋 Sistema de Gerenciamento de Atividades

## 📌 Descrição do Projeto

Este sistema permite ao usuário gerenciar uma lista de atividades por meio de uma interface de menu interativo no console. O gerenciamento é feito utilizando estruturas de dados como **arrays** ou **ArrayList**. O sistema possui funcionalidades completas, como:

- Adicionar atividades
- Pesquisar por título
- Excluir, atualizar, iniciar e finalizar atividades
- Listar atividades por status

---

## 📖 Funcionalidades do Menu

O sistema apresenta um menu principal com as seguintes opções:

1. ➕ **Adicionar Nova Atividade**  
2. 🔍 **Pesquisar Atividade por Título**  
3. ❌ **Excluir Atividade pelo Título**  
4. ✏️ **Atualizar Atividade pelo Título**  
5. ▶️ **Iniciar Atividade**  
6. ✅ **Finalizar Atividade**  
7. 📄 **Listar Atividades** (com submenu de filtro)  
8. 🚪 **Sair do Sistema**

---

## 🛠️ Detalhes das Operações

### ➕ Adicionar Nova Atividade
- Solicita título e descrição da atividade.
- Define o status inicial como **Pendente**.
- Exibe: `Nova atividade cadastrada com sucesso!`

### 🔍 Pesquisar Atividade por Título
- Busca a atividade pelo título informado.
- Se encontrada, exibe **título**, **descrição** e **status**.
- Caso contrário, exibe: `Atividade não encontrada.`

### ❌ Excluir Atividade pelo Título
- Permite excluir a atividade com base no título.
- Sucesso: `Atividade excluída com sucesso!`
- Erro: `Atividade não encontrada.`

### ✏️ Atualizar Atividade pelo Título
- Solicita o título da atividade a ser atualizada.
- Permite alterar título e descrição.
- Sucesso: `Atividade atualizada com sucesso!`
- Erro: `Atividade não encontrada.`

### ▶️ Iniciar Atividade
- Solicita o título da atividade.
- Se o status for **Pendente**, muda para **Em andamento**.
- Sucesso: `Atividade iniciada com sucesso!`
- Erro: `Atividade não encontrada.`

### ✅ Finalizar Atividade
- Solicita o título da atividade.
- Se o status for **Em andamento**, muda para **Concluída**.
- Sucesso: `Atividade finalizada com sucesso!`
- Erro: `Atividade não encontrada.`

---

## 📄 Submenu: Listar Atividades

Oferece opções de filtro para listagem:

1. Listar **Todas** as atividades  
2. Listar **Apenas Pendentes**  
3. Listar **Apenas Em andamento**  
4. Listar **Apenas Concluídas**  
5. Voltar ao menu principal  

### Mensagens de retorno:
- `Nenhuma atividade pendente cadastrada.`
- `Nenhuma atividade em andamento cadastrada.`
- `Nenhuma atividade concluída cadastrada.`
- `Nenhuma atividade cadastrada.`

---

## 💬 Feedback ao Usuário

Todas as operações fornecem mensagens claras para orientar o usuário, como:

- `Nova atividade cadastrada com sucesso!`
- `Atividade excluída com sucesso!`
- `Atividade atualizada com sucesso!`
- `Atividade iniciada com sucesso!`
- `Atividade finalizada com sucesso!`
- `Operação falhou: atividade não encontrada.`

---

## 🧰 Tecnologias Utilizadas

- **Java** (console application)
- Estruturas: `Array`, `ArrayList`, ou `HashMap`
- IDE recomendada: **Eclipse**, **IntelliJ**, ou qualquer editor compatível com Java

---

## 📎 Autor
-Gabriel Lacerda
-Miguel Viana
-Samires do Carmo
