package qa.udst.ecommerce.models;

public class Customer {
    int customerId;
    String name;
    String email;

    public Customer(int customerId, String name, String email){
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    public void displayCustomerInfo(){
        System.out.println("customerId: " + customerId + " name: " + name + " email: " + email);
    }
}
