package br.digitalhouse.exercicio1;

public class Conta {
    private int numeroDaConta;
    private float saldoDaConta;
    private Cliente titularDaConta;

    //construtor específico
    public Conta (int novoNumConta){
        numeroDaConta = novoNumConta;
    }

    public Conta(float novoSaldoConta){
        saldoDaConta = novoSaldoConta;
    }

    public Conta(Cliente novoTitularConta){
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

    public void setTitularDaConta(Cliente titularDaConta){
        titularDaConta = novoTitularConta;
        //PAREI AQUI!!!
    }

    }

}
