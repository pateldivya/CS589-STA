
//***********************************************
//************* CLASS ACCOUNT *******************
//***********************************************



public class Account
{
	private int x0;
	private int x1;
	private int x2;
	private int x3;
	private int x4;
	private int x5;
	private int x6;
	private int x7;
	private int x8;
	private int x9;
	
	
	//constructor of the Account class 
	public Account()
	{
		x2 = 0;
		x4 = -1;
		x6 = 20;
		x7 = 500;
		x9 = 0;
		x0 = 3;
	}
	public final int open(int x, int y, int z)
	{
		if ((x > 0) && (x4 == -1) && (y > 0) && (z > 0))
		{
			x1 = x;
			x3 = y;
			x5 = z;
			x4 = 0;
			System.out.println("\nAccount has been opened successfully....\n");
			return 0;
		};
		System.out.println("\nSorry,something went wrong !!!\n");
		return -1;
	}
	public final int pin(int x)
	{
		if (x4 != 1)
		{
			System.out.println("\nSorry,you can not perform this operation at this state !!!\n");
			return -1;
		}
		if (x == x3)
		{
			System.out.println("\nCorrect pin!!\n");
			x4 = 2;
			return 0;
		}
		else
		{
			System.out.println("\nWrong pin! Please try again...\n");
			x9++;
		}
		if (x9 >= x0)
		{
			System.out.println("\nSorry, too many attempts.!!! Login again to move forward.\n");
			x4 = 0;
		}
		System.out.println("\nSorry,something went wrong !!!\n");
		return -1;
	}
	public final int logout()
	{
		if ((x4 == 0) || (x2 == 1))
		{
			System.out.println("Sorry, you can not perform this operation at this state!!!");
			return -1;
		}
		System.out.println("\nlogged out successfully!!!!\n");
		x4 = 0;
		return 0;
	}
	public final int login(int x)
	{
		if (x4 != 0)
		{
			System.out.println("\nSorry,you can not perform this operation at this state!!!\n");
			return -1;
		}
		if (x5 == x)
		{
			x4 = 1;
			x9 = 0;
			System.out.println("\nsuccessfully logged in!!\n");
			return 0;
		}
		System.out.println("\nWrong Credentials!!\n");
		return -1;
	}
	public final int balance()
	{
		if (x4 != 2)
		{
			System.out.println("\nSorry,you can not perform this operation at this state!!!\n");
			return -1;
		}
		System.out.println("your balance is" + x1);
		return x1;
	}
	public final int lock(int x)
	{
		if (x4 != 2)
		{
			System.out.println("\nSorry,you can not perform this operation at this state!!!\n");
			return -1;
		}
		if (x == x3)
		{
			
			return -1;
		}
		if (x2 == 0)
		{
			x2 = 1;
			x8 = x;
			System.out.println("\naccount is locked.....:(\n");
			return 0;
		}
		else
		{
			System.out.println("\nSorry,something went wrong !!!\n");
			return -1;
		}
	}
	public final int unlock(int x)
	{
		if (x4 != 2)
		{
			System.out.println("\nSorry,you can not perform this operation at this state!!!\n");
			return -1;
		}
		if ((x2 == 1) && (x == x8))
		{
			x2 = 0;
			System.out.println("\naccount unlocked.....:)\n");
		return 0;
		}
		else
		{
			System.out.println("\nSorry,something went wrong !!!\n");
			return -1;
		}
	}
	public final int deposit(int d)
	{
		if (x4 != 2)
		{
			System.out.println("\nSorry,you can not perform this operation at this state!!!\n");
			return -1;
		}
		if (x2 == 1)
		{
			System.out.println("\nYou have to unlock your account first...\n");
			return -1;
		};
		if ((x1 + d < x7) && (d>0))
		{
			x1 = x1 + d - x6;
			System.out.println("\namount has been deposited successfully\n");
			return 0;
		}
		else
		{
			if (d > 0)
			{
			x1 = x1 + d;
			System.out.println("\namount has been deposited successfully\n");
			
			return 0;
			}
		}
		System.out.println("\nSorry,something went wrong !!!\n");
		return -1;
	}
	public final int withdraw(int w)
	{
		if (x4 != 2)
		{
			System.out.println("\nSorry,you can not perform this operation at this state\n");
			return -1;
		}
		if (x2 == 1)
		{
			System.out.println("\nYou have to unlock your account first...\n");
			return -1;
		}
		if ((x1 > w) && (w > 0))
		{
			if (x1 < x7)
			{
				return -1;
			}
			else
			{
				x1 = x1 - w;
				System.out.println("\namount has been withdrawn successfully...\n");
				
			};
			if (x1 < x7)
			{
				x1 = x1 - x6;
				
			}
		  return 0;
		}
		return -1;
	}
	
	//testing purpose method
	public void Show_all() {
		
		
		System.out.println("\nx0= "+ x0);
		System.out.println("x1= "+ x1);
		System.out.println("x2= "+ x2);
		System.out.println("x3= "+ x3);
		System.out.println("x4= "+ x4);
		System.out.println("x5= "+ x5);
		System.out.println("x6= "+ x6);
		System.out.println("x7= "+ x7);
		System.out.println("x8= "+ x8);
		System.out.println("x9= "+ x9 + "\n");
		
		if(x4==0) {
			System.out.println("\nCurrent State is \"idle\"\n");
		}
		else if(x4==1) {
			System.out.println("\nCurrent State is \"check pin\"\n");
		}
		else if(x4==2) {
			if(x2==1) {
				System.out.println("\nCurrent State is \"locked\"\n");
			}
			else if(x1<x7) {
				System.out.println("\nCurrent State is \"overdrawn\"\n");
			}
			else {
				System.out.println("\nCurrent State is \"ready\"\n");
			}
		}else {
			System.out.println("\nCurrent State is \"starting state\"\n");
		}
		
		System.out.println("\nCurrent Balance: $"+x1 + "\n");
		
	}

	//testing purpose method
	public void Show_state() {
		if(x4==0) {
			System.out.println("\nCurrent State is \"idle\"\n");
		}
		else if(x4==1) {
			System.out.println("\nCurrent State is \"check pin\"\n");
		}
		else if(x4==2) {
			if(x2==1) {
				System.out.println("\nCurrent State is \"locked\"\n");
			}
			else if(x1<x7) {
				System.out.println("\nCurrent State is \"overdrawn\"\n");
			}
			else {
				System.out.println("\nCurrent State is \"ready\"\n");
			}
		}else {
			System.out.println("\nCurrent State is \"starting state\"\n");
		}
		
	}

	//testing purpose method
	public void Show_balance() {
		System.out.println("\nCurrent Balance: $"+x1 + "\n");
		
	}
	
	
}
