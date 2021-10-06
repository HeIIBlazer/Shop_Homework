
package Classes;

import java.util.Date;


public class Purchased {
   private Client client;
   private Product product;
   private Date PurchasedDate;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getPurchasedDate() {
        return PurchasedDate;
    }

    public void setPurchasedDate(Date PurchasedDate) {
        this.PurchasedDate = PurchasedDate;
    }

    @Override
    public String toString() {
        return "Purchased{" + "client=" + client + ", product=" + product + ", PurchasedDate=" + PurchasedDate + '}';
    }
   
}
