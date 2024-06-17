package ProjetoFinalJava;

abstract class ProdutoBase implements Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoBase(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public ProdutoBase() {
    }

    // Por ser private tem que fazer getter setter
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double subTotal() {
        return quantidade * preco;
    }


    public abstract String exibirDetalhes();
}
