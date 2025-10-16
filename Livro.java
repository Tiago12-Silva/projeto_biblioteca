import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String isbn;
    private List<Autor> autores = new ArrayList<>(); 
    private List<Capitulo> capitulos = new ArrayList<>(); 

    public Livro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public void adicionarCapitulo(String titulo) {
        Capitulo c = new Capitulo(capitulos.size() + 1, titulo);
        capitulos.add(c);
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + " (ISBN: " + isbn + ")";
    }

    public void listarCapitulos() {
        for (Capitulo c : capitulos) {
            System.out.println("   - " + c);
        }
    }
}
