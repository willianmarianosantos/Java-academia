package ClasseAtributo2;

public class Disciplina {
    public static void main(String[] args) {

        Professor p1 = new Professor();
        p1.nome = "Lucas prof";

        Laboratorio l1 = new Laboratorio();
        l1.local = "Uma nova sala";

        System.out.println("Nome :" + p1.nome);
        System.out.println("a sala é uma: " + l1.local);


    }

}