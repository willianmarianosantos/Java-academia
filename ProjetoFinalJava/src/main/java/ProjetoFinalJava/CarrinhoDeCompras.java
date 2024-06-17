package ProjetoFinalJava;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompras {

    private List<Produto> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<Produto>();
    }


    public void adicionaritem(Produto produto) {
        itens.add(produto);
    }

    // Indexoff indice da lista do objeto que estou procurando, for que procura por noem e quantidade que batem ele joga o indice para uma variavel e manda remover
    // O produto no indice tal da lista. usei um for no final das con tas com equals e == para comprar
    // Funcionando professor exclui certinho conformo o nome dado na variavel

    public void removerItem(Produto produto) {

        int i = -1;
        for (Produto item : itens) {
            if (item.getNome().equals(produto.getNome()) && item.getQuantidade() == (produto.getQuantidade())) {
                i = itens.indexOf(item);
                break; //  Pular fora de um loop

            }
        }
        if (i != -1) {
            itens.remove(i);
        }
    }

    public void listaritens() {
        for (Produto item : itens) {
            System.out.println(item.exibirDetalhes());

        }
    }


    public List<Produto> exportarListaProdutos() {
        return itens;
    }


    public double calcularTotal() {
        Double total = 0.0;
        for (Produto item : itens) {

            total += item.subTotal();
        }
        return total;
    }


    public void gerarArquivoTexto(String nomeArquivo) {

        // Criao objeto arquivo para mostrar na raiz do projeto


        try {
            PrintWriter writer = new PrintWriter(nomeArquivo);

            /*
            for (Produto item : itens) {
                writer.println(item.exibirDetalhes() + " Sub total: " + item.subTotal());
            }
            */
            // Tratando tamanhos e espaços
            int tamanho = 20;
            writer.print(adicionaEspaco("Item", tamanho));
            writer.print(adicionaEspaco("Qtd", tamanho));
            writer.print(adicionaEspaco("Nome", tamanho));
            writer.print(adicionaEspaco("Preço", tamanho));
            writer.println("Subtotal");


            for (int i = 0; i < itens.size(); i++) {
                Produto produto = itens.get(i);

                // Tratando tamanhos e espaços aplicando o que foi criado antes
                writer.print(adicionaEspaco(String.valueOf(i + 1), tamanho));
                writer.print(adicionaEspaco(String.valueOf(produto.getQuantidade()), tamanho));
                writer.print(adicionaEspaco(String.valueOf(produto.getNome()), tamanho));
                writer.print(adicionaEspaco(String.valueOf(produto.getPreco()), tamanho));
                writer.println(produto.subTotal());
            }


            writer.println("Total da compra: " + this.calcularTotal());


            writer.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }
    // Tratando tamanhos e espaços criando o construtor

    private String adicionaEspaco(String valor, int tamanho) {
        int quantidadeEspacos = tamanho - valor.length();
        return valor + " ".repeat(quantidadeEspacos);
    }

}


