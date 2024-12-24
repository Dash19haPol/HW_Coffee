package coffee.order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard= new CoffeeOrderBoard();

        orderBoard.add("Daria");
        orderBoard.add("Dima");
        orderBoard.add("Ella");
        orderBoard.add("Danya");
        orderBoard.add("Sasha");

        orderBoard.draw();

        System.out.println();
        System.out.println(orderBoard.deliver());
        System.out.println();
        System.out.println(orderBoard.deliver(3));
        System.out.println();

        orderBoard.draw();

    }
}
