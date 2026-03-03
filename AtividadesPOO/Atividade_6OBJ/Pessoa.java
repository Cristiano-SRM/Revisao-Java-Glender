package AtividadesPOO.Atividade_6OBJ;
public class Pessoa {

    private String nome;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    // verifica se duas pessoas são irmãs
    public boolean ehIrmaoDe(Pessoa outra) {

        if (outra == null || outra == this) return false;

        boolean mesmoPai = this.pai != null && this.pai.equals(outra.pai);
        boolean mesmaMae = this.mae != null && this.mae.equals(outra.mae);

        return mesmoPai || mesmaMae;
    }

    // verifica se a pessoa passada é pai ou mãe desta pessoa
    public boolean ehFilhoDe(Pessoa possivelPaiOuMae) {
        return possivelPaiOuMae != null &&
               (possivelPaiOuMae.equals(pai) || possivelPaiOuMae.equals(mae));
    }
}