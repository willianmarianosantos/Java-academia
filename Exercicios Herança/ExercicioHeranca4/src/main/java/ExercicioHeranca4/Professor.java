package ExercicioHeranca4;

public class Professor extends  Pessoa{

    private String matricula;
    private double  salario;


    public Professor(String nome, int rg, String matricula,double salario ) {
        super(nome, rg);
        this.matricula = matricula;
        this.salario = salario;

    }

    public void apresentarDados(){
        System.out.println("Apresentando da pessoa: "+ this.nome +this.rg+this.matricula+this.salario );
    }



    // Generalization (Herança – conector com seta em uma das pontas) –  É um tipo de relacionamento onde a classe generalizada (onde a “ponta da seta” do conector fica) fornece recursos para a classe especializada (herdeira). Excetuando conceitos mais avançados (como padrões de projeto, interfaces, visibilidades específicas etc.), tudo que a classe mãe (generalizada) tem, a filha (especializada) terá.


}
