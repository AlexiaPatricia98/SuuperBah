package supermercado;

public class Supermercado {

public static void main(String[] args) {
    Cliente cliente = new Cliente("Joana Silva", "987.654.321-00", "joana.silva@gmail.com");

    CarrinhoDeCompras carDeCompras = new CarrinhoDeCompras();
        carDeCompras.adicionarProduto("Arroz", 1, 3.99);
        carDeCompras.adicionarProduto("Filé de frango sassami", 2, 21.99);

    carDeCompras.calcularTotal();
 
    Pedido pedidoCl = new Pedido(1, carDeCompras, cliente);
    pedidoCl.fecharPedido();

    }
}






