package Biblioteca;

import Usuarios.Conta;
import Usuarios.Pessoa;

import java.util.Scanner;

public class Livro {
    Scanner ler = new Scanner(System.in);
    private String livro;
    private String autor;
    private boolean disponivel;
    private String opcao;
    private Pessoa quemEmprestou;



    public void cadastraLivro() {
        System.out.printf("\nDigite o nome do livro: ");
        this.livro = new Scanner(System.in).next();
        System.out.printf("\nDigite a autor do livro: ");
        this.autor = new Scanner(System.in).next();
        System.out.printf("\nDisponivel para emprestar");
        disponivel = true;
    }

    public void emprestarLivro(Pessoa pessoaLogado){
        if(this.disponivel == true){
            System.out.printf("\nLivro disponivel!");
            System.out.printf("\nDeseja emprestar ? ");
            opcao = ler.next();
            if(opcao.equals("Sim") || opcao.equals("sim") || opcao.equals("s") || opcao.equals("S")){
                  quemEmprestou = pessoaLogado;
                disponivel = false;
                System.out.printf("\nLivro emprestado!");
                return;
            }
        }
        if(this.disponivel == false){
            System.out.printf("\nLivro já esta emprestado!");
        }
        if(this.disponivel == true){
            if(opcao.equals("Não") || opcao.equals("não") || opcao.equals("n") || opcao.equals("N")){
                disponivel = true;
            }
        }
    }
    public void devolverLivro(Pessoa pessoaLogado){
        if(disponivel == false && quemEmprestou.getConta().getLogin().equals(pessoaLogado.getConta().getLogin())){
            System.out.printf("\nLivro devolvido!");
            disponivel = true;
            quemEmprestou = null;
        } else {
            System.out.printf("\nLivro errado!");
        }

    }

    public void mostrarLivro(){
        System.out.printf("\nLivro: " + livro);
        System.out.printf("\nAutor: " + autor);
    }

    public String getLivro() {
        return livro;
    }

    public String getAutor() {
        return autor;
    }
}
