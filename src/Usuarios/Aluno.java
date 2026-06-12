package Usuarios;

import java.util.Scanner;

public class Aluno  extends Pessoa{
    private String matricula;
    private Conta conta;

   public void cadastrarAluno(){
       Scanner ler = new Scanner(System.in);
       cadastroPessoa();
       //System.out.printf("\nMatricula: ");
       //matricula = ler.next();
   }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.printf("\nMostrar matricula: " + matricula);
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getMatricula() {
        return matricula;
    }


}
