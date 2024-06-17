package interfaceExercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Aqui poderia criar mais uma classe chamada Principal usar o extends e criar uma string exiberMensagemAouB
        // instanciar ela e chamar ela na Main, tambem funcionaria assim.

        Mensagem m1 = new Mensagem() {
            @Override
            void exibeMensagemA() {
                System.out.println("Cuide bem dos animais");

            }

            @Override
            void exibeMensagemB() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite uma mensagem para preservar o planeta: ");
                String planeta = sc.nextLine();
                System.out.println("A mensagem digitada foi: "+ planeta);

            }
        };

    }
}