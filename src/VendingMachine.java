import java.math.BigDecimal;

public class VendingMachine{
    	
    	BigDecimal deposit = new BigDecimal("0.0");
        BigDecimal zero = new BigDecimal("0.0");

        public void addDeposit(BigDecimal newDeposit)throws Exception{
                             	
            	if(newDeposit.compareTo(zero) < 0) {
            	throw new Exception();
            	
            }else {
            	deposit = deposit.add(newDeposit);
            	System.out.println("----------------------------------------");
            	System.out.println("     Total deposit : $" + deposit);
            	System.out.println("\n");  	
             }
         }
            
            public void purchase(String item, BigDecimal price) { 
       
              if(price.compareTo(deposit) <= 0){
            	 deposit = deposit.subtract(price);
            	 System.out.println("\n");
            	 System.out.println("----------------------------------------");
            	 System.out.println("     Here is " + item + ". Enjoy!");
            	 System.out.println("     Your balance is $" + deposit);
            	 System.out.println("\n");
              }else {
            	  System.out.println("----------------------------------------");
            	 System.out.println("   !!!  Your deposit is insufficient. Please deposit again.");
            	 System.out.println("\n"); 
              }
            }
           
        
          public void change() {
        System.out.println("----------------------------------------");
        System.out.println("      Don't forget your change : $" + deposit);
        System.out.println("\n");
        System.out.println("     * * * * * * * * * * * * * * * *");
        System.out.println("     * Thank you for your purchase *");
        System.out.println("     * * * * * * * * * * * * * * * *");
          }
    }


