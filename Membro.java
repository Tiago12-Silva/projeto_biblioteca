public class Membro extends Pessoa {
    private String email;

    public Membro(String id, String nome, String email) {
        super(id, nome);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String getDescricaoCargo() {
        return "Membro da biblioteca - email: " + email;
    }
}
