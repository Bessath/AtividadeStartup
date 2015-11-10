package supermercado;

abstract public class Produto {

    protected String nome;
    protected double preco;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double precoFinal() {
        return this.preco;

    }
}
