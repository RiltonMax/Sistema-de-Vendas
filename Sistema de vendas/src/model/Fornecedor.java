package model;

import java.util.Vector;

import controller.FornecedorController;

public class Fornecedor {
    FornecedorController controller = new FornecedorController();
    String nome;
    String cnpj;
    

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }    

    public Vector<Produto> getProdutosFornecedor() {
        return controller.getProdutosFornecedor();
    }

    public void addProduto(Produto produto) {
        controller.addProduto(produto);        
    }

    
}
