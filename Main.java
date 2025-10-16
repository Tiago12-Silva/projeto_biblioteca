    public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Biblioteca ===");

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        
        Membro m1 = new Membro("M001", "Ana Souza", "ana@email.com");
        Membro m2 = new Membro("M002", "Pedro Lima", "pedro@email.com");
        biblioteca.adicionarMembro(m1);
        biblioteca.adicionarMembro(m2);

        Autor a1 = new Autor("Machado de Assis");
        Autor a2 = new Autor("Clarice Lispector");

        Livro l1 = new Livro("Dom Casmurro", "978-0001");
        l1.adicionarAutor(a1);
        l1.adicionarCapitulo("Capítulo 1");
        l1.adicionarCapitulo("Capítulo 2");

        Livro l2 = new Livro("A Hora da Estrela", "978-0002");
        l2.adicionarAutor(a2);
        l2.adicionarCapitulo("Capítulo 1");

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);

        Emprestimo e1 = new Emprestimo(m1, l1, "2025-10-01", "2025-10-15");
        Emprestimo e2 = new Emprestimo(m2, l2, "2025-10-02", "2025-10-16");

        System.out.println(biblioteca);
        System.out.println("\nLivros cadastrados:");
        System.out.println(" - " + l1);
        l1.listarCapitulos();
        System.out.println(" - " + l2);
        l2.listarCapitulos();

        System.out.println("\nEmpréstimos:");
        System.out.println(" - " + e1);
        System.out.println(" - " + e2);

        Pessoa[] pessoas = {
            new Estudante("E001", "Lucas", "Engenharia"),
            new Professor("P001", "Maria", "História"),
            new Membro("M003", "João", "joao@email.com")
        };

        System.out.println("\nPolimorfismo (descrição de cada pessoa):");
        for (Pessoa p : pessoas) {
            System.out.println(" - " + p.getNome() + ": " + p.getDescricaoCargo());
        }

        System.out.println("\n=== Fim da execução ===");
    }
}
