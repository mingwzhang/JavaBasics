import java.util.ArrayList;
//Mingwei Zhang
/*
Design an Application called Student Course Management
create interface called StudentCourse
add an abstract method called addCourse
add an abstract method called viewCourse
add an abstract method called addFee() (Fee Range is 500 to 2000)
if course fee is more than 10000 then student will get 10 percent Disc. other wise no Disc.
Note:
Make sure that all the method will throws exception
If we enter the course fees more than 2000 then an exception raise (The Course Fees cannot applicable)

And this interface must be implement atleast two class(Two COURSE)


*/



interface StudentCourse {
	abstract String addCourse(String c) throws NullPointerException;
	abstract void viewCourse() throws Exception;
	abstract int addFee(float fee) throws Exception ;
}

class management implements StudentCourse{
	ArrayList<String> courses = new ArrayList<String>();
	ArrayList<Float> totalFee = new ArrayList<Float>();

	@Override
	public String addCourse(String c) throws NullPointerException{
		if(c.equals(""))
		{
			throw new NullPointerException("Class is null");
		}else {
			courses.add(c);
		}

		return "";
	}

	@Override
	public void viewCourse()  throws Exception{
		
		if(courses.size() <= 1)
		{
			throw new Exception("Not enough courses");
		}else {
			for(int x = 0; x < courses.size(); x++)
			{
				System.out.println(courses.get(x));
			}
		}
		System.out.println("View Courses:");
	}

	@Override
	public int addFee(float fee) throws Exception{
		
		if(fee < 500 || fee > 2000)
		{
			throw new Exception("The Course Fees cannot applicable");
		}
		else
		{
			totalFee.add(fee);
		}
		return 0;
	}
	
	public void totalFee()
	{
		float total = 0;
		
			for(int x = 0; x < totalFee.size(); x++)
			{
			total += totalFee.get(x);
		}
		
		if(total > 10000)
		{
			float disc_total = total * .9f;
			System.out.println("The price is " + disc_total + " including 10% discount.");
		}else {
			System.out.println("The price is " + total + " with no discount.");
		}
	}
}


	

public class Assignment7_ChecksStudentClassDiscount{
	public static void main(String arg[]) throws Exception
	{
		management sc = new management();
		sc.addCourse("History");
		sc.addCourse("Math");
		sc.addCourse("Science");
		sc.addCourse("Writing");
		sc.addCourse("Spanish");
		sc.addCourse("Philosophy");

		sc.addFee(1999);
		sc.addFee(1999);
		sc.addFee(1999);
		sc.addFee(1999);
		sc.addFee(1999);
		sc.addFee(1999);

		
		sc.viewCourse();
		sc.totalFee();

	}
}
	
