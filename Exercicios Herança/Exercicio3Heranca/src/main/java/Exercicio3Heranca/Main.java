package Exercicio3Heranca;
import java.util.Scanner;


import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ArrayList<Funcionario>: Isso especifica que a lista irá conter objetos do tipo Funcionario.
        //ArrayList é um tipo de lista genérica em Java, o que significa que pode conter elementos de qualquer tipo especificado entre os sinais de menor e maior ("<" e ">"). Neste caso, o tipo especificado é Funcionario.
        //lista: Este é o nome da variável que será atribuída à instância de ArrayList. poderia ser qualquer nome aqui

        ArrayList<Funcionario> lista = new ArrayList<>(); // para usar  depois dentro do for
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            System.out.println("Cadastro do Funcionário " + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = Integer.parseInt(scanner.nextLine());
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();
            System.out.print("Setor: ");
            String setor = scanner.nextLine();
            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();
            System.out.print("Função: ");
            String funcao = scanner.nextLine();

            // adiciona o objeto funcionario do for no objeto ArrayList fora do for
            Funcionario funcionario = new Funcionario(nome, idade, telefone, setor, cargo, funcao);
            lista.add(funcionario);
            System.out.println("Funcionário cadastrado com sucesso!\n");


        }

        for( Funcionario list : lista) {
            System.out.println( String.format(""" 
                    Nome: %s, Idade: %d, Telefone: %s,Setor: %s, Cargo: %s, Função: %s
                    """, list.getNome(),list.getIdade(),list.getTelefone(),list.getSetor(),list.getCargo(),list.getFuncao()) );

        }
    }
}