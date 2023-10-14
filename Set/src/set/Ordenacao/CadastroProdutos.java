package set.Ordenacao;

import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new TreeSet<>();
    }

    private void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    private Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparetorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
    
        cadastroProdutos.adicionarProduto(98745632, "Macarrao", 7.99, 15);
        cadastroProdutos.adicionarProduto(98745633, "Refri", 9.99, 11);
        cadastroProdutos.adicionarProduto(98745634, "Batata congelada", 3.99, 10);
        cadastroProdutos.adicionarProduto(98745635, "Molho de tomate", 6.99, 8);
    
        System.out.println("Produtos organizados por nome: ");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
    
        System.out.println("Produtos organizados por preço: ");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
