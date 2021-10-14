
package shop_homework;

import Classes.Client;
import Classes.Product;
import Classes.Purchased;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Shop {
private Scanner scanner = new Scanner(System.in);
private Client[] buyer = new Client[10];
private Product[] product= new Product[10];
private Purchased[] purchased= new Purchased[10];
    public void run(){
    String repeat ="r";
        do{ 
            float full=0;
            System.out.println("0: Выход из программы");
            System.out.println("1: Ввод Информация покупателе");
            System.out.println("2: Информация о покупателях");
            System.out.println("3: Ввод информации о продукте");
            System.out.println("4: Информация о продуктах");
            System.out.println("5: Покупка товара");
            System.out.print("Выберети номер задачи: ");
            int task = scanner.nextInt(); scanner.nextLine();
            
            switch(task){

                case 0:
                    repeat="q";
                    System.out.println("ДАВАЙ ДО ЗАВТРА!!!!!!");
                    break;
                case 1:
                    System.out.println("--------Ввод информации о покупателе----------");
                    for (int i = 0; i < buyer.length; i++) {
                        if(buyer[i]==null){
                        buyer[i]= addBuyer();
                        break;
                        }
                    }
                    break;
                    
                case 2:
                    System.out.println("-------------Список покупателей-------------");
                    for (int i = 0; i < buyer.length; i++) {
                        if(buyer[i]!=null){
                            System.out.println(buyer[i].toString());
                                
                            }
                        
                    }
                break;
                case 3:
                    System.out.println("-------------Ввод информации о продукте----------------");
                    for (int i = 0; i < product.length; i++) {
                        if(product[i]==null){
                        product[i]=addProduct();
                        break;
                                    }
                    }
                break;
                case 4:
                    System.out.println("-------------Cписок продуктов-------------");
                    for (int i = 0; i < product.length; i++) {
                        if(product[i]!=null){
                            System.out.println(product[i].toString());
                                
                            }
                        
                    }
               
                break;
                case 5:
                    System.out.println("-------------------Покупка товара------------");
                    //Выберите товар из списка
                    for (int i = 0; i < purchased.length; i++) {
                        if(purchased[i]==null){
                            purchased[i]=addPurchased();
                    
                        }
                    //buyer[i].=purchased[i].getProduct().getPrice();
                    }
                break;
                default:
                    System.out.println("Введи номер из списка!!!");
            }
     }while("r".equals(repeat));   
    }
        
    private Client addBuyer(){
    Client buyer1 = new Client();
    System.out.print("Введите имя покупателя: ");
    buyer1.setFirstName(scanner.nextLine());
    System.out.print("Введите фамилию покупателя: ");
    buyer1.setSecondName(scanner.nextLine());
    System.out.print("Введите Номер телефона покупателя: ");
    buyer1.setPhone(scanner.nextLine());
    System.out.println("Введите сумму денег которую имет покупатель: ");
    buyer1.setMoney(scanner.nextFloat()); 
    return buyer1;
    }
    private Product addProduct(){
    Product product1 = new Product(); 
    System.out.print("Введите вид продукта: ");
    product1.setProductType(scanner.nextLine());
    System.out.print("Введите название Компании: ");
    product1.setProductCreator(scanner.nextLine());
    System.out.print("Введите цену продукта: ");
    product1.setPrice(scanner.nextFloat());
    return product1;
    
    }
    
    private Purchased addPurchased(){
        //float  full =0;
        float sell =0;
        Purchased purchased1= new Purchased();
        System.out.println("--Список покупателей--");
        for (int i = 0; i < buyer.length; i++) {
            if(buyer[i]!=null){
                System.out.println(buyer[i].toString());
            } 
        }
        System.out.print("Введите номер покупателя: ");
        
        int numberBuyers =scanner.nextInt();scanner.nextLine();
        System.out.println("--Список продуктов--");
        for (int i = 0; i < product.length; i++) {
            if(product[i]!=null){
                System.out.println(product[i].toString());
            }
        }
        /*System.out.println("Сколько продуктов вы бы хотели приобрести?");
        int Howmuch =scanner.nextInt();scanner.nextLine();
        for (int i = 0; i < Howmuch; i++) {
            System.out.print("Введите номер товара: ");
            int y=scanner.nextInt()-1;
            //sell=sell + full;
            //System.out.println(sell);
                    }*/
    
        /*purchased1.setProduct(product[numberProduct-1]);
        purchased1.setClient(buyer[numberBuyers-1]);
        Calendar c= new GregorianCalendar();
        purchased1.setPurchasedDate(c.getTime());*/
    return purchased1;
    }
    
}
