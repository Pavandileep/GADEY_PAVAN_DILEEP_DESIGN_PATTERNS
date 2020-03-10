package patterns.creationalpatterns.abstractfactorypattern;

class HDFC implements Bank
{  
    private final String bankName;  

    public HDFC()
    { 
    	bankName="HDFC BANK";  
    }
    
   public String getBankName() 
   { 
	   return bankName;  
   }  
}  