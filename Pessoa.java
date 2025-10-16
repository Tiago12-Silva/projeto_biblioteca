public abstract class Pessoa {
    protected String id;
    protected String nome;

    public Pessoa(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public abstract String getDescricaoCargo();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [id=" + id + ", nome=" + nome + "]";
    }
}
