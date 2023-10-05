package walkertech.mammamia.pizzaria;

import org.apache.log4j.Logger;

public class Cliente {
    private static final Logger logger = Logger.getLogger(Cliente.class);

    private String nome;
    private String endereco;
    private String telefone;

    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Add a method to log client details
    public void logClientDetails() {
        logger.info("Detalhes do cliente:");
        logger.info("Nome: " + nome);
        logger.info("Endereço: " + endereco);
        logger.info("Telefone: " + telefone);
    }
}
