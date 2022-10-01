package controller;

import java.util.Vector;

import model.Produto;

public class ClienteController {
    Vector<Produto> carrinhoCompras = new Vector<>();
    Vector<Integer> quantidade = new Vector<>();     
    Double totalCompra = 0.0;   

    public void addCarrinho(Produto produto, int quant) {
        this.carrinhoCompras.add(produto);
        this.quantidade.add(quant);   
                   
        totalCompra += (quant * produto.getValor());
    }

    public Double listaCompra(){        
        for (int index = 0; index < carrinhoCompras.size(); index++) {
            System.out.print(quantidade.get(index) + " - ");
            System.out.print(carrinhoCompras.get(index).getNome() + " R$ ");
            System.out.println(carrinhoCompras.get(index).getValor() + " cada");
            totalCompra += (quantidade.get(index) * carrinhoCompras.get(index).getValor());
        }
        System.out.println("====TOTAL DA COMPRA====\n" + "R$ " + totalCompra);
        return totalCompra;
    }

    public Double finalizarCompra(Double saldo){            
        if(saldo >= totalCompra){
            saldo -= totalCompra;
            
            System.out.println("Pagamento efetuado com sucesso!!");
            System.out.println("SALDO RESTANTE " + "R$ " + saldo);            
        }else{
            System.out.println("Saldo insuficiente para efetuar essa compra!!");
        }
        return saldo;
    }

    public Vector<Produto> getCarrinhoCompras() {
        return carrinhoCompras;
    }

    public void setCarrinhoCompras(Vector<Produto> carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }

    public Vector<Integer> getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Vector<Integer> quantidade) {
        this.quantidade = quantidade;
    }

  
}
