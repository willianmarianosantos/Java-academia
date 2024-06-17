package ProjetoFinalJava;

public class Eletronico extends ProdutoBase {

    private int garantiaMeses;

    public Eletronico(String nome, double preco, int quantidade, int garantiaMeses) {
        super(nome, preco, quantidade);
        this.garantiaMeses = garantiaMeses;
    }

    public Eletronico() {
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    // Se extender um metodo abstrato nao precisa marcar com @Override

    public String exibirDetalhes() {
        return "Nome " + getNome() + ",Preço" + getPreco() + ",Quantidade" + getQuantidade() + "Garantia" + getGarantiaMeses();
    }

    public String getTipo() {
        return "Eletronico";
    }
}