package heranca;

public class Main {
    public static void main(String[] args) {

    Carro carro1 = new Carro();
    carro1.modelo ="Basiquinho";
    carro1.marca ="volvo";
    carro1.ano=1989;

        // mostra os valores, porem tambem posso criar uma lista e colocar essas informacoes dentro da lista e exibir
        System.out.println(String.format("Modelo: %s, Marca: %s,Ano: %d", carro1.modelo, carro1.marca, carro1.ano));




        
    }
}