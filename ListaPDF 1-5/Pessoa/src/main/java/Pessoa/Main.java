package Pessoa;

public class Main {
    public static void main(String[] args) {
        /*
         Entendo conceitos 1 referencia canal FernandaDev Classes, Objetos, Atributos, Métodos e Construtores
        //////////////////////////////////////////////////////////////////////////////////////////////////

        Carro c1 = new Carro();
        c1.nome = "Palio";
        c1.marca= "Fiat";
        c1.ano  = 2010;
        c1.vel  = 60;

        c1.acelerar(60);
        System.out.println("Velocidade com aceleracao: "+ c1.vel + "KM/h");
        c1.freiar(30);
        System.out.println("Velocidade com reducao: "+ c1.vel + "KM/h");

        c1.buzinar();   // Chamando o método para exibir informações que estao dentro dele


         Entendo conceitos 2 referencia canal FernandaDev Classes, Objetos, Atributos, Métodos e Construtores
        //////////////////////////////////////////////////////////////////////////////////////////////////


        Pessoa p1 = new Pessoa();

        p1.tamanho=5;

        p1.altura(170);
        System.out.println("Tamanho do pessoa: "+ p1.tamanho);

        p1.nomecompleto();

        //////////////////////////////////////////////////////////////////////////////////////////////////


         */

        //Objetos criados, os parametros na classe livros
        Livro livro1 = new Livro("Beren e luthien", "J. R. R. Tolkien", 1917);
        Livro livro2 = new Livro("Silmarillion", "J. R. R. Tolkien", 1977);
        Livro livro3 = new Livro("Os Filhos de Húrin", "J. R. R. Tolkien", 2007);



        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);


        // Chama o metodo que imprime os resultados na classe biblioteca
        biblioteca.listarLivros();




    }
}