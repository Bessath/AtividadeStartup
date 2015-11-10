package supermercado;

import java.util.Scanner;

public class Alimenticios extends Produto implements TipoPagamento{

    int validade;
    int quantidade;

    @Override
    public double precoFinal() {
        return this.preco * this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    //chamada da interface
    @Override
    public String tipo(int id) {
        if(id==1){
            return "À vista.";
        }
        else{
            return "À prestação.";
        }
    }

}
