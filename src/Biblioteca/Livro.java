package Biblioteca;

public class Livro {
    private String livro;
    private String autor;
    private boolean diponivel;
    public Livro(String livro, String autor, boolean diponivel) {
        this.livro = livro;
        this.autor = autor;
        this.diponivel = diponivel;
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
