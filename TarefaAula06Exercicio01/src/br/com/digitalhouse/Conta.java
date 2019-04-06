package br.com.digitalhouse;

public class Conta {

    private String conta;
    private Double saldo;
    private Cliente titular;

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Conta(String numeroConta, Double valorSaldo, Cliente nomeTitular) {

        conta = numeroConta;
        saldo = valorSaldo;
        titular = nomeTitular;

    }

    public void deposito(Double valorDeposito) {

        saldo = saldo + valorDeposito;
        System.out.println(titular.getNome() + " - DEPOSITO EFETUADO DE R$ " + valorDeposito + " - NOVO SALDO: R$" + saldo);

    }

    public void saque(Double valorSaque) {

        if (saldo < valorSaque) {
            System.out.println(titular.getNome() + ", SALDO INSUFICIENTE. SEU SALDO É: R$: " + saldo);

        } else {
            saldo = saldo - valorSaque;
            System.out.println(titular.getNome() + ", VOCE SACOU R$ " + valorSaque + " - NOVO SALDO: R$ " + saldo);
        }

    }

}
