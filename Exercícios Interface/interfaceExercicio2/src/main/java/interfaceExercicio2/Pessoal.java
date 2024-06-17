package interfaceExercicio2;

class Pessoal extends Compromisso implements InterfaceCompromisso {
    public Pessoal(String nome, String data, String hora) {
        super(nome, data, hora); // Super da classe herdada
    }

    public void exibeCompromisso() {
        System.out.println(String.format("Compromisso Pessoal: %s - Data: %s - Hora: %s", nome, data, hora));
    }
}
