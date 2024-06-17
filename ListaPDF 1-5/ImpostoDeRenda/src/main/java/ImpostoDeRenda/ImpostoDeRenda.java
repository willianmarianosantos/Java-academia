package ImpostoDeRenda;

public class ImpostoDeRenda {

    public  Pessoa pessoa; // variavel de instancia, Pessoa é o tipo de variavel e pessoa é o nome da variavel.

    // Usei no ir1 e ir2
    public ImpostoDeRenda( Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    // Usei no ir13
    public ImpostoDeRenda(String nome, double salario) {
        this.pessoa = new Pessoa(nome, salario);
    }

    public void calcular() {
        int faixa = FaixaImpostoDeRenda.calcularFaixa(pessoa.salario);
        double imposto = 0;

        switch (faixa) {
            case 1:
                imposto = 0;
                break;
            case 2:
                imposto = (pessoa.salario * 0.075) - 158.40;
                break;
            case 3:
                imposto =  (pessoa.salario * 0.15) - 370.40;
                break;
            case 4:
                imposto =  (pessoa.salario * 0.225) - 651.73;
                break;
            case 5:
                imposto =  (pessoa.salario * 0.275) - 884.96;
                break;
        }

        double aliquotaEfetiva = imposto / pessoa.salario * 100;

        imprimir(faixa, imposto, aliquotaEfetiva);
    }

    public void imprimir(int faixa, double imposto, double aliquotaEfetiva) {
        System.out.println("Nome: " + pessoa.nome+ " Salário: R$ " + pessoa.salario+ " Faixa de IR: " + faixa + " Imposto a pagar: R$" + imposto + " Alíquota efetiva: " + aliquotaEfetiva + "%" );
    }
}

