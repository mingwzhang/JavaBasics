//Mingwei Zhang

import java.util.Scanner;

public class Assignment5_ChecksProductExistence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
			
		System.out.println("Enter the Product which you are looking?");
		
		String input = sc.next();
				
		boolean exist = false;
		
		String[] list = {"Laptop", "Television", "Desktop", "Phone", "Keyboard"};
 
		for(int x = 0; x < list.length; x++)
		{
			if(list[x].equals(input))
			{
				exist = true;
 				System.out.println(list[x] + " is available in " + x + " Position");
			}
		}

		if(exist == false)
		{
			System.err.println("Error: Product is not exist.");
		}

		sc.close();
	}
}
