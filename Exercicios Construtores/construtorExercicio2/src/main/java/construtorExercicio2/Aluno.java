package construtorExercicio2;

public class Aluno {

    String nome;
    String matricula;
    String dataDeNascimento;
    String anoIngressado;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Aluno(String datadenascimento) {
        this.dataDeNascimento = datadenascimento;
    }

    public Aluno(String anoIngressado, String nome, String dataDeNascimento) {
        this.anoIngressado = anoIngressado;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

}
