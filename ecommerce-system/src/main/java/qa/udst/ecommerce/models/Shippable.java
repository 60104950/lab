package qa.udst.ecommerce.models;

public interface Shippable extends Trackable {
    public double calculateShippingCost();
}
