import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	 

    public static void main(String[] args) {
    	VendingMachine v = new VendingMachine();
    
    	Scanner scanner = new Scanner(System.in);
    	
        String[] items = new String[] {"Coca-Cola","Canada Dry", "Sprite", "Boss Rainbow Mountain", "Water "};
        String[] prices = new String[] {"1.25", "1.50", "1.30","1.80", "0.85"};
     
       
        System.out.println("\n");
        System.out.println("     * * * * * * * * * *");
        System.out.println("     *     Welcome     *");
        System.out.println("     * * * * * * * * * *");
        System.out.println("\n");
        
        
        while(true) {
        
        System.out.println("  < Today's Lineup > ");
        
        for(int i = 0; i < 5; i++) {	
        	System.out.println("     " + items[i] + " : $" + prices[i]);
        }
        
        System.out.println("\n");       
        System.out.println(" < MENU >  1:Deposit  2:Purchase  3:Exit");
        System.out.println("\n");
        System.out.print("     Select a number from the nemu. : No.");
        
        try {
        int menuNo = scanner.nextInt();
        
        System.out.println("\n");
  
        switch(menuNo){
          case 1:
        	  System.out.println("----------------------------------------");
        	  while(true) {
              try {
            	  System.out.print("     Enter the amount of deposit. :$");
                  BigDecimal newDeposit = scanner.nextBigDecimal();

                  v.addDeposit(newDeposit);
                  break;
              }catch(Exception e){  
            	  System.out.println("----------------------------------------");
            	 System.out.print("   !!!  The deposit is invalid.    ");
            	 System.out.println(scanner.nextLine());
          		 System.out.println("\n");
              }
        	  }
        	  break;
             
          case 2:
        	  System.out.println("----------------------------------------");
        	  System.out.println(" < Today's Lineup >");
        	  for(int i = 0; i < 5; i++) {
              	int no = i+1;
              	System.out.println("     " + no + ". " + items[i] + " : $" + prices[i]);
              }
        	 System.out.println("\n");
  
        	 while(true) {   		 
             try {
            	 System.out.print("     Select a number of a product. :No.");
            	 int productNo =scanner.nextInt();
                 
            	 BigDecimal price = new BigDecimal(prices[productNo-1]);
            	 
            	 v.purchase(items[productNo-1], price);
            	 break;
            	 
             }catch(Exception e) {
            	 System.out.println("\n");
            	 System.out.println("----------------------------------------");
            	 System.out.print("   !!!  The number is invalid.   ");
            	 System.out.println(scanner.nextLine());
               }
             }
        	 break;
        	 
          case 3:
        	  v.change();
              System.exit(0);
              scanner.close();
             break;
             
          default:
        	  System.out.println("----------------------------------------");
        	System.out.print("   !!!  The number is invalid.   ");
          	System.out.println("\n");
        }
        
        }catch(Exception e) {
        	System.out.println("----------------------------------------");
        	System.out.print("   !!!  The number is invalid.   ");
        	System.out.println(scanner.nextLine());
        	System.out.println("\n");
        }
        }
    }
}



//Structure
//
//Main {
//	main(){
//		switch() {
//		try {
//		case1
//		case2
//		case3
//		default
//		
//		}catch(exception) {
//			
//		}
//	}
//}
//	
//VendingMachine{
//	addDeposit(){
//}
//	purchase(){
//		
//	}
//	change(){
//}}
