package construtorExercicio2;

public class Main {
    public static void main(String[] args) {

    Aluno A1 = new Aluno("2005 ", "Marcos" );
    Aluno A2 = new Aluno("1989 ");
    Aluno A3 = new Aluno("2020 ", "Will ","1989");

        System.out.println(A1.nome+ A1.matricula);
        System.out.println(A2.dataDeNascimento);
        System.out.println(A3.anoIngressado+A3.nome+A3.dataDeNascimento);

    }
}