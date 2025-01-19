package qa.udst.ecommerce.models;

public class PhysicalProduct extends BaseProduct implements Shippable{
    double weight;
    int id;

    public PhysicalProduct(int id, String name,double price, double weight){
        super(id, name, price);
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        displayDetails();
        System.out.println("weight: " + weight);
    }

    @Override
    public double calculateShippingCost(){
        double cost = weight * 2;
        return cost;
    }

    @Override
    public String generateTrackingNumber(){
        return "TRACK-" + id++;
    }


}
