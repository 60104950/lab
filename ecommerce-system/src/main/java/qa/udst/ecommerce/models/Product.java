package qa.udst.ecommerce.models;

public class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void displayInfo(){
        System.out.println("ID: " + id + " name: " + name + " price: " + price);
    }
}
