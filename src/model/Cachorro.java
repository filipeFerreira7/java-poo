package model;

public class Cachorro extends Animal {
    private String nome;

    public Cachorro(String nome) {
        super("Preto");
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
        return "Cachorro esta comendo... au au! ";
    }

    @Override
    public String fazerBarulho() {
        return "Au Au! Barulho do cachorro";
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
