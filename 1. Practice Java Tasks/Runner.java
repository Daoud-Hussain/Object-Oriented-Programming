public class Runner{
	public static void main(String[] args) {
		circle cirObj = new circle();
		cirObj.radius = 2;

		//Circle class Methods
		cirObj.setValue(2,4);

		double areaOfCircle = cirObj.displayArea();
		System.out.println("Area of the circle is: "+ areaOfCircle);

		double circumferenceOfCircle = cirObj.displayCir();
		System.out.println("Circumference of the circle is: "+ circumferenceOfCircle);

		System.out.println("--------------------------------------------");

		//REctangle class methods
		Rectangle recObj = new Rectangle();
		recObj.setValueRec(4,5);

		double areaOfRectangle = recObj.findAreaRec();
		System.out.println("Area of rectangle is: "+ areaOfRectangle );		

		double parameterOfRectangle = recObj.findParameterRec();
		System.out.println("Parameter of rectangle is: "+ parameterOfRectangle );		

		System.out.println("--------------------------------------------");

		//Book class methods
		Book bookObj = new Book();
		bookObj.name = "Getting Started with java";
		bookObj.color = "Red";

		String bookName = bookObj.name;
		String bookColor = bookObj.color;

		System.out.println("Name of the book is: " + bookName);
		System.out.println("Color of the book is: " + bookColor);


		System.out.println("--------------------------------------------");

		//Time class methods
		Time oldTime = new Time(); 
		Time timeObj = new Time();
		timeObj.hours = 2;
		timeObj.mins = 15;
		
		oldTime.checkTime();
		timeObj.changeTime();


		System.out.println("--------------------------------------------");

		//Distance class methods
		Distance distObj = new Distance();
		distObj.distance = 1500;

		int distanceMeters = distObj.distanceInMeters();
		System.out.println("Distance in meters is: "+ distanceMeters );		

		double distanceKiloMeters = distObj.distanceInKilometers();
		System.out.println("Distance in Kilo meters is: "+ distanceKiloMeters );	

		System.out.println("--------------------------------------------");


		//Car class methods
		Car carObj = new Car();
		carObj.name = "Honda Civic";
		carObj.color = "Black";
		carObj.price = 2100000;

		carObj.getNameAndColor();

		int priceCar = carObj.price;
		System.out.println("Price of the car is: " + priceCar);

		System.out.println("--------------------------------------------");
	

		//Student class methods
		Student studentObj = new Student();
		studentObj.name = "Daoud Hussain";
		studentObj.regNo = "SP21-BCS-102";
		String[] abc = {"OOPs", "DSA", "Multi-Calculas", "Communication Skills", "Genetics"};
		studentObj.coursesRegistered = abc;

		studentObj.getNameAndRegNo();
		studentObj.getRegisteredCourses();
		//System.out.print(registeredCoursesList);

		System.out.println("--------------------------------------------");

		//Result class methods
		Result std = new Result();
		std.m1 = 40;
		std.m2 = 50;
		std.m3 = 60;

		System.out.println("Sum of all student m1 is: " + std.sum());
		System.out.println("Percentage of all student m1 is: " + std.percentage(300) + "%");

		}

}