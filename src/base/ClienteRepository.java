package base;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
  private static ClienteRepository cInstancia;

  public static ClienteRepository getInstancia() {
    if (cInstancia == null) {
      cInstancia = new ClienteRepository();
    }
    return cInstancia;
  }

  private final ArrayList<Cliente> clientes;

  private ClienteRepository() {
    clientes = new ArrayList<>();
  }

  public void adicionarCliente(Cliente cliente) {
    this.clientes.add(cliente);
  }

  public void removerCliente(int index) throws IndexOutOfBoundsException {
    Cliente cliente = this.buscarCliente(index);
    this.clientes.remove(cliente);
  }

  public Cliente buscarCliente(int index) throws IndexOutOfBoundsException {
    return this.clientes.get(index);
  }

  public Cliente buscarCliente(String nome) {
    for (int i = 0; i < clientes.size(); i += 1) {
      Cliente cliente = this.buscarCliente(i);
      if (cliente.getNome().equals(nome)) {
        return cliente;
      }
    }
    return null; // Não existe este cliente
  }

  public Cliente buscarClientePeloId(String id) {
    for (int i = 0; i < clientes.size(); i += 1) {
      Cliente cliente = this.buscarCliente(i);
      if (cliente.getID().equals(id)) {
        return cliente;
      }
    }
    return null; // Não existe este cliente
  }

  public void printClientes() {
    int count = 0;
    for (int i = 0; i < clientes.size(); i += 1) {
      count++;
      Cliente cliente = this.buscarCliente(i);
      System.out.print(count + ". ");
      System.out.println(cliente);
    }
  }

  public void printClientesDesativados() {
    int count = 0;
    if (clientes.size() == 0) {
      System.out.println("Nenhum cliente cadastrado no momento.");
    } else {
      for (Cliente cliente : clientes) {
        count++;
        System.out.print(count + ". ");
        System.out.print(cliente);
        if (!cliente.getAtivo()) {
          System.out.println(" | INATIVO");
        }else {
          System.out.println(" | ATIVO - " + Math.abs(cliente.getContadorBloqueio()-3) + " devoluções reastantes para bloqueio");
        }
      }
    }
  }

  public ArrayList<Cliente> getClienteRepositorio() {
    return clientes;
  }

  public void printCliente() {
    int count = 0;
    for (int i = 0; i < clientes.size(); i += 1) {
      count++;
      Cliente cliente = this.buscarCliente(i);
      System.out.print(count + ". ");
      System.out.println(cliente);
    }
  }
}