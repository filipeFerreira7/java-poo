package model;

public class Gato extends Animal {
    private String nome;

    public Gato(String nome) {
        super("Branco");
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String comer() {
        return "Gatinho está comendo! Miau Miau";
    }

    @Override
    public String fazerBarulho() {
        return "Miau Miau!";
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
