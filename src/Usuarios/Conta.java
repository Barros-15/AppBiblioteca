package Usuarios;

import java.util.Scanner;

public class Conta {
    Scanner ler = new Scanner(System.in);
    private String login;
    private String senha;


    public void cadastrarLogin(){
        System.out.printf("\nDigite seu login: ");
        login = ler.next();
        System.out.printf("\nDigite seu senha: ");
        senha = ler.next();
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
