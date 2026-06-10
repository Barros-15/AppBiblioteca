import Usuarios.Bibliotecaria;

import java.util.Scanner;

public class AppBiblioteca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        Biblioteca biblioteca = new Biblioteca();


        while (opcao != 0) {
            System.out.printf("\nBem vindo ao Biblioteca LZ!\n");
            System.out.printf("\n[1] Login");
            System.out.printf("\n[2] Criar uma Conta");
            System.out.printf("\n[3] Sair\n");
            System.out.printf("Opão: ");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    biblioteca.login();


                    break;

                case 2:
                    int opcaoConta = 0;
                    while (opcaoConta != 0) {
                        System.out.printf("\nCriar uma Conta: \n[1] Aluno \n [2]Bibliotecaria" +
                                " \n[3] Retornar \n Opção: ");
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