package coffee.order;

public class Order {
    private int orderNum;
    private String personName;

    public Order(int orderNum, String personName) {
        this.orderNum = orderNum;
        this.personName = personName;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public String getPersonName() {
        return personName;
    }

    @Override
    public String toString() {
        return "Deliver: " + orderNum +
                " | " + personName;
    }
}
