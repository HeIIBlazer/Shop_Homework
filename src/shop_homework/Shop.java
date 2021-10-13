
package shop_homework;

import Classes.Client;
import Classes.Product;
import Classes.Purchased;
import java.util.Scanner;


public class Shop {
private Scanner scanner = new Scanner(System.in);
private Client[] buyer = new Client[10];
private Product[] product= new Product[10];
private Purchased[] purchased= new Purchased[10];
    public void run(){
    String repeat ="r";
        do{
            System.out.println("0: ����� �� ���������");
            System.out.println("1: ���� ���������� ����������");
            System.out.println("2: ���������� � �����������");
            System.out.println("3: ���� ���������� � ��������");
            System.out.println("4: ���������� � ���������");
            //System.out.println("5: ���������� � ��������� ���������");
            System.out.print("�������� ����� ������: ");
            int task = scanner.nextInt(); scanner.nextLine();
            
            switch(task){

                case 0:
                    repeat="q";
                    System.out.println("����� �� ������!!!!!!");
                    break;
                case 1:
                    System.out.println("--------��������� �����----------");
                    for (int i = 0; i < buyer.length; i++) {
                        if(buyer[i]==null){
                        buyer[i]= addBuyer();
                        break;
                        }
                    }
                    break;
                    
                case 2:
                    System.out.println("-------------������ ����-------------");
                    for (int i = 0; i < buyer.length; i++) {
                        if(buyer[i]!=null){
                            System.out.println(buyer[i].toString());
                                
                            }
                        
                    }
                break;
                case 3:
                    System.out.println("-------------�������� ��������----------------");
                    for (int i = 0; i < product.length; i++) {
                        if(product[i]==null){
                        product[i]=addProduct();
                        break;
                                    }
                    }
                break;
                case 4:
                    System.out.println("-------------C����� ���������-------------");
                    for (int i = 0; i < product.length; i++) {
                        if(product[i]!=null){
                            System.out.println(product[i].toString());
                                
                            }
                        
                    }
               
                break;
                default:
                    System.out.println("����� ����� �� ������!!!");
            }
     }while("r".equals(repeat));   
    }
        
    private Client addBuyer(){
    Client buyer1 = new Client();
    System.out.print("������� ��� ����������: ");
    buyer1.setFirstName(scanner.nextLine());
    System.out.print("������� ������� ����������: ");
    buyer1.setSecondName(scanner.nextLine());
    System.out.print("������� ����� �������� ����������: ");
    buyer1.setPhone(scanner.nextLine()); 
    return buyer1;
    }
    
    
    
    private Product addProduct(){
    Product product1 = new Product();
    System.out.print("������� ��� ��������: ");
    product1.setProductType(scanner.nextLine());
    System.out.print("������� �������� ��������: ");
    product1.setProductCreator(scanner.nextLine());
    System.out.print("������� ���� ��������: ");
    product1.setPrice(scanner.nextFloat());
    
    return product1;
    }
    
            }
                
            
    
        


