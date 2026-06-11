import Usuarios.Aluno;
import Biblioteca.Livro;
import Usuarios.Bibliotecaria;
import Usuarios.Conta;
import Usuarios.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    Scanner ler = new Scanner(System.in);
    private String entrou;
    private int aluno1 = 1;
    private String bbl;


    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    ArrayList<Livro> livros = new ArrayList<Livro>();
    ArrayList<Bibliotecaria> bibliotecarias = new ArrayList<Bibliotecaria>();

    public void criarContaAluno(){
        Aluno aluno = new Aluno();
        Conta conta = new Conta();
        aluno.cadastrarAluno();
        conta.cadastrarLogin();
        alunos.add(aluno);
        aluno.setConta(conta);
    }
    public void criarContaBibliotecaria(){
        Bibliotecaria bibliotecaria = new Bibliotecaria();
        Conta conta = new Conta();
        bibliotecaria.contaBibliotecaria();
        conta.cadastrarLogin();
        bibliotecarias.add(bibliotecaria);
        bibliotecaria.setConta(conta);
    }

    public void cadastrarLivro(){
        Livro livro = new Livro();
        livro.cadastraLivro();
        livros.add(livro);
    }
    public void consultarLivro(){
        for (Livro livro : livros){
            livro.mostrarLivro();
        }
    }

    public Pessoa Login(){
        System.out.print("\nLogin: ");
        String login = ler.next();
        System.out.print("\nSenha: ");
        String senha = ler.next();
        for (Aluno aluno : alunos) {
            if (aluno.getConta().getLogin().equals(login) &&
                    aluno.getConta().getSenha().equals(senha)) {
                return aluno;

            }
        }
        for (Bibliotecaria biblio : bibliotecarias) {
            if (biblio.getConta().getLogin().equals(login) &&
                    biblio.getConta().getSenha().equals(senha)) {
                return biblio;
            }
        }
        return null;
    }
}
