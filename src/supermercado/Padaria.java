package supermercado;

import java.util.Scanner;

public class Padaria extends Produto implements TipoPagamento {

    double kg;

    public void setKg(double kg) {
        this.kg = kg;
    }

    @Override
    public double precoFinal() {
        return this.preco * this.kg;
    }

    //chamada da interface
    @Override
    public String tipo(int id) {
        if (id == 1) {
            return "À vista.";
        } else {
            return "À prestação.";
        }
    }

}
