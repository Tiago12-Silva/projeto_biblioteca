public class Professor extends Pessoa {
    private String departamento;

    public Professor(String id, String nome, String departamento) {
        super(id, nome);
        this.departamento = departamento;
    }

    @Override
    public String getDescricaoCargo() {
        return "Professor do departamento de " + departamento;
    }
}
