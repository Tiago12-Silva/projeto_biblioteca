import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livros = new ArrayList<>();
    private List<Membro> membros = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public void adicionarLivro(Livro l) {
        livros.add(l);
    }

    public void adicionarMembro(Membro m) {
        membros.add(m);
    }

    @Override
    public String toString() {
        return "Biblioteca " + nome + " (Livros: " + livros.size() + ", Membros: " + membros.size() + ")";
    }
}
