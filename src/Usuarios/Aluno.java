package Usuarios;

import java.util.Scanner;

public class Aluno  extends Pessoa{
    private String matricula;

   public void cadastrarAluno(){
       Scanner ler = new Scanner(System.in);
       cadastroPessoa();
       System.out.printf("\nMatricula: ");
       matricula = ler.next();
   }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.printf("\nMostrar matricula: " + matricula);
    }

}
