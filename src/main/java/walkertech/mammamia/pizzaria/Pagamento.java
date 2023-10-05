package walkertech.mammamia.pizzaria;

import org.apache.log4j.Logger;

/**
 * Pagamento
 */
public class Pagamento extends MammaMiaPizzaria {
    private static final Logger logger = Logger.getLogger(Pagamento.class);

    private String tipo;

    public Pagamento(String tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("O tipo de pagamento não pode ser nulo");
        }
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("O tipo de pagamento não pode ser nulo");
        }
        this.tipo = tipo;
    }

    // Add logging statements for the constructor and methods
    public void processarPagamento() {
        logger.info("Processando pagamento do tipo: " + tipo);
        // Add your payment processing logic here
    }
}
