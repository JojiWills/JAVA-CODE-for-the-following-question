//define wether abstract class / abstract method
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
