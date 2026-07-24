//write a java program to calculate the tax based on employee yearly package.
import java.util.*;

class TaxExample2
{
	public static void main(String[] args)
	{
		double ctc,tax=0;

		System.out.println("Enter employee yearly package:");
		Scanner sc = new Scanner(System.in);
		ctc = sc.nextDouble();

		if(ctc <= 300000)
		{
			System.out.print("NoTax");
		}
		else if(ctc >= 300000 && ctc < 500000)
		{	
			tax = ctc * 0.05;
		}
		else if(ctc >= 500000 && ctc < 700000)
		{
			tax = ctc * 0.10;
			
		}
		else if(ctc >= 700000 && ctc < 1000000)
		{
			tax = ctc * 0.15;
			
		}
		else if(ctc >= 1000000 && ctc < 1500000)
		{
			tax = ctc * 0.20;
			
		}
		else if(ctc >= 1500000 && ctc < 2000000)
		{
			tax = ctc * 0.25;
			
		}
		else if(ctc >= 2000000 && ctc < 3000000)
		{
			tax = ctc * 0.30;
			
		}
		else
		{	
			tax = ctc * 0.35;
			
		}

		ctc = ctc - tax;
		System.out.print("\nTax Amount:"+tax);
		System.out.print("\nRemaining ctc:"+ctc);
	}
}