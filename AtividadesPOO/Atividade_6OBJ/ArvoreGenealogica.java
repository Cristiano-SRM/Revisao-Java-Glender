package AtividadesPOO.Atividade_6OBJ;
import java.util.ArrayList;
import java.util.List;

public class ArvoreGenealogica {

    private List<Pessoa> pessoas = new ArrayList<>();

    public void adicionarPessoa(Pessoa p) {
        pessoas.add(p);
    }

    public boolean removerPessoa(String nome) {
        Pessoa p = buscarPessoa(nome);
        if (p != null) {
            pessoas.remove(p);
            return true;
        }
        return false;
    }

    public Pessoa buscarPessoa(String nome) {
        for (Pessoa p : pessoas) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public List<Pessoa> buscarFilhos(Pessoa paiOuMae) {
        List<Pessoa> filhos = new ArrayList<>();

        for (Pessoa p : pessoas) {
            if (p.ehFilhoDe(paiOuMae)) {
                filhos.add(p);
            }
        }
        return filhos;
    }

    public List<Pessoa> buscarIrmaos(Pessoa pessoa) {
        List<Pessoa> irmaos = new ArrayList<>();

        for (Pessoa p : pessoas) {
            if (p != pessoa && p.ehIrmaoDe(pessoa)) {
                irmaos.add(p);
            }
        }
        return irmaos;
    }
}