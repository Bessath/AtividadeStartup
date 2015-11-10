/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

/**
 *
 * @author Thiago Bessa Ramos
 */
public class Supermercado {

    public static void main(String[] args) {
        Padaria p = new Padaria();
        Alimenticios a = new Alimenticios();
        
        //Verificando Classe Padaria
        //Herança: Padaria filha da classe mãe Produto
        p.setNome("Pão");
        p.setPreco(3);
        p.setKg(2);
        System.out.println("Valor total da compra: "+p.precoFinal()); //Polimorfismo: Uso do método precoFinal de modo diferente.
        
        //Verificando Classe Alimentícios
        //Verificando Alimentícios
        a.setNome("Leite");
        a.setPreco(3.5);
        a.setQuantidade(5);
        System.out.println("Valor total da compra: "+a.precoFinal()); ////Polimorfismo: Uso do método precoFinal de modo diferente.
   
        //Verificando Interface
        System.out.println("Tipo de pagamento: "+a.tipo(1));
        System.out.println("Tipo de pagamento: "+p.tipo(2));
    }

}