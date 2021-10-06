
package Classes;


public class Product {
    private String ProductType;
    private String ProductCreator;
    private float Price;

    public String getProductType() {
        return ProductType;
    }

    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    public String getProductCreator() {
        return ProductCreator;
    }

    public void setProductCreator(String ProductCreator) {
        this.ProductCreator = ProductCreator;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Product{" + "ProductType=" + ProductType + ", ProductCreator=" + ProductCreator + ", Price=" + Price + '}';
    }


    }


