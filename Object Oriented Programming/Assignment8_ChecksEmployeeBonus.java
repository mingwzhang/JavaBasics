import java.util.*;
/*
 Java Assignment - 8
======================
design a application called EmpBonus
where you will assign different bonus amount for diff employee grade

Ex:

Grade A--->bonus applicable only 1000

Grade B--->bonus applicable only 700

Grade C-->bonus can applicable 500

if you are trying to assign some diff amount for diff grade it should raise an exception
called AmountMismatch Exception.

if the amount is matching accordingly the Grade
 
O/P

Bonus Amount is added Successful..
 */
@SuppressWarnings("serial")
class AmountMismatchException extends Exception
{
	AmountMismatchException(String s)
	{
		super(s);
	}
}

class EmpBonus
{
	public void Application(char grade, int bonus) throws AmountMismatchException
	{
		if((grade == 'A' || grade == 'a' && bonus == 1000) || (grade == 'B'|| grade == 'b'  && bonus == 700)
				|| (grade == 'C' || grade == 'c' && bonus == 500))
		{
			System.out.println("Bonus Amount is added Successful..");
		}else {
			throw new AmountMismatchException ("Employee Grade or Amount Mismatch");
		}
	}
}
public class Assignment8_ChecksEmployeeBonus {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EmpBonus eb = new EmpBonus();

		System.out.println("Enter the employee grade: ");
		char grade = sc.next().charAt(0);
		System.out.println("Enter the bonus: ");
		int bonus = sc.nextInt();
		
		try {
			eb.Application(grade, bonus);
		} catch (AmountMismatchException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
