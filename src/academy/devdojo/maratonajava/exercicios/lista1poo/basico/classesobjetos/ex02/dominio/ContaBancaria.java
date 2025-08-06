package academy.devdojo.maratonajava.exercicios.lista1poo.basico.classesobjetos.ex02.dominio;

//Classe ContaBancaria
//  Atributos: número, titular, saldo
//  Métodos: depositar, sacar, consultarSaldo
//  Implemente validações (saldo não pode ficar negativo)

// Algumas exceções são customizadas pois seguem regras de negócio. Dependendo da aplicação, podem ser tratadas de formas diferentes.

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
        if (saldoDepositado < 0) {
            throw new IllegalArgumentException("Valor de depósito não pode ser negativo.");
        }
        this.saldo += saldoDepositado;
    }

    public void sacar(double saque) {
        if (saque < 0) {
            throw new IllegalArgumentException("Valor de saque não pode ser negativo.");
        }
        if (this.saldo < saque) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Saldo atual: R$ " + this.saldo);
        }
        this.saldo -= saque;
    }

    public double consultarSaldo() {
        return this.saldo;
    }
}
