    public class Emprestimo {
    private Membro membro;
    private Livro livro;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Membro membro, Livro livro, String dataEmprestimo, String dataDevolucao) {
        this.membro = membro;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Empréstimo de \"" + livro.getTitulo() + "\" para " + membro.getNome() +
                " (" + dataEmprestimo + " até " + dataDevolucao + ")";
    }
}
