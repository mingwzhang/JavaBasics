
class Vehicle
{
	int vehicle_id;
	String name;
	float price;
 
	public Vehicle (int vehicle_id, String name, float price)
	{
		this.vehicle_id = vehicle_id;
		this.name = name;
		this.price = price;
	}

}


class Car extends Vehicle
{

	public Car() {
		super(2, "CarName", 42231.98f);
	}

	
	public void showCar()
	{
		System.out.println("Car inherit from vehicle ");

		System.out.println("Id: " + vehicle_id);
		System.out.println("Name: " + name);
		System.out.println("Price: $" + price);
		System.out.println("=======================");
	}
}


class Truck extends Vehicle
{
	public Truck() {
		super(4, "TruckName", 38683.57f);

	}
	public void showTruck()
	{
		System.out.println("Truck inherit from vehicle ");

		System.out.println("Id: " + vehicle_id);
		System.out.println("Name: " + name);
		System.out.println("Price: $" + price);
		System.out.println("=======================");
	}
}


class Bike extends Vehicle
{
	public Bike() {
		super(6, "Name", 8643.12f);
	}
	public void showBike()
	{
		System.out.println("Bike inherit from vehicle ");

		System.out.println("Id: " + vehicle_id);
		System.out.println("Name: " + name);
		System.out.println("Price: $" + price);
		System.out.println("=======================");
	}
}

public class Assignment6_Polymorphism {
	
	public static void main(String[] args)
	{
		Car cr = new Car(); 
		Truck tk = new Truck(); 
		Bike be = new Bike(); 

		cr.showCar();
		tk.showTruck();
		be.showBike();
	}
}
