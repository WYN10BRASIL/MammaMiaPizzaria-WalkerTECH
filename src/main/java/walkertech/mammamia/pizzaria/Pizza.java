package walkertech.mammamia.pizzaria;

import org.apache.log4j.Logger;

public class Pizza extends MammaMiaPizzaria {

    private static final Logger logger = Logger.getLogger(Pizza.class);

    private String nome;
    private double preco;
    private String sabor;
    private double quantidade;
    private String tipo;

    public Pizza(String nome, double preco, String sabor, double quantidade, String tipo) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    public Pizza(String nome, double preco) {
        this(nome, preco, "", 0, "");
    }

    // Métodos get e set para cada atributo

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

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Add a method to log pizza details
    public void logPizzaDetails() {
        logger.info("Detalhes da pizza:");
        logger.info("Nome: " + nome);
        logger.info("Preço: R$ " + preco);
        logger.info("Sabor: " + sabor);
        logger.info("Quantidade: " + quantidade);
        logger.info("Tipo: " + tipo);
    }
}
