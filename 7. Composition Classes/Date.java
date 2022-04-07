public class Date{
	private int day;
	private int month;
	private int year;



	Date(){

	}
	Date(int h, int s, int c){
			day = h;
			month = s;
			year = c;
	}

	public int getDay(){
		return day;
	}

	public int getMonth(){
		return month;
	}


	public int getYear(){
		return year;
	}

}