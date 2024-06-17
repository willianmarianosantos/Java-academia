package ExercicioHeranca4;


public class Aluno extends Pessoa{

    private String matricula;


    public Aluno(String nome, int rg,String matricula) {
        super(nome, rg);
        this.matricula = matricula;
    }

    public void apresentarDados(){
        System.out.println("Apresentando da pessoa: "+ this.nome +this.rg+this.matricula );
    }



}
