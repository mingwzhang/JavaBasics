//Mingwei Zhang

import java.util.*;
public class Assignment3_PrintsThreeIntEveryLine {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter First Number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		int num2 = sc.nextInt();

		int count = 0;
		while (num1 <= num2)
		{
			if(count < 2)
			{
				count++;
				System.out.print(num1 + " ");
			}else {
				System.out.print(num1 + " \n");
				count = 0;
			}
			num1++;
		}
		
		sc.close();
	}
}
