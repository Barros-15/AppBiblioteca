package Biblioteca;

import java.util.Scanner;

public  class EmprestarLivro {
    Scanner ler = new Scanner(System.in);
    private String opcao;
    private boolean disponivel;
    public void emprestarLivro(){
        if(this.disponivel == true){
            System.out.printf("\nLivro disponivel!");
            System.out.printf("\nDeseja emprestar ? ");
            opcao = ler.next();
            if(opcao.equals("Sim") || opcao.equals("sim") || opcao.equals("s") || opcao.equals("S")){
                disponivel =! true;
                System.out.printf("\nLivro emprestado!");
            }
        }
        if(this.disponivel == false){
            System.out.printf("\nLivro emprestado!");
        }
        if(this.disponivel == true){
            if(opcao.equals("Não") || opcao.equals("não") || opcao.equals("n") || opcao.equals("N")){
                disponivel = true;
            }
        }
    }
    public void devolverLivro(){
        if(this.disponivel == false){
            System.out.printf("\nLivro devolvido!");
            disponivel = true;
        }
    }

}
