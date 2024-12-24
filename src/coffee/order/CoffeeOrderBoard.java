package coffee.order;


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class CoffeeOrderBoard {

    private Map<Integer, Order> orderBoard = new TreeMap<>();
    private int orderNum;

    public void add(String personName) {
        orderNum++;
        Order order = new Order(orderNum, personName);
        orderBoard.put(order.getOrderNum(), order);
    }

    public Order deliver() {
        Iterator<Integer> iterator = orderBoard.keySet().iterator();
        if (iterator.hasNext()) {
            Integer orderNum = iterator.next();
            Order order = orderBoard.get(orderNum);
            orderBoard.remove(orderNum);
            return order;
        }
        return null;
    }

    public Order deliver(int orderNum) {
        Order order = orderBoard.get(orderNum);
        if (order != null){
            orderBoard.remove(orderNum);
            return order;
        }
        return null;
    }

    public void draw(){
        System.out.println("Num | Name");
        for (Order order : orderBoard.values()){
            System.out.println(order.getOrderNum() + " | " + order.getPersonName());
        }
    }

}
