package br.digitalhouse.exercicio1;

public class Exercicio1 {
    public static void main(String[] args) {
        Cliente clienteCecilia = new Cliente("Cecilia", "Sousa");
        Cliente clientePatricia = new Cliente("Patricia", "Sousa");
        Conta contaCecilia = new Conta(123456, 500.00f, clienteCecilia);
        Conta contaPatricia = new Conta(789000, 0.00f, clientePatricia);
        contaCecilia.depositar(200.00f);
        contaCecilia.sacar(600.00f);
        contaPatricia.depositar(1000.00f);
        contaPatricia.sacar(300.00f);
    }
}
