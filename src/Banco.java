import java.util.ArrayList;
import java.util.List;
import conta_model.ContaCorrente;

public class Banco {
    List<ContaCorrente> contas;
    ContaCorrente conta_logada;

    public Banco() {
        this.contas = new ArrayList<>();
        this.conta_logada = null;
    }

    public void criar_conta(String nome, String cpf, double saldo, int numeroConta, int agencia, String tipoConta, double limiteChequeEspecial) {
        ContaCorrente conta = new ContaCorrente(nome, cpf, saldo, numeroConta, agencia, tipoConta, limiteChequeEspecial);
        this.contas.add(conta);
    }

    void logar_conta(int numeroConta, int agencia) {
          contas.stream().filter( conta -> conta.getNumeroConta() == numeroConta && conta.getAgencia() == agencia).forEach(conta -> {
              this.conta_logada = conta;
          });
        }

    void deslogar_conta() {
        if(this.conta_logada != null) {
            this.conta_logada = null;
            System.out.println("Conta deslogada");
        }else {
            System.out.println("Nenhuma conta logada");
        }
    }
    

    void transferir(double value, int accountNumber, int agency) {
        if(this.conta_logada != null) {
            this.conta_logada.transfer(value, accountNumber, agency);
            this.contas.stream().filter(conta -> conta.getNumeroConta() == accountNumber && conta.getAgencia() == agency).forEach(conta -> {
                conta.deposit(value);
            });

        } else {
            System.out.println("Nenhuma conta logada");
        }
    }

    void depositar(double value) {
        if(this.conta_logada != null) {
            this.conta_logada.deposit(value);
        } else {
            System.out.println("Nenhuma conta logada");
        }
    }

    void sacar(double value) {
        if(this.conta_logada != null) {
            this.conta_logada.withdraw(value);
        } else {
            System.out.println("Nenhuma conta logada");
        }
    }
    

    void saldo() {
        if(this.conta_logada != null) {
            System.out.println("Saldo: " + this.conta_logada.getSaldo());
        } else {
            System.out.println("Nenhuma conta logada");
        }
    }

    void extrato() {
        if(this.conta_logada != null) {
            System.out.println("Extrato: " + this.conta_logada.getSaldo());
        } else {
            System.out.println("Nenhuma conta logada");
        }
    }
}
