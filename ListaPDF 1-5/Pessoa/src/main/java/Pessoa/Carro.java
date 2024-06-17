package Pessoa;

public class Carro {

    // atributos
    String nome;
    String marca;
    int ano;
    int vel;


    // métodos, dentro do parateses os parametros do metodo, dentro das chaves vc define o que o metodo faz.

    void acelerar(int aceleracao) {vel+=aceleracao;}

    void freiar(int reduzir) {vel-=reduzir;}

    void buzinar(){System.out.println("bibibi"); }


}
