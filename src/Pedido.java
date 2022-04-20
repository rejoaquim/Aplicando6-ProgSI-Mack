package src;

public class Pedido {

    public int numero;
    public Produto item;
    public int quantidade;
    public double valor = 0.0;

    public Pedido(int numero, Produto item, int quantidade) {
        this.numero = numero;
        this.item = item;
        this.quantidade = quantidade;
    }

    void calculaPedido() {
        valor = quantidade * item.preco;
    }

    @Override
    public String toString() {
        String res;

        res = "Número do pedido " + numero + "\r\n";
        res += "Código do produto: " + item.cod + "\r\n";
        res += "Descrição: " + item.descricao + "\r\n";
        res += "Preço do produto: " + item.preco + "\r\n";
        res += "Quantidade: " + quantidade + "\r\n";
        calculaPedido();
        res += "Valor total do pedido: " + valor + "\r\n";

        return res;
    }
}
