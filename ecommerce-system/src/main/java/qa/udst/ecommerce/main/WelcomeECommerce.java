package qa.udst.ecommerce.main;

import qa.udst.ecommerce.models.Catalog;
import qa.udst.ecommerce.models.Invoice;
import qa.udst.ecommerce.models.Order;
import qa.udst.ecommerce.models.PhysicalProduct;
import qa.udst.ecommerce.models.Product;

public class WelcomeECommerce {
    public static void main(String[] args) {
        System.out.println("Welcome to the E-Commerce System!");
        Product p1 = new Product(1, "calcium", 10);
        Product p2 = new Product(1, "Lead", 20);
        p1.displayInfo();

        Catalog c = new Catalog();
        c.addToCatalog(p1);
        c.addToCatalog(p2);

        c.displayAll();

        Order order1 = new Order();

        order1.addProduct(p1);
        order1.addProduct(p2);

        order1.calculateTotal();
        order1.displayOrder();

        PhysicalProduct phyProduct = new PhysicalProduct(1, "calcium", 10, 5.5);
        phyProduct.displayInfo();

        Invoice inv = new Invoice();
        inv.generateInvoice(p1);
        inv.displayInvoice();

        
    }
}
