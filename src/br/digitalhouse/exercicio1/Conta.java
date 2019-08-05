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

}
