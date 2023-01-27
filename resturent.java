import java.util.*;
public class resturent{
static int price1,price2, price3, price4, price5, price6, price7, price8, price9, price10;   
                                                                                                                                   
 public static void main(String[] args) {
    int price,Number_of_item,number,Bill; 
   double GST;
    System.out.printf("|-------------------------------------------------------------|").println();
    System.out.printf("|                                                             |").println();
    System.out.printf("|                                                             |").println();
    System.out.printf("|           WElcome  to  TOTA Rsturent                        |").println();
    System.out.printf("|                                                             |").println();
    System.out.printf("|                                                             |").println();
    System.out.printf("|--------|----------------------------------------------------|").println();
    System.out.printf("| S.N.   |                    MENU                            |").println();
    System.out.printf("|        |         Dises                          price       |").println();
    System.out.printf("|--------|----------------------------------------------------|").println();
    System.out.printf("|   1    |      TEA                               10          |").println();
    System.out.printf("|   2    |      Samosa                            20          |").println();
    System.out.printf("|   3    |      Burgar                            40          |").println();
    System.out.printf("|   4    |      Poha                              15          |").println();
    System.out.printf("|   5    |      Gulb_jamun                        20          |").println();
    System.out.printf("|   6    |      pize                              50          |").println();
    System.out.printf("|   7    |      cofe                              20          |").println();
    System.out.printf("|   8    |      Noodales                          30          |").println();
    System.out.printf("|   9    |      Chapati                           40          |").println();
    System.out.printf("|   10   |      Dal_bhat                          80          |").println();
    System.out.printf("--------------------------------------------------------------|").println();
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the dises number");
   number=sc.nextInt();
if(number==1){
    System.out.println("Enter the number of tea");
     Number_of_item = sc.nextInt();
     price = 10;
      price1=Number_of_item*price;
  }
  else if(number==2){
    System.out.println("Enter the number of Samosa");
     Number_of_item = sc.nextInt();
     price = 20;
      price2=Number_of_item*price;
  }
  else if(number==3){
    System.out.println("Enter the number of Burgar");
     Number_of_item = sc.nextInt();
     price = 40;
      price3=Number_of_item*price;
  }
 else if(number==4){
    System.out.println("Enter the number of poha");
     Number_of_item = sc.nextInt();
     price = 15;
      price4=Number_of_item*price;
  }
 else if(number==5){
    System.out.println("Enter the number of gulb_jamun");
     Number_of_item = sc.nextInt();
     price = 20;
      price5=Number_of_item*price;
  }
 else if(number==6){
    System.out.println("Enter the number of Pize");
     Number_of_item = sc.nextInt();
     price = 50;
      price6=Number_of_item*price;
  }
 else if(number==7){
    System.out.println("Enter the number of cofe");
     Number_of_item = sc.nextInt();
     price = 20;
      price7=Number_of_item*price;
  }
 else if(number==9){
    System.out.println("Enter the number of chapati");
     Number_of_item = sc.nextInt();
     price = 40;
      price9=Number_of_item*price;
  }     
 else if(number==10){
    System.out.println("Enter the number of Dal_bat");
     Number_of_item = sc.nextInt();
     price = 80;
      price10=Number_of_item*price;
  }
  else {
        System.out.println(" no any items ");
        main(args);
  }
  System.out.println("Enter any items ");
  String y=sc.next();
  if(y.equalsIgnoreCase("y")){
    main(args);
  }else{
       Bill=price1+price2+price3+price4+price5+price6+price7+price8+price9+price10;
       System.out.println(" with out GST  your bill  "+Bill);
       GST = Bill*0.05;
       System.out.println("total GST "+GST);
    double a=Bill+GST;
System.out.println("total bill + GST  "+a);
}
  sc.close();
}
}
