package walkertech.mammamia.pizzaria;

import org.apache.log4j.Logger;

public class Bebida extends MammaMiaPizzaria {
    private static final Logger logger = Logger.getLogger(Bebida.class);

    private String nome;
    private double preco;

    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Add a method to log beverage details
    public void logBeverageDetails() {
        logger.info("Detalhes da bebida:");
        logger.info("Nome: " + nome);
        logger.info("Preço: R$ " + preco);
    }
}
