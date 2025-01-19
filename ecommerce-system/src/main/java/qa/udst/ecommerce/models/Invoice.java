package qa.udst.ecommerce.models;

import java.util.Date;

public class Invoice {
    int invoiceId;
    Order order = new Order();
    Date date = new Date();

    public void generateInvoice(Product p){
        order.addProduct(p);
        invoiceId++;
    }

    public void displayInvoice(){
        System.out.println("Date: " + date.getTime() + "ID: " + invoiceId + "order: " );
        order.displayOrder();
    }
}
