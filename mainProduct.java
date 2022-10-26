//math operation
//any calculation
//import library

import java.util.Scanner;

public class mainProduct
{
  public static void main (String []args)
  {
      //scanner
      Scanner scan = new Scanner(System.in);
      
      //arraylist
      Product [] arrProduct = new Product [3];
      
      //declare variables
      String proCode;
      String expirationDate;
      int quantity;
      int capacity;
      //int i ; //looping identifier
      char productType;
      
      //user input
      
      for (int i = 0 ; i<arrProduct.length ; i++)
      {
           System.out.println ("Enter Product Code :");
          proCode = scan.nextLine();
          scan.nextLine();
          System.out.println (" Enter Quantity :");
          quantity = scan.nextInt();
          System.out.println("Enter Product Type (F)oods or (W)ashingMachine :");
          scan.nextLine();
          productType = scan.nextLine().charAt(0);

          
          
          if (productType == 'F' || productType == 'f')
          {
              System.out.println ("Enter Expiration Date (dd/mm/yyyy): ");
              expirationDate = scan.nextLine();
              scan.nextLine();
              arrProduct [i] = new Foods(proCode,quantity,expirationDate);
           }
          else 
           {
               System.out.println ("Enter Washing Machine Capacity :");
               capacity = scan.nextInt();
               arrProduct[i] = new WashingMachine(proCode,quantity,capacity);
            }
           
           
      }
      //display proCode and quantity Food that expired on October 2016
        for (int i=0 ; i<arrProduct.length;i++)
           {
               if(arrProduct[i] instanceof Foods)
               {
                   Foods foodExp = (Foods)arrProduct[i];
                   
                   if(foodExp.getExpirationDate().substring(3).equals("10/2016"))
                   {
                       System.out.println("\n Product Expired on october 2016 :\n"+foodExp.getProCode()+"Product Quantity :"+foodExp.getQuantity());
                   }
               }
           }
           
           
           
           //display and count the total number of washing machine with capacity more than 10kg
          int countWashMachine = 0;
          for (int i=0; i<arrProduct.length;i++)
          {
              if (arrProduct[i] instanceof WashingMachine)
              {
                  WashingMachine washMachine = (WashingMachine)arrProduct[i];
                  
                  if(washMachine.getCapacity()>10)
                  countWashMachine = countWashMachine + washMachine.getQuantity();
               }
          }
          
      System.out.println ("\n Number of Washing Machine with capacity more than 10kg :\n" + countWashMachine);
     
  }
  
}

