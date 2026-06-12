package Usuarios;

import java.util.Scanner;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private Conta conta;

    protected void cadastroPessoa (){
        Scanner ler = new Scanner(System.in);
        System.out.printf("Nome: ");
        nome = ler.next();
        //System.out.printf("Idade: ");
        //idade = ler.nextInt();
    }

    protected void mostrarDados(){
        System.out.printf("\nNome: " + nome);
        System.out.printf("\nIdade: " + idade);
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
