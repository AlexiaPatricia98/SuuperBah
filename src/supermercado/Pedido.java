package supermercado;

public class Pedido {
    private int numeroPedido;
    private CarrinhoDeCompras carrinho;
    private Cliente cliente;
    
    public Pedido(int numeroPedido, CarrinhoDeCompras carrinho, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.carrinho = carrinho;
        this.cliente = cliente;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public CarrinhoDeCompras getCarrinho() {
        return carrinho;
    }
    
    public void fecharPedido() {
        System.out.println("Numero do pedido: " + numeroPedido);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Total do pedido: " + this.carrinho.calcularTotal());
        System.out.println("=====================================");
    }
    
}






