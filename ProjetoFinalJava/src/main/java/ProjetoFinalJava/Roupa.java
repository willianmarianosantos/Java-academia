package ProjetoFinalJava;

public class Roupa extends ProdutoBase {

    private String tamanho;
    private String cor;

    public Roupa(String nome, double preco, int quantidade, String tamanho, String cor) {
        super(nome, preco, quantidade);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public Roupa() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String exibirDetalhes() {
        return "Nome " + getNome() + ",Preço " + getPreco() + ",Quantidade " + getQuantidade() + ",Tamanho " + getTamanho() + ",Cor " + getCor();
    }


    public String getTipo() {
        return "Roupa";
    }
}
