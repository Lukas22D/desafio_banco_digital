# Banco Simples em Java

Este projeto é uma implementação simples de um sistema bancário em Java, que permite a criação e gestão de contas correntes. O sistema oferece um menu interativo que permite ao usuário realizar operações como criar contas, fazer login em uma conta, consultar saldo, realizar depósitos, saques e transferências entre contas.

## Funcionalidades

- **Criar Conta**: Criação de uma nova conta corrente com nome, CPF, saldo inicial, número da conta, agência, tipo de conta e limite de cheque especial.
- **Login em Conta**: Login em uma conta existente usando número da conta e agência.
- **Deslogar Conta**: Logout da conta atualmente logada.
- **Consultar Saldo**: Exibição do saldo disponível na conta logada.
- **Consultar Extrato**: Exibição do extrato da conta logada (simplesmente mostra o saldo atual).
- **Depositar**: Permite adicionar um valor ao saldo da conta logada.
- **Sacar**: Permite retirar um valor do saldo da conta logada.
- **Transferir**: Permite transferir um valor da conta logada para outra conta dentro do banco.
- **Sair**: Finaliza a aplicação.

## Estrutura do Projeto

O projeto é composto pelos seguintes arquivos e classes:

- **Banco.java**: Contém a lógica principal do banco e o menu interativo que permite a interação do usuário.
- **ContaCorrente.java**: Representa uma conta corrente, com atributos como saldo, limite de cheque especial e métodos para operações bancárias.
- **TransactionInterface.java**: Interface que define os métodos básicos de transações (depósito e saque) a serem implementados por classes de contas.

## Como Executar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/banco-simples-java.git
   ```

   ```bash
   Bem-vindo ao Banco
1. Criar Conta
2. Logar na Conta
3. Deslogar da Conta
4. Ver Saldo
5. Ver Extrato
6. Depositar
7. Sacar
8. Transferir
9. Sair
Escolha uma opção: 1

Nome: João Silva
CPF: 12345678900
Saldo inicial: 1000.0
Número da conta: 1234
Agência: 5678
Tipo de Conta: Corrente
Limite Cheque Especial: 500.0
Conta criada com sucesso!

Escolha uma opção: 2
Número da conta: 1234
Agência: 5678
Logado com sucesso!

Escolha uma opção: 4
Saldo: 1000.0
```
