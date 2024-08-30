package conta_model;

public class ContaBanco {
    protected String nome;
    protected String cpf;
    protected double saldo;
    protected int numeroConta;
    protected int agencia;
    protected String tipoConta;

    public ContaBanco(String nome, String cpf, double saldo, int numeroConta, int agencia, String tipoConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.tipoConta = tipoConta;
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    protected void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    protected void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }


}
