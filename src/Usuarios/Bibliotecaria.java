package Usuarios;

import java.util.Scanner;

public class Bibliotecaria extends Pessoa{
    private String matriculaAcesso;
    private Conta conta;

    public void contaBibliotecaria(){
        Scanner leitor = new Scanner(System.in);
        cadastroPessoa();
        System.out.printf("\nDigite o matricula: ");
        matriculaAcesso = leitor.next();
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.printf("\nMostrar acesso: " + matriculaAcesso);
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
