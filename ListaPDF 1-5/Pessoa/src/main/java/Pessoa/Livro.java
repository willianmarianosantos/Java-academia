package Pessoa;

public class Livro {


    // Atriburos
    private String titulo;    // Neste caso privado para não ser acessado de fora da classe
    public String autor;     // Neste caso publico para ser acessado de fora da classe
    int anoPublicacao;


    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }


    // Metodo
    public String getTitulo() {
        return titulo; // Retorna o valor
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }



}
