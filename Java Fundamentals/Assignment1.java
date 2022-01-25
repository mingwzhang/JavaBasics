import java.util.*;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number:");
		int num2 = sc.nextInt();

		/* Even
		while(num1 <= num2)
		{
			if(num1%2 == 0) 
			{
				System.out.println(num1);
			}
			num1++;
		}
		*/
		
		//odd
		while(num1 <= num2)
		{
			if(num1%2 == 1) 
			{
				System.out.println(num1);
			}
			num1++;
		}
		sc.close();
	}
}
