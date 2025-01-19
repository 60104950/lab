package qa.udst.ecommerce.models;

public class ProductInventory {
    public void addProduct(String id, BaseProduct product){
    }

    public void addProduct(String id, BaseProduct product, ProductCategory category){
        ProductCategory[] x = ProductCategory.values();
        int num = (int)(Math.random() * 3);
        System.out.println(x[num]);
        try{
            if(!id.isEmpty()){
                System.out.println("exist");
            }
        }
        catch(ProductNotFoundException e){
            System.out.println(e);
        }
    }
}
