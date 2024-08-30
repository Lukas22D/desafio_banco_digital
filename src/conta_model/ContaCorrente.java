package conta_model;

import interface_transaction.TransactionInterface;

public class ContaCorrente extends ContaBanco implements TransactionInterface {
    private double limiteChequeEspecial;
    

    public ContaCorrente(String nome, String cpf, double saldo, int numeroConta, int agencia, String tipoConta, double limiteChequeEspecial) {
        super(nome, cpf, saldo, numeroConta, agencia, tipoConta);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }


    @Override
    public void deposit(double value) {
        if(this.saldo < 0 && this.limiteChequeEspecial > 0) {
            if(this.saldo + value > 0) {
                this.limiteChequeEspecial += this.saldo + value;
                this.saldo = 0;
            } else {
                this.saldo += value;
            }
        } else {
            this.saldo += value;
        }
    }

    @Override
    public void withdraw(double value) {
        if(this.saldo - value < 0) {
            if(this.saldo + this.limiteChequeEspecial - value >= 0) {
                this.limiteChequeEspecial -= value - this.saldo;
                this.saldo = 0;
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            this.saldo -= value;
        }
    }

    @Override
    public void transfer(double value, int accountNumber, int agency) {
        if(this.saldo - value < 0) {
            if(this.saldo + this.limiteChequeEspecial - value >= 0) {
                this.limiteChequeEspecial -= value - this.saldo;
                this.saldo = 0;
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            this.saldo -= value;
        }
    }


    
}
