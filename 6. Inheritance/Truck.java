public class Truck extends Vehicle{
	double capacityInTons;
	int capacityInPounds;


	Person per1 = new Person(20, "Daoud");
	public Truck(String mn, int nc, Person per1, int cp, double ct){
		super(mn, nc, per1);
		if(cp != 0 && ct != 0){
			capacityInPounds = cp;
			capacityInTons = ct;
		}
	}

	public void display(){
		System.out.println("Owner Name: " + per1.getName());
		System.out.println("Owner Age: " + per1.getAge());
		System.out.println("Manufacture's Name: " + manufacturerName);
		System.out.println("Number of Cylinders: " + numberOfCylinders);
		System.out.println("Load Capacity in Tons: " + capacityInTons);
		System.out.println("Load Capacity in Pounds: " + capacityInPounds);

	}

}