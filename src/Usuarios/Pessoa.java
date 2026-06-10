package Usuarios;

import java.util.Scanner;

public abstract class Pessoa {
    private String nome;
    private int idade;

    protected void cadastroPessoa (){
        Scanner ler = new Scanner(System.in);
        System.out.printf("Nome: ");
        nome = ler.next();
        System.out.printf("Idade: ");
        idade = ler.nextInt();
    }

    protected void mostrarDados(){
        System.out.printf("\nNome: " + nome);
        System.out.printf("\nIdade: " + idade);
    }

}
