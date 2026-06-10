import Usuarios.Aluno;
import Biblioteca.Livro;
import Usuarios.Bibliotecaria;
import Usuarios.Conta;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    Scanner ler = new Scanner(System.in);
    private String login;
    private String senha;


    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    ArrayList<Livro> livros = new ArrayList<Livro>();
    ArrayList<Bibliotecaria> bibliotecarias = new ArrayList<Bibliotecaria>();

    public void criarContaAluno(){
        Aluno aluno = new Aluno();
        Conta conta = new Conta();
        aluno.cadastrarAluno();
        conta.cadastrarLogin();
        alunos.add(aluno);
    }
    public void criarContaBibliotecaria(){
        Bibliotecaria bibliotecaria = new Bibliotecaria();
        Conta conta = new Conta();
        bibliotecaria.contaBibliotecaria();
        conta.cadastrarLogin();
        bibliotecarias.add(bibliotecaria);
        bibliotecaria.setConta(conta);
    }
    public Bibliotecaria login() {
        System.out.print("\nLogin: ");
        String login = ler.next();
        System.out.print("\nSenha: ");
        String senha = ler.next();

        for (Bibliotecaria bibliotecaria : bibliotecarias) {

            if (bibliotecaria.getConta().getLogin().equals(login)
                    && bibliotecaria.getConta().getSenha().equals(senha)) {

                return bibliotecaria;
            }
        }

        return null;
    }

}
