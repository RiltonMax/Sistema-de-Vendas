package controller;

import java.util.Vector;

import model.Produto;

public class EstoqueController {
    Vector<Produto> produtosEstoque = new Vector<>();
    Vector<Integer> quantidadeEstoque = new Vector<>();
    int totalProdutos = 0;

    public void comprarProduto(Produto produto, int quantidade) {
        this.produtosEstoque.add(produto);
        this.quantidadeEstoque.add(quantidade);
        this.totalProdutos += quantidade;
    }

    public Vector<Produto> getProdutosEstoque() {
        return produtosEstoque;
    }

    public void setProdutosEstoque(Vector<Produto> produtosEstoque) {
        this.produtosEstoque = produtosEstoque;
    }

    public Vector<Integer> getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Vector<Integer> quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getTotalProdutos() {
        return totalProdutos;
    }

    public void listaEstoque(){
        for (int index = 0; index < produtosEstoque.size(); index++) {
            System.out.print(quantidadeEstoque.get(index) + " ");
            System.out.print(produtosEstoque.get(index).getNome() + " R$ ");            
            System.out.println(produtosEstoque.get(index).getValor() + " un");
        }
    }

}
