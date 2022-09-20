package atividade;

import java.util.ArrayList;

public class Pedido {

    ArrayList pedidos;

    public Pedido(){
        pedidos = new ArrayList<Pizza>();
    }

    public void realizarPedido(Pizza pizza){
        pedidos.add(pizza);
    }

    public void exibirPedido(Pizza pizza){
        for (int i = 0; i < pedidos.toArray().length; i++){
            Pizza pizzas = (Pizza)pedidos.get(i);
            pizza.printPizza();
        }
    }
    public void concluirPedido(){
        float total = 0;
        for (int i = 0; i < pedidos.toArray().length; i++){
            Pizza pizzas = (Pizza)pedidos.get(i);
            total += pizzas.getValor();
        }
        System.out.println("Total:" + total);
    }

}
