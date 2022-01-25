//Mingwei Zhang

import java.util.*;
public class Assignment4_CountsLetters {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		
		String s = sc.nextLine();
 		int count = 1;
 		char[] list = new char[s.length()];
		
		for(int x = 0; x < s.length(); x++)		//using for loop add the char of the string into array
		{
			list[x] = s.charAt(x);
		}
		
		for(int x = 0; x < s.length(); x++)
		{
			for(int y = x+1; y < s.length(); y++)
			{
				if(list[x] == list[y])	//compares char array of each index x to index y values
				{
  					count++;			//adds 1 to each repeated char
  					list[y] = ' ';		//replace the compared repeating char to ' ' 
  				}
 			}
			
			if(list[x] == ' ') //skips a iteration if there is ' ' in an array
				{				//"count = 1" resets the counted repeated value
					count = 1; 
					continue;
				}
			else {
				System.out.println(list[x] + " occurs " + count + " time");
				count = 1; 
			}
		}
		
		sc.close();
	}
}
