package Restaurant;

import Product.Product;

public class POrder {
    private Product product;
    private int tableNumber;

    public POrder() {
        product = null;
        tableNumber = 0;
    }

    public POrder(Product product, int tableNumber) {
        this.product = product;
        this.tableNumber = tableNumber;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int numberOfPlase) {
        this.tableNumber = numberOfPlase;
    }
}
