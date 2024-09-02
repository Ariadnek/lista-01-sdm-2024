package exercicio2;

public class Atleta {
    private String nome;
    private int qtdeMedalhas;
    private String pais;

    public Atleta(String nome, int qtdeMedalhas, String pais) {
        this.nome = nome;
        this.qtdeMedalhas = qtdeMedalhas;
        this.pais = pais;
    }

    public void imprimirDados() {
        System.out.println("Nome do Atleta: " + nome);
        System.out.println("Quantidade de Medalhas: " + qtdeMedalhas);
        System.out.println("País: " + pais);
    }
}
