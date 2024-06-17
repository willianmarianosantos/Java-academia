package exercicio2Heranca;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Pessoa p1 = new Pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome");
        p1.nome =sc.next();
        System.out.println(p1.nome);

        System.out.println("Digite a idade");
        p1.idade =sc.nextInt();
        System.out.println(p1.idade);

        System.out.println(p1.medotoDeFalar() +" "+ p1.metodoDeAndar());

    }

}