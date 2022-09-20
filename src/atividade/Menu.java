package atividade;

import java.util.ArrayList;

public class Menu {
    ArrayList pizzas;

    public Menu(){
        pizzas = new ArrayList<Pizza>();
    }

    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
        boolean nomeRepetido = false;
        for(int i = 0; i < pizzas.toArray().length; i++){
            Pizza r = (Pizza)pizzas.get(i);
            if (r.getNome().equals(pizza.getNome())){
                nomeRepetido = true;
                break;
            }
        }
        if(!nomeRepetido){
            pizzas.add(pizza);
        }
    }

    public void removerPizza(Pizza pizza){
        pizzas.remove(pizza);
    }

    public void exibirMenu(){
        for(int i = 0; i < pizzas.toArray().length; i++){
            Pizza pizza = (Pizza)pizzas.get(i);
            pizza.printPizza();
        }
    }
}
