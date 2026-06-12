import Usuarios.Aluno;
import Usuarios.Bibliotecaria;
import Usuarios.Pessoa;

import java.util.Scanner;

public class AppBiblioteca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        Biblioteca biblioteca = new Biblioteca();


        while (opcao != 3) {
            System.out.printf("\nBem vindo ao Biblioteca LZ!\n");
            System.out.printf("\n[1] Login");
            System.out.printf("\n[2] Criar uma Conta");
            System.out.printf("\n[3] Sair\n");
            System.out.printf("Opão: ");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    Pessoa pessoaLogada = biblioteca.Login();
                    if (pessoaLogada != null) {
                        System.out.println("\nLogin realizado!");
                        if (pessoaLogada instanceof Aluno) {
                            System.out.println("\nEntrou como Aluno\n");
                            int i = 10;
                            while (i !=4) {
                                System.out.printf("\n[1] Consultar livro!");
                                System.out.printf("\n[2] Emprestar Livro");
                                System.out.printf("\n[3] Devolver Livro");
                                System.out.printf("\n[4] Sair\n");
                                i = input.nextInt();
                                switch (i) {
                                    case 1:
                                        System.out.printf("\nConsultar Livro");
                                        biblioteca.consultarLivro();
                                        break;
                                    case 2:
                                        System.out.printf("\nEmprestar Livro");
                                        biblioteca.emprestarLivro(pessoaLogada);
                                        break;
                                    case 3:
                                        System.out.printf("\nDevolver Livro");
                                        biblioteca.devolverLivro(pessoaLogada);
                                        break;
                                    case 4:
                                        System.out.printf("\nSair\n");
                                        pessoaLogada = null;
                                        i = 4;
                                }
                            }
                        }
                        else if (pessoaLogada instanceof Bibliotecaria) {
                            System.out.println("Entrou como Bibliotecária");
                            int i = 10;
                            while (i !=5) {
                                System.out.printf("\n[1] Cadastrar Livro");
                                System.out.printf("\n[2] Remover Livro");
                                System.out.printf("\n[3] Remover Conta");
                                System.out.printf("\n[4] Criar conta Aluno");
                                System.out.printf("\n[5] Sair\n");
                                i = input.nextInt();
                                switch (i) {
                                    case 1:
                                        System.out.printf("\nCadastrar Livro");
                                        biblioteca.cadastrarLivro();
                                        break;
                                    case 2:
                                        System.out.printf("\nRemover Livro:");
                                        biblioteca.removerLivro();
                                        break;
                                    case 3:
                                        System.out.printf("\nRemover Conta:");
                                        biblioteca.removerConta();
                                        break;
                                    case 4:
                                        System.out.printf("\nCriar conta Aluno:");
                                        biblioteca.criarContaAluno();
                                        break;
                                    case 5:
                                        System.out.printf("\nSair\n");
                                        i = 5;
                                }
                            }
                        }
                    } else {
                        System.out.println("Login ou senha incorretos!");
                    }

                    break;

                case 2:
                    int opcaoConta = 0;
                    while (opcaoConta != 3) {
                        System.out.printf("\nCriar uma Conta:\n[1] Aluno\n[2] Bibliotecaria" +
                                "\n[3] Retornar\nOpção: ");
                        opcaoConta = input.nextInt();
                        switch (opcaoConta) {
                            case 1:
                                System.out.printf("\nCriar uma Aluno: ");
                                biblioteca.criarContaAluno();
                                System.out.printf("\nSalvando conta!");
                                opcaoConta = 3;
                                break;
                            case 2:
                                System.out.printf("\nCriar uma Bibliotecaria: ");
                                biblioteca.criarContaBibliotecaria();
                                opcaoConta = 3;
                                break;
                            case 3:
                                System.out.printf("\nRetornando");
                                opcaoConta = 3;
                                break;
                        }
                    }
            }
        }
    }
}