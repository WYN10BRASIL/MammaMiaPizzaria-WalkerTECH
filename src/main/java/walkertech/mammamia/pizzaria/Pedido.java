package walkertech.mammamia.pizzaria;

import org.apache.log4j.Logger;

public class Pedido extends MammaMiaPizzaria {
    private static final Logger logger = Logger.getLogger(Pedido.class);

    private Cliente cliente;
    private Pizza pizza;
    private String tipoEntrega;
    private Pagamento pagamento;
    private Pizza[] pizzas;
    private Bebida[] bebidas;

    public Pedido(Cliente cliente, Pizza pizza, String tipoEntrega, Pagamento pagamento) {
        this.cliente = cliente;
        this.pizza = pizza;
        this.tipoEntrega = tipoEntrega;
        this.pagamento = pagamento;
    }

    // Métodos get e set para cada atributo

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    public Bebida[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(Bebida[] bebidas) {
        this.bebidas = bebidas;
    }

    public void processarPedido() {
        logger.info("Processando pedido para o cliente: " + cliente.getNome());
    
        // Add your order processing logic here
        // For example:
        if (pizza != null) {
            logger.info("Pizza escolhida: " + pizza.getTipo());
            // Add more details or processing steps related to the pizza
        }
    
        if (bebidas != null && bebidas.length > 0) {
            logger.info("Bebidas escolhidas:");
            for (Bebida bebida : bebidas) {
                logger.info("- " + bebida.getPreco());
                // Add more details or processing steps related to each beverage
            }
        }
    
        // Add similar processing steps for other components of the order
    
        logger.info("Tipo de entrega: " + tipoEntrega);
        logger.info("Forma de pagamento: " + pagamento.getTipo());
    
        // Calculate and log the total order amount
        double totalAmount = calcularValorTotal();
        logger.info("Valor total do pedido: R$ " + totalAmount);
    
        // Add any remaining order processing logic
    }

    private double calcularValorTotal() {
        return 0;
    }
    
    }

