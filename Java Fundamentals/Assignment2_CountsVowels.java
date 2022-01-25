//Mingwei Zhang

import java.util.*;
public class Assignment2_CountsVowels {
	public static void main(String[] args) {
 	
		Scanner sc = new Scanner(System.in);
		
		int TotalCount = 0;
		
		int vowel = 0;
		int nonVowel = 0;
		
		while(TotalCount < 10)
		{
			System.out.println("Enter a Alphabet: ");
			char alph = sc.next().charAt(0);
			
			if(alph == 'a' || alph == 'e' || alph == 'i' || alph == 'o' || alph == 'u'
			|| alph == 'A' || alph == 'E' || alph == 'I' || alph == 'O' || alph == 'U')
			{
				vowel++;
			}else {
				nonVowel++;
			}
			TotalCount++;
		}
		
		if(vowel > nonVowel)
		{
			System.out.println("Vowels counts is more than Non_Vowels");
		}else if(vowel < nonVowel) {
			System.out.println("Non_Vowels count is more than Vowels");
		}else {
			System.out.println("Both are equals");
		}
 		
		System.out.println();
		System.out.println("Vowel count: " + vowel);
		System.out.println("Non Vowel count: " + nonVowel);
		
		sc.close();

	}

}
