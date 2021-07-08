package Restaurant;


import java.util.ArrayList;

public class Order {
    private int orderID;
    private ArrayList<POrder> pOrders = new ArrayList<POrder>();

    public Order() {
        orderID = 0;
        pOrders = null;
    }

    public Order(int orderID, ArrayList<POrder> pOrders) {
        this.orderID = orderID;
        this.pOrders = pOrders;
    }

    public Order(int orderID) {
        this.orderID = orderID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public ArrayList<POrder> getPOrders() {
        return pOrders;
    }

    public void setPOrders(ArrayList<POrder> pOrders) {
        this.pOrders = pOrders;
    }

    public void addOrder(POrder pOrder) {
        pOrders.add(pOrder);
    }
}