package atividade;

public class Pizza {
    private String nome;
    private float valor;

    public Pizza(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Object printPizza(){
        final var p1 = this.nome+":" + "R$" + this.valor;
        System.out.println(this.nome+":"+ "R$" + this.valor);
        return p1;
    }
}
