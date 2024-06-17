package Exercicio3Heranca;


public class Pessoa {

    protected String nome;
    protected int idade;
    protected String telefone;

    Pessoa(String nome, int idade, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    // vai exibir tanto os atributos dentro do exir de pessoa quanto do funcionario
    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Telefone: " + telefone);
    }



}

