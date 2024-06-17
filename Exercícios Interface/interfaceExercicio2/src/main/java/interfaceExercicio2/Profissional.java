package interfaceExercicio2;

class Profissional extends Compromisso implements InterfaceCompromisso {
    public Profissional(String nome, String data, String hora) {
        super(nome, data, hora); // Super da classe herdada
    }

    public void exibeCompromisso() {
        System.out.println(String.format("Compromisso Profissional: %s - Data: %s - Hora: %s", nome, data, hora));
    }
}
