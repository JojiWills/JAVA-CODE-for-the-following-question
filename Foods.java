
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
   

