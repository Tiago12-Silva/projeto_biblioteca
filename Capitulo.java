public class Capitulo {
    private int numero;
    private String titulo;

    public Capitulo(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Capítulo " + numero + ": " + titulo;
    }
}
