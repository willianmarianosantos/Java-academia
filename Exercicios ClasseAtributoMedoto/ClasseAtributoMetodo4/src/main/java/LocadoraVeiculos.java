import java.util.Scanner;

public class LocadoraVeiculos {

    public static void main(String[] args) {

        Moto m1 = new Moto();
        Moto m2 = new Moto();
        Carro c1 = new Carro();

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a marca do carro: ");
         c1.marca = leitura.nextLine();

        System.out.println("Digite o modelo do carro: ");
        c1.modelo = leitura.nextLine();

        System.out.println("Digite a cilindarada do carro: ");
        c1.cilindradas = leitura.nextInt();
        leitura.nextLine(); // limpeza de buffer



        System.out.println("Digite a marca da moto: ");
        m1.marca = leitura.nextLine();

        System.out.println("Digite o modelo da moto: ");
        m1.modelo = leitura.nextLine();

        System.out.println("Digite a cilindarada da moto: ");
        m1.cilindradas = leitura.nextInt();
        leitura.nextLine(); // limpeza de buffer



        System.out.println("Digite a marca da outra  moto: ");
        m2.marca = leitura.nextLine();

        System.out.println("Digite o modelo da outra moto: ");
        m2.modelo = leitura.nextLine();

        System.out.println("Digite a cilindarada da outra moto: ");
        m2.cilindradas = leitura.nextInt();
        leitura.nextLine(); // limpeza de buffer

        System.out.println(c1.toString());
        System.out.println(m1.toString());
        System.out.println(m2.toString());

    }

}
