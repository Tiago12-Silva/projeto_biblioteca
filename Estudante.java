public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String id, String nome, String curso) {
        super(id, nome);
        this.curso = curso;
    }

    @Override
    public String getDescricaoCargo() {
        return "Estudante do curso de " + curso;
    }
}
