public class Address{
	private String home;
	private int street;
	private String city;



	Address(){

	}
	Address(String h, int s, String c){
		if(h!="" && c!=""){
			home = h;
			street = s;
			city = c;
		}
	}

	public String getHome(){
		return home;
	}

	public int getStreet(){
		return street;
	}


	public String getCity(){
		return city;
	}

}