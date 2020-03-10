package patterns.creationalpatterns.abstractfactorypattern;

abstract class Loan
{  
   protected double rate;  
   abstract void getInterestRate(double rate);  
   
   public void calculateLoanPayment(double loanamount, int years)  
   {              
         double EMI;  
         int monthly_installments;  
  
         monthly_installments=years*12;  
         rate=rate/1200;  
         EMI=((rate*Math.pow((1+rate),monthly_installments))/((Math.pow((1+rate),monthly_installments))-1))*loanamount;  
  
         System.out.println("Your monthly EMI is "+ EMI +" for the amount "+loanamount+" you have borrowed");     
   }  
}