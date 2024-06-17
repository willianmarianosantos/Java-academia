package ImpostoDeRenda;

public class Main {
    public static void main(String[] args) {
        // Criando objetos Pessoa
        Pessoa pessoa1 = new Pessoa("Willian", 5700);
        Pessoa pessoa2 = new Pessoa("Jessia", 2950);

        ImpostoDeRenda ir1 = new ImpostoDeRenda(pessoa1); // Declarando direto no objeto
        ImpostoDeRenda ir2 = new ImpostoDeRenda(pessoa2); // Declarando direto no objeto

        ImpostoDeRenda ir3 = new ImpostoDeRenda("Ricardo", 25000   ); // Usando com parametros


        ir1.calcular();
        ir2.calcular();
        ir3.calcular();
    }
}
