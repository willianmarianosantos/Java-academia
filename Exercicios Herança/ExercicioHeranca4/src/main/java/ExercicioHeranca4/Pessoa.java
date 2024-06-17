package ExercicioHeranca4;
// # protected   + publico  - privado

public class Pessoa {

    protected String nome;
    protected int rg;

    public Pessoa(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;
    }

    private void apresentarDados(){
        System.out.println("Apresentando da pessoa: "+ this.nome +this.rg );
    }



}
