
package shop_homework;

import Classes.Client;
import Classes.Product;
import Classes.Purchased;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Shop {
    public void run(){
    Client client1 = new Client();
    client1.setFirstName("Dan");
    client1.setSecondName("Vassiljev");
    client1.setPhone("54565758");
    
    Product product1=new Product();
    product1.setProductType("Moloko");
    product1.setProductCreator("Tere");
    product1.setPrice((float) 2.99);
    
    Purchased purchased1 = new Purchased();
    purchased1.setClient(client1);
    purchased1.setProduct(product1);
    Calendar c= new GregorianCalendar();
    purchased1.setPurchasedDate(c.getTime());
    System.out.println("Purchased1: " +purchased1.toString());
    
        System.out.println("--------------------------------------------------------------------------------------");
    Client client2 = new Client();
    client2.setFirstName("Di");
    client2.setSecondName("Alosh");
    client2.setPhone("56445758");
    
    Product product2=new Product();
    product2.setProductType("Jabloki");
    product2.setProductCreator("EEstiFArm");
    product2.setPrice((float) 5.78);
    
    Purchased purchased2 = new Purchased();
    purchased2.setClient(client2);
    purchased2.setProduct(product2);
    c= new GregorianCalendar();
    purchased2.setPurchasedDate(c.getTime());
    System.out.println("Purchased2: " +purchased2.toString());
    
    }
}
