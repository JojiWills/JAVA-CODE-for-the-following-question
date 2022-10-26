# JAVA-CODE-for-the-following-question


<img width="441" alt="2022-10-26" src="https://user-images.githubusercontent.com/109582424/198057546-6df027b2-094c-4ed5-b23d-bbfb84c9fdb3.png">



#JAVA CODE 

//PRODUCT CODE

public abstract class Product
{
     String proCode;
     int quantity;
    
    //default constructor
    public Product ()
    {
       
        proCode = "" ;
        quantity = 0;
        
    }
    //normal constructor
    public Product (String p,int q )
    {
        proCode = p;
        quantity = q;
       
    }
    //setter
    public void setProduct (String proCode ,int quantity)
    {
        proCode = proCode;
        quantity = quantity;
        
    }
    
    //getter
    public String getProCode (){return proCode;}
    public int getQuantity (){return quantity;}
    
    
    //toString
    public String toString () 
    {
        return (super.toString() + "\n Product Code : " +proCode +"Quantity :"+quantity);
    }
}




FOODS CODE


public class Foods extends Product
{
   private String expirationDate;
   
   //default
   public Foods()
   {
      super();
      expirationDate = ""; 
   }
   
   //normal
   public Foods(String p,int q,String e)
   {
     super(p,q);
     this.expirationDate = e;
   }
   
   //getter
   public String getExpirationDate () {return expirationDate;}
   public String getProCode () {return ("product code :" + super.getProCode());}
    
   public String toString()
   {
       return (super.toString() +"\nExpiration Date : " + expirationDate );
   }
}
   

WASHING MACHINE CODE


public class WashingMachine extends Product
{
     public int capacity ;
    //default
    public WashingMachine ()
    {
        super();
        int capacity = 0;
    }
    
    //normal
    public WashingMachine (String p , int q,int capacity)
    {
        super (p,q);
        this.capacity = capacity;
    }
    
    //getter
    public int getCapacity() {return capacity;}
     public String getProCode() {return ("Product Code :"+super.getProCode());}
    
   
    public String toString ()
    {
        return (super.toString()+"Capacity :"+capacity);
    }
}

MAIN PRODUCT 


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

