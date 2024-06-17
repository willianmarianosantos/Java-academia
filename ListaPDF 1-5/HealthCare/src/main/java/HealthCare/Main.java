package HealthCare;

public class Main {
    public static void main(String[] args) {

        Paciente paciente1 = new Paciente(77, 1.70);
        paciente1.setNome("Will");

        Paciente paciente2 = new Paciente(71, 1.72);
        paciente2.setNome("Lucas");

        Paciente paciente3 = new Paciente(52, 1.60);
        paciente3.setNome("Amanda");

        System.out.println("Diagnóstico do paciente " + paciente1.nome + ": will ficou em 34 " + paciente1.diagnostico());
        System.out.println("Diagnóstico do paciente " + paciente2.nome + ": " + paciente2.diagnostico());
        System.out.println("Diagnóstico do paciente " + paciente3.nome + ": " + paciente3.diagnostico());

    }
}