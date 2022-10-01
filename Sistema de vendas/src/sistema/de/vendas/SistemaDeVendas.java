package sistema.de.vendas;
import model.Cliente;
import model.Estoque;
import model.Fornecedor;
import model.Produto;

public class SistemaDeVendas {

    public static void main(String[] args) {
        //Criando os produtos para adicionar ao Fornecedor (padrão criador);
        Produto produto1 = new Produto("Tomate", 5.50, 40); 
        Produto produto2 = new Produto("Laranja", 15.0, 20);
        Produto produto3 = new Produto("Morango", 11.58, 39);

        //Contem os produtos que serão ofertados ao Estoque (padrão especialista);
        Fornecedor fornecedor = new Fornecedor();

        fornecedor.addProduto(produto1);
        fornecedor.addProduto(produto2);
        fornecedor.addProduto(produto3);        

        //Adquirindo mercadorias do fornecedor, para abastecer o Estoque (padrão acoplamento);
        Estoque estoque = new Estoque();

        for (int i = 0; i < fornecedor.getProdutosFornecedor().size(); i++) {
            estoque.comprarProduto(fornecedor.getProdutosFornecedor().get(i), 10 + i);
        }

        System.out.println(estoque.getQuantidadeEstoque());

        
         
        //Cliente que pode realizar compras do Estoque (padrão controller);
        Cliente cliente = new Cliente(40.6);

        for (int i = 0; i < fornecedor.getProdutosFornecedor().size(); i++) {
            cliente.compra(estoque.getProdutosEstoque().get(i), 5 + i);
        } 
        //Exibe a lista de compras do cliente;
        cliente.listaCompra();

        //Efetua a compra caso tenha saldo suficiente;
        cliente.finalizarCompra();  

        /*fornecedor.addProduto(produto1);
        fornecedor.addProduto(produto2);        

        estoque.comprarProduto(fornecedor.getProdutosFornecedor().get(0),4);
        estoque.comprarProduto(fornecedor.getProdutosFornecedor().get(1),3);       

        estoque.listaEstoque();
        
        System.out.println("============="); 

        cliente.compra(estoque.getProdutosEstoque().get(0), 3);
        cliente.compra(estoque.getProdutosEstoque().get(1), 4);

        //cliente.listaCompra();

        cliente.finalizarCompra();*/


        
        
        
           
        

        

        

        

        

        
        
    }
    
}
