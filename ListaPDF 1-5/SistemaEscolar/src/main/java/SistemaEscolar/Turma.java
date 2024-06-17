package SistemaEscolar;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    String nome;
    String codigo;
    List<Aluno> alunos=new ArrayList<>();

    public Turma(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    // add para adicionar alunos na lista,  " add, remove,set, get "
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }



    // A variável aluno representará cada elemento da lista alunos, que é do tipo Aluno.
    // Aluno = tipo
    // alunos = lista
    // aluno = variavel de classe

    public void listarAlunos() {
        System.out.println("Alunos na turma " + nome + " " + codigo + " ");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() +
                    ", Idade: " + aluno.getIdade() +
                    ", Matrícula: " + aluno.getMatricula());
        }
        System.out.println();
    }



}
