package controller;
import java.util.Vector;
import model.Produto;

public class FornecedorController {
    Vector<Produto> produtosFornecedor = new Vector<>();

    public Vector<Produto> getProdutosFornecedor() {
        return produtosFornecedor;
    }  

    public void addProduto(Produto produto) {
        this.produtosFornecedor.add(produto);
    }
}
