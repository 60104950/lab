package qa.udst.ecommerce.models;
import java.util.*;
public class Catalog {
    ArrayList<Product> products = new ArrayList<Product>();
    int size;

    public void addToCatalog(Product p){
        products.add(p);
        this.size++;
    }

    public void displayAll(){
        for(int i=0; i<size; i++){
            products.get(i).displayInfo();
        }
    }
}
