package walkertech.mammamia.pizzaria;

import org.apache.log4j.Logger;

public class ItemPedido {
    private static final Logger logger = Logger.getLogger(ItemPedido.class);

    private String descricao;
    private double preco;

    public ItemPedido(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Add a method to log item details
    public void logItemDetails() {
        logger.info("Detalhes do item:");
        logger.info("Descrição: " + descricao);
        logger.info("Preço: R$ " + preco);
    }
}
