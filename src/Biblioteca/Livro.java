package Biblioteca;

import java.util.Scanner;

public class Livro {
    private String livro;
    private String autor;
    private boolean diponivel;

    public void cadastraLivro() {
        System.out.printf("Digite o nome do livro: ");
        this.livro = new Scanner(System.in).next();
        System.out.printf("Digite a autor do livro: ");
        this.autor = new Scanner(System.in).next();
        emprestarLivro();
        devolverLivro();
    }
    public void emprestarLivro(){
        if (diponivel == true){
            System.out.printf("\nLivro emprestado!\n");
        } else{System.out.printf("\nLivro já emprestado!\n");}
    }
    public void devolverLivro(){
        if (diponivel == true){}
    }

    public void mostrarLivro(){
        System.out.printf("\nLivro: \n" + livro +
                " de: " + autor);
    }
}
