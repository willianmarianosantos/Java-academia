package construtorEsexercicio1;

public class Pessoa {

    int idade;
    String nome;


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("Cadastrado nome e idade "+ this.nome+ this.idade );
    }

    public Pessoa(int idade) {
        this.idade = idade;
        System.out.println("Cadastrado  dade "+ this.idade);
    }



}
