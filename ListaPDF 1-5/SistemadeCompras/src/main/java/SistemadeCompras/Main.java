package SistemadeCompras;

public class Main {
    public static void main(String[] args) {


        // Criar alguns produtos diferentes
        Produto produto1 = new Produto("Arnaldos", 20.50, 2);
        Produto produto2 = new Produto("Rolls", 5, 5);
        Produto produto3 = new Produto("Coca", 1, 10);


        // Adicionar pelo menos 03 produtos ao carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);


        // Informar no console os produtos no carrinho e seus sub-totais, bem como o valor total da compra
        carrinho.listarProdutos();




    }
}