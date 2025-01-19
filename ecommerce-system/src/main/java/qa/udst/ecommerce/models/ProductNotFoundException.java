package qa.udst.ecommerce.models;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
        }
}
