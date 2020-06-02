package base;

import java.util.ArrayList;
import java.util.Random;

public class FuncionarioRepository {
    private static FuncionarioRepository eInstancia;

    public static FuncionarioRepository getInstancia() {
        if (eInstancia == null) {
            eInstancia = new FuncionarioRepository();
        }
        return eInstancia;
    }

    private final ArrayList<Funcionario> funcionarios;

    private FuncionarioRepository() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public Funcionario buscarFuncionarioPeloCpf(String cpf) {
        for (int i = 0; i < funcionarios.size(); i += 1) {
            Funcionario funcionarioBusca = this.funcionarios.get(i);
            if (funcionarioBusca.getCpf().equals(cpf)) {
                return funcionarioBusca;
            }
        }
        return null; // Não existe entregador com esta placa
    }
}
