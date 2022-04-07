class Time{
	int hours, mins;

	public void checkTime(){
		hours = 12;
		mins = 40;
		System.out.printf("Time is: %d:%d \n", hours, mins);
	}

	public void changeTime(){
		System.out.printf("Time after changing is: %d:%d \n", hours, mins);
	}
}