package model;

import controller.ClienteController;

public class Cliente {
    String nome;
    Double saldo;
    ClienteController controller = new ClienteController();

    public Cliente(Double saldo){
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void compra(Produto produto, int quant) {
        controller.addCarrinho(produto, quant);
    }

    public void listaCompra() {
        controller.listaCompra();
    }

    public void finalizarCompra(){
        this.saldo = controller.finalizarCompra(this.saldo);
    }
}
