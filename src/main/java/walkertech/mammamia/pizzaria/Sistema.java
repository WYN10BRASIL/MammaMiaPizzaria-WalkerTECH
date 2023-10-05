package walkertech.mammamia.pizzaria;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Sistema extends MammaMiaPizzaria {
    private static final Logger logger = Logger.getLogger(Sistema.class);

    private List<Cliente> clientes;
    private List<Pedido> pedidos;

    public Sistema() {
        this.clientes = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    // Métodos de cadastro e realização de pedidos

    public void cadastrarCliente(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
            logger.info("Cliente cadastrado: " + cliente.getNome());
        }
    }

    public void realizarPedido(Pedido pedido) {
        if (!pedidos.contains(pedido)) {
            pedidos.add(pedido);
            logger.info("Pedido realizado para o cliente: " + pedido.getCliente().getNome());
        }
    }

    // Métodos de obtenção de clientes e pedidos

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
