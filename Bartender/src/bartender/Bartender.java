package bartender;

import java.util.Scanner;

public class Bartender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Irish Town:)))");
		System.out.println("Check the menu to order a drink and food menu for foods");
		YourWallet wallet=new YourWallet(65);
		String[] menu2= {"Chicken Fingers", "Meatballs with tomatoe sauce", "Irish Town Special", "Chicken Wrap", "Beef wrap"};
		
		String[] menu= {"Beer" , "Orange Juice", "Wine", "Club Soda", "Vodka"};
		
		for(int a=0;a<=4;a++) {
			if (a%2==0) {
			System.out.println(menu[a] + " is for adults only and is 15$");}
			else
				System.out.println(menu[a] + " is for everyone and is 5$");
			
		}
		
		for(int b=0;b<=4;b++) {
			if (b%2==0 && b!=2) {
				System.out.println(menu2[b] + " is 20$");}
			else if(b==2) {
				System.out.println(menu2[b] + " is 30$ and any non-alcohol drink comes free");
			}
			
			else
					System.out.println(menu2[b] + " is 17$");
		}
		
		
		System.out.println("What is your order? :)");
		Scanner scanner=new Scanner(System.in);
	   
		boolean more=true;
		int yourMoney=wallet.getMoney();
	   int choice=scanner.nextInt();
		   
	   
		 while(more=true && wallet.getMoney()<=65 && wallet.getMoney()!=0) {
			 int foodorder=scanner.nextInt();
			    int orderNo=scanner.nextInt();
			
		if(foodorder%2==0 && foodorder<=4 && foodorder!=2) {
			//wallet.spendingMoney(20);
			System.out.println("Enjoy your " + menu2[foodorder]);
			//System.out.println("Remaining money "+ wallet.getMoney() + "$");
			foodorder=scanner.nextInt();
			
		}
		else if(foodorder%2 != 0 && foodorder<=4) {
			//wallet.spendingMoney(17);
			System.out.println("Enjoy your "+ menu2[foodorder]);
			//System.out.println("Remaining money "+ wallet.getMoney() + "$");
			foodorder=scanner.nextInt();
			
		}
		else if(foodorder==2 && foodorder<=4 && orderNo%2!=2) {
			//wallet.spendingMoney(50);
			System.out.println("Enjoy your " + menu2[foodorder] + " with your " + menu[orderNo] );
			//System.out.println("Remaining money "+ wallet.getMoney() + "$");
			foodorder=scanner.nextInt();
			orderNo=scanner.nextInt();
			
		}
		
		
		
		
		
		
		if(orderNo%2==0 && orderNo<=4) {
			wallet.spendingMoney(15);
			System.out.println("Enjoy your " + menu[orderNo]);
			System.out.println("Remaining money "+ wallet.getMoney() + "$");
			orderNo=scanner.nextInt();
			
		}
		else if(orderNo%2 != 0 && orderNo<=4 && foodorder!=2) {
			wallet.spendingMoney(5);
			System.out.println("Enjoy your "+ menu[orderNo]);
			System.out.println("Remaining money "+ wallet.getMoney() + "$");
			orderNo=scanner.nextInt();
			foodorder=scanner.nextInt();
			
		}
		
	
		
		else if(yourMoney==0) {
			more=false;
			System.out.println("You can't afford to order more :((");
			System.exit(yourMoney);
	    }
		 
	continue;
	    
	    }
	
	
	    int tipAmount=scanner.nextInt();
		int tipper=wallet.tipping(tipAmount);
		
		while(yourMoney!=0 && more==true ) {
			if(tipAmount!=0 && yourMoney!=0) {
				System.out.println("Thanks! That's very generous of you ;))");
				System.out.println("Remaining money " + wallet.getMoney() +"$");
				more=false;
				continue;
			}
		}
	    
	    
	}   
	    
	    
	
}

