
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
