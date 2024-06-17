package HealthCare;

public class Paciente {

    public double peso;
    public double altura;
    public String nome;

    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String diagnostico() {
        double imc = calcularIMC();
        String resultado;


        // Usado IF else para fazer apresentar muitas "variaveis" desse calculo
        if (imc < 16) {
            resultado = "Baixo peso muito grave";
        } else if (imc < 17) {
            resultado = "Baixo peso grave";
        } else if (imc < 18.5) {
            resultado = "Baixo peso";
        } else if (imc < 25) {
            resultado = "Peso normal";
        } else if (imc < 30) {
            resultado = "Sobrepeso";
        } else if (imc < 35) {
            resultado = "Obesidade grau 1";
        } else if (imc < 40) {
            resultado = "Obesidade grau 2";
        } else {
            resultado = "Obesidade grau 3 (obesidade mórbida)";
        }
        return resultado;
    }
}
