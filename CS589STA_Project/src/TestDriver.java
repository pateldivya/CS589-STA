
import java.util.Scanner;

public class TestDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Account ac=new Account();
    System.out.println("STA Project Demo:");
	System.out.println("Driver for Account class.");
	Scanner sc = new Scanner(System.in);
    String s="y";
   while(s.equals("y")){
		System.out.println("Description of the Account class:\n1. open(int x, int y, int z) - sets balance to the value of x, pin number to the value of y, and an account # to the value of z\n"
					+"2. login() - allows to login to the account, where x is an account # \n"
					+"3. logout() -  allows to logout from the account\n"
					+"4. pin(int x) -  provides pin # (parameter x)\n"
					+"5. deposit(int d) - deposits amount d to the account\n"
					+"6. withdraw(int w) -  withdraws amount w from the account \n"
					+"7. balance() -  returns the value of the account balance \n"
					+"8. lock(int x) -  locks an account where x is the lock # \n"
					+"9. unlock(int x) -  unlocks an account when x equals to the correct lock # \n");
					
		System.out.println("Testing Oriented Methods:");
		
		System.out.println("10.Show_all()");
		System.out.println("11.Show_state()");
		System.out.println("12.Show_balance()");

		System.out.println("Enter ur choice:");
		String i = sc.next();
		int r=0;
		switch(i)
		{
			case "1":{
				System.out.println("\nEnter balance amount :");
				int x = sc.nextInt();
				System.out.println("\nEnter pin :");
				int y = sc.nextInt();
				System.out.println("\nEnter account #:");
				int z = sc.nextInt();
				r=ac.open(x,y,z);
				System.out.println("Result-"+r);
				break;  }
			case "2":{
				System.out.println("\nEnter account # to login :");
				int x = sc.nextInt();
				r=ac.login(x);
				System.out.println("Result-"+r);
				break;}
			case "3":{
				r=ac.logout();
				System.out.println("Result-"+r);
				break;}
			case "4":{
				System.out.println("\nEnter pin to go ahead :");
				int x = sc.nextInt();
				r=ac.pin(x);
				System.out.println("Result-"+r);
				break;}
			case "5":{
				System.out.println("\nEnter amount you want to deposit :");
				int d = sc.nextInt();
				r=ac.deposit(d);
				System.out.println("Result-"+r);
				break;}
			case "6":{
				System.out.println("\nEnter amount you want to withdraw  :");
				int w = sc.nextInt();
				r=ac.withdraw(w);
				System.out.println("Result-"+r);
				break;}
			case "7":{
				r=ac.balance();
				System.out.println("Result-"+r);
				break;}
			case "8":{
				System.out.println("Enter lock # :");
				int x = sc.nextInt();
				r=ac.lock(x);
				System.out.println("Result-"+r);
				break;}
			case "9":{
				System.out.println("Enter  corect lock # to unlock :");
				int x = sc.nextInt();
				r=ac.unlock(x);
				System.out.println("Result-"+r);
				break;}
			
			case "10":{ac.Show_all();break;}
			case "11":{ac.Show_state();break;}
			case "12":{ac.Show_balance();break;}
			default:{System.out.println("wrong choise:");}
		System.out.println("Enter ''y'' if you want to continue:");
		s=sc.next();
	}
   }
   System.out.println("<----------Exit from Test Driver--------->");	
 }
}
