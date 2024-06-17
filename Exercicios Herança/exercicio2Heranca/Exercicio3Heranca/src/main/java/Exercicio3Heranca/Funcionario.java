package Exercicio3Heranca;

public class Funcionario extends Pessoa{

    private  String setor;
    private  String cargo;
    private  String funcao;


    public Funcionario(String nome, int idade, String telefone, String setor, String cargo, String funcao) {
        super(nome, idade, telefone); // quando voce define um construtor em uma subclasse o nome fica super da superclsse
        this.setor = setor;
        this.cargo = cargo;
        this.funcao = funcao;
    }
    // Pessoa é uma superclasse de funcionario e funcionario é uma subclasse de pessoa
    public void exibir(){
        super.exibir();
        System.out.println("Setor: " + setor);
        System.out.println("Cargo: " + cargo);
        System.out.println("Função: " + funcao);
    }

    // Pessoa é uma superclasse de funcionario e funcionario é uma subclasse de pessoa




    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }
    public String getSetor() {
        return setor;
    }

    public String getCargo() {
        return cargo;
    }

    public String getFuncao() {
        return funcao;
    }

}
