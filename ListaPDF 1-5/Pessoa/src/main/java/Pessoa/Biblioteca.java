package Pessoa;
import java.util.List;
import java.util.ArrayList;


class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    // Add para adicionar um objeto dentro do array
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    //
    public void listarLivros() {
        System.out.println("Livros na biblioteca:");
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Ano de Publicação: " + livro.getAnoPublicacao());}
    }


}