package atividade;

public class Main {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Calabresa", 20);
        Pizza p2 = new Pizza("Mussarela", 22);
        Pizza p3 = new Pizza("Portuguesa", 24);
        Pizza p4 = new Pizza("Frango", 26);

        System.out.println("---------------Menu-----------------");
        Menu m1 = new Menu();
        Pedido pedido1 = new Pedido();

        m1.addPizza(p1);
        m1.addPizza(p2);
        m1.addPizza(p3);
        m1.addPizza(p4);

        pedido1.realizarPedido(p1);
        pedido1.realizarPedido(p2);

        m1.exibirMenu();

        System.out.println("-----------Pedidos--------------------");
        pedido1.concluirPedido();
    }
}
