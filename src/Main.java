class Livro {
    private final String titulo;
    private final String autor;
    private final int anoPublicacao;

    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Getters e Setters omitidos

    // Método para obter informações do livro
    public String getInfoLivro() {
        return "Título: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao;
    }
}

public class Main {
    public static void main(String[] args) {
        // Exemplo de instâncias de objetos Livro para testar diferentes cenários
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899); // Livro disponível
        Livro livro2 = new Livro("Harry Potter", "J.K. Rowling", 1997); // Livro indisponível
        Livro livro3 = new Livro("Longo Título Longo Título Longo Título", "Autor Longo Autor Longo", 2000); // Título e autor longos
        Livro livro4 = new Livro("Livro Diferente", "Autor Diferente", 2010); // Título e autor diferentes
        Livro livro5 = new Livro("Livro Novo", "Autor Novo", 2022); // Ano de publicação diferente

        // Teste dos objetos instanciados
        System.out.println("Informações do Livro 1:");
        System.out.println(livro1.getInfoLivro());

        System.out.println("Informações do Livro 2:");
        System.out.println(livro2.getInfoLivro());

        System.out.println("Informações do Livro 3:");
        System.out.println(livro3.getInfoLivro());

        System.out.println("Informações do Livro 4:");
        System.out.println(livro4.getInfoLivro());

        System.out.println("Informações do Livro 5:");
        System.out.println(livro5.getInfoLivro());
    }
}
