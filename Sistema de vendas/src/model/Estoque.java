package model;

import java.util.Vector;

import controller.EstoqueController;

public class Estoque {
    EstoqueController controller = new EstoqueController();   
    
    public void setProdutosEstoque(Vector<Produto> produtosEstoque) {
        this.controller.setProdutosEstoque(produtosEstoque);
    }

    public Vector<Produto> getProdutosEstoque() {
        return controller.getProdutosEstoque();
    }

    public Vector<Integer> getQuantidadeEstoque() {
        return controller.getQuantidadeEstoque();
    }

    public void setQuantidadeEstoque(Vector<Integer> quantidadeEstoque) {
        this.controller.setQuantidadeEstoque(quantidadeEstoque);
    }

    public void comprarProduto(Produto produto, int quantidade){
        controller.comprarProduto(produto, quantidade);
    }
    public void listaEstoque(){
        controller.listaEstoque();
    }
}
