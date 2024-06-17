package SistemadeCompras;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;


    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome(){ return nome; }
    public double getPreco(){ return preco; }
    public int getQuantidade(){ return quantidade; }
    public double getSubtotal(){ return preco*quantidade; }

}
