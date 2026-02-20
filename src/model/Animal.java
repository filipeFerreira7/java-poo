package model;
/*
Dentro desse projeto podemos ver os seguintes pilares:
 - Abstração: Identificar aquilo que é realmente necessário ao projeto/sistema;
 - Encapsulamento: Proteção de dados/variáveis sensíveis, garantindo mais segurança e confiabilidade ao sistema;
 - Herança: Classes 'Gato' e 'Cachorro' herdam da classe 'Animal', no qual os metodos e atributos são utilizados;
 - Polimofirsmo: Reaproveitamento do metodo 'Fazer Barulho', usando a sobrescrita, e a sobrecarga de métodos, onde reapro
    veito o nome e apenas modifico os parâmetros;
 */
public abstract class Animal {
    private String cor;

    public Animal(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String comer(){
        return "Comendo";
    }
    public String fazerBarulho(String horario){
        return "Barulho as: " + horario;
    }
    public String fazerBarulho(){
        return "Barulho";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "cor='" + cor + '\'' +
                '}';
    }
}
