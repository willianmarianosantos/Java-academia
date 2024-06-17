package ProjetoFinalJava;

public class Principal {

    public static void main(String[] args) {


        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();

        Eletronico eletronico = new Eletronico("Smartphone ", 5900.00, 1, 24);
        Roupa roupa = new Roupa("Regatinha basica ", 59.00, 2, "P ", "Preto");
        Alimento alimento = new Alimento("Frango ", 27.00, 1, "01/07/2024");


        carrinho1.adicionaritem(eletronico);
        carrinho1.adicionaritem(roupa);
        carrinho1.adicionaritem(alimento);

        System.out.println("Carrinho 1:");
        carrinho1.listaritens();
        System.out.println("Total: " + carrinho1.calcularTotal());

        carrinho1.gerarArquivoTexto("carrinho1.txt");


        System.out.println();
        System.out.println();


        CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras();

        Roupa calca = new Roupa("calça basica ", 120.00, 3, "P ", "Preto");
        Alimento bacon = new Alimento("Bacon Feliz ", 100.00, 1, "01/07/2024");

        carrinho2.adicionaritem(calca);
        carrinho2.adicionaritem(bacon);

        // Listar produtos e total do segundo carrinho
        System.out.println("Carrinho 2 sem remover item :");
        carrinho2.listaritens();
        System.out.println("Total: " + carrinho2.calcularTotal());


        // Aqui vamos remover um item do carrinho2

        carrinho2.removerItem(calca);

        System.out.println("Carrinho 2 removendo item:");
        carrinho2.listaritens();
        System.out.println("Total: " + carrinho2.calcularTotal());


        carrinho2.gerarArquivoTexto("carrinho2.txt");
    }
}

