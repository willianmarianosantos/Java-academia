package interfaceExercicio2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner agenda = new Scanner(System.in);

        System.out.print("Nome do compromisso: ");
        String nome = agenda.nextLine();

        System.out.print("Data do compromisso (dd/mm/aaaa): ");
        String data = agenda.nextLine();

        System.out.print("Hora do compromisso (hh:mm): ");
        String hora = agenda.nextLine();

        System.out.print("Compromisso profissional ou pessoal : ");
        String tipo = agenda.nextLine();


        InterfaceCompromisso compromisso;
        if (tipo.equals("Profissional")) {
            compromisso = new Profissional(nome, data, hora);
        } else if (tipo.equals("Pessoal")) {
            compromisso = new Pessoal(nome, data, hora);
        } else {
            System.out.println("Opção inválida, importante escrever Profissional ou Pessoal com a primeira letra Maiuscula, pois ainda nao tem tratamento");
            return;
        }
        compromisso.exibeCompromisso();
    }
}