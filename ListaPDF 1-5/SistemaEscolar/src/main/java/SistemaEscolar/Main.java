package SistemaEscolar;

public class Main {
    public static void main(String[] args) {

        // Criar 5 alunos
        Aluno aluno1 = new Aluno("will", 29, 0001);
        Aluno aluno2 = new Aluno("Carlao", 39, 0002);
        Aluno aluno3 = new Aluno("Lucas", 18, 0003);
        Aluno aluno4 = new Aluno("Tiago", 20, 0004);
        Aluno aluno5 = new Aluno("Mateus", 20, 0005);


        // Criar 2 turmas e adicionar alunos a ambas
        Turma turma1 = new Turma("Turma A", "1A"); //  criar objeto turma 1 e instanciar ele
        turma1.adicionarAluno(aluno1); // objeto aluno adicionado a turma 1 ou 2 como preferir
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);

        Turma turma2 = new Turma("Turma B", "2B"); //  criar objeto turma 2 e instanciar ele
        turma2.adicionarAluno(aluno4);
        turma2.adicionarAluno(aluno5);

        // Listar alunos de cada turma
        turma1.listarAlunos();
        turma2.listarAlunos();



        // Aqui eu coloquei um objeto dentro de outro objeto, isso se chama composição


    }
}
