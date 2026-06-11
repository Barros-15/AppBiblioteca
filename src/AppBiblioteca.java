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
                        System.out.println("Login realizado!");
                        if (pessoaLogada instanceof Aluno) {
                            System.out.println("Entrou como Aluno\n");
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
                                        System.out.printf("\nConsultar Emprestar Livro");
                                        break;
                                    case 3:
                                        System.out.printf("\nConsultar Devolver Livro");
                                        break;
                                    case 4:
                                        System.out.printf("\nSair\n");
                                }
                            }
                            // menuAluno();
                        } else if (pessoaLogada instanceof Bibliotecaria) {
                            System.out.println("Entrou como Bibliotecária");
                            // menuBibliotecaria();
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