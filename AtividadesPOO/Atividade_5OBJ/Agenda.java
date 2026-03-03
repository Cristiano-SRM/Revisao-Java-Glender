package AtividadesPOO.Atividade_5OBJ;
import java.util.*;
public class Agenda {
    private List<Contato> listaContatos = new ArrayList<>();
    private int tamanhoListaContatos;

    public void adicionarContato(Contato contato){
       listaContatos.add(contato);
       tamanhoListaContatos++;
    }

    public boolean removerContato(String nome) {

    for (int i = 0; i < listaContatos.size(); i++) {

        if (listaContatos.get(i).getNome().equals(nome)) {

            listaContatos.remove(i);
            tamanhoListaContatos--;
            return true;
        }
    }
    return false;
}

    public Contato buscarPorNome(String nome) {
        for (Contato c : listaContatos) {
            if (c.getNome().equals(nome)) {
                return c;
            }
        }
        return null;
    }

    // buscar por email
    public Contato buscarPorEmail(String email) {
        for (Contato c : listaContatos) {
            if (c.getEmail().equals(email)) {
                return c;
            }
        }
        return null;
    }

    // buscar por telefone
    public Contato buscarPorTelefone(long telefone) {
        for (Contato c : listaContatos) {
            if (c.getTelefone() == telefone) {
                return c;
            }
        }
        return null;
    }

    // tamanho da agenda
    public int getTamanhoListaContatos() {
        return tamanhoListaContatos;
    }
}
