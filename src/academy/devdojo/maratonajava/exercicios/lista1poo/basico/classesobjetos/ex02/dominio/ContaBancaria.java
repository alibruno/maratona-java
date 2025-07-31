package academy.devdojo.maratonajava.exercicios.lista1poo.basico.classesobjetos.ex02.dominio;

//Classe ContaBancaria
//  Atributos: número, titular, saldo
//  Métodos: depositar, sacar, consultarSaldo
//  Implemente validações (saldo não pode ficar negativo)

public class ContaBancaria {
    private String nome;
    private String titular;
    private double saldo;

    public ContaBancaria(String nome, String titular, double saldo) {
        this.nome = nome;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double saldoDepositado) {
        this.saldo += saldoDepositado;
    }

    public void sacar(double saque) {
        if (this.saldo < saque) {
            System.out.println("O seu saldo não pode ficar negativo.");
            return;
        }
        this.saldo -= saque;
    }

    public double consultarSaldo() {
        return this.saldo;
    }
}
