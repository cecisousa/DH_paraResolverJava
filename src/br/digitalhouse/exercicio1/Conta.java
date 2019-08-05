package br.digitalhouse.exercicio1;

public class Conta {
    private int numeroDaConta;
    private float saldoDaConta;
    private Cliente titularDaConta;

    //construtor específico
    public Conta (int novoNumConta, float novoSaldoConta, Cliente novoTitularConta){
        numeroDaConta = novoNumConta;
        saldoDaConta = novoSaldoConta;
        titularDaConta = novoTitularConta;
    }

    //get

    public int getNumeroDaConta(){
        return numeroDaConta;
    }

    public float getSaldoDaConta() {
        return saldoDaConta;
    }

    public Cliente getTitularDaConta(){
        return titularDaConta;
    }

    //set
    public void setNumeroDaConta(int novoNumConta){
        numeroDaConta = novoNumConta;
    }

    public void setSaldoDaConta(float novoSaldoConta){
        saldoDaConta = novoSaldoConta;
    }

    public void setTitularDaConta(Cliente novoTitularConta){
        titularDaConta = novoTitularConta;
    }

    public void depositar(float quantiaDinheiro){
        saldoDaConta += quantiaDinheiro;
        System.out.println("Depósito realizado: seu novo saldo é " + saldoDaConta);
    }

    public void sacar(float quantiaDinheiro){
        if (saldoDaConta >= quantiaDinheiro){
            saldoDaConta -= quantiaDinheiro;
            System.out.println("Saque realizado: seu novo saldo é " + saldoDaConta);
        }
        else {
            System.out.println("Saldo insuficiente, ops!");
        }
    }



}
