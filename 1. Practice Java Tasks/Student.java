class Student{
	String regNo, name; 
	String[] coursesRegistered ;

	public void getNameAndRegNo() {
		System.out.printf("Name of the student is: %s and Reg-No of the car is: %s \n", name, regNo);
	}

	public void getRegisteredCourses() {
		System.out.println("Registered courses are: ");
		for(int i=0; i<coursesRegistered.length; i++){
			System.out.println(coursesRegistered[i]);
		}
	}
}