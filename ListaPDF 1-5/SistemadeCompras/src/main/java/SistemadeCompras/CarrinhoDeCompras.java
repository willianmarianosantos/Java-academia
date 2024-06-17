package SistemadeCompras;
import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompras {

    public List<Produto> produtos = new ArrayList<Produto>();  // Criando objeto List para falar que é lista, ai o Tipo no casso uma classe e o nome, no final ArrayList

    public void adicionarProduto(Produto produto) {produtos.add(produto);}// Metodo adicionarProduto

    // Agora vem o calculo em forma de metodo da classe

    public double calcularTotal(){

        double total = 0;
        for (Produto produto : produtos) { total += produto.getSubtotal(); }
        return total;
    }

                                            // Essa parte foi feito depois por isso a data e diferente, pois até o dia 02/06 eu não conseguia fazer.

    // Interpolação de String, String.format  é um metodo estatico da classe string do java que permite formatar strings de forma flexivel
    // E eficiente, uma vantagem é o dodigo mais legivel de entender, pois separa os valores dos formatadores
    // Segurança contra injeçao de cidigo; evita problemas de injecao de codigo, pois os valores sao tratados como dados e não como codigo
    public void listarProdutos() {
        System.out.println("Produtos no carrinho:");
        for (Produto produto : produtos) {
            System.out.println(String.format("""
                    Nome:  %s,
                    Valor unidade: R$ %.2f,
                    Quantidade: %d,
                    Sub total: R$ %.2f,
                    """, produto.getNome(), produto.getPreco(), produto.getQuantidade(), produto.getSubtotal()));
            System.out.println(); // Só pular linha
        }
        System.out.println("Total: R$ " + calcularTotal()); // chama e exibe o metodo calcularTotal
    }
}