package br.digitalhouse.exercicio1;

public class Cliente {
    private String nome;
    private String sobrenome;

    //construtor específico

    public Cliente(String novoNome, String novoSobrenome){
        nome = novoNome;
        sobrenome = novoSobrenome;

    }

    //get
    public String getNome() {
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    //set
    public void setNome(String novoNome){
        nome = novoNome;
    }

    public void setSobrenome(String novoSobrenome){
        sobrenome = novoSobrenome;
    }
}
