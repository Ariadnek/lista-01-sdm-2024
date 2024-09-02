package exercicio3;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private double preco;

    public Livro(String titulo, String autor, String genero, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.preco = preco;
    }

    public void imprimirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Gênero: " + genero);
        System.out.println("Preço: R$ " + preco);
    }
}
