//Mingwei Zhang

import java.util.*;
public class Assignment2_CalcuatorApp {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcuator App");
		System.out.println("1 - Add \n" +
		"2 - Subtract\n" +
		"3 - Multiply\n" +
		"4 - Divide\n");
		
		System.out.println("Enter Option:");
		int options = sc.nextInt();
		System.out.println("Enter First Num:");
		float num1 = sc.nextFloat();
		System.out.println("Enter Second Num:");
		float num2 = sc.nextFloat();
		
		float result = 0;
		boolean valid = true;
		switch(options)
		{
			case 1:
				result = num1 + num2;
				break;
			case 2:
				result = num1 - num2;
				break;
			case 3:
				result = num1 * num2;
				break;
			case 4:
				result = num1 / num2;
				break;
			default:
				valid = false;
				System.err.println("Invalid Option");
			break;
		}
		
		if(valid == false)
		{
			System.out.println("Output Result is: N/A");
		}else
		{
			System.out.println("Output Result is: " + result);
		}
	
		sc.close();
	}
}
