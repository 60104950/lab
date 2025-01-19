package qa.udst.ecommerce.models;

import java.util.ArrayList;

public class Order {
    int orderId;
    ArrayList<Product> products = new ArrayList<Product>();
    double totalPrice;
    Customer customer;

    public void addProduct(Product product){
        products.add(product);
        customer = new Customer(orderId, "Geralt", "Witcher");
        orderId++;
    }

    public void calculateTotal(){
        for(int i=0; i<products.size(); i++){
            totalPrice += products.get(i).getPrice();
        }
    }

    public void displayOrder(){
        System.out.println("orderID: " + orderId + " totalPrice: " + totalPrice);
        customer.displayCustomerInfo();
    }
}
