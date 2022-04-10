public class Pizza{
	private String size;
	private int numberOfCheeseToppings;
	private int numberOfPepperoneiToppings;
	private int numberOfHamToppings;



	public Pizza(){
		//Default Constructor
	}
	//Full-Argument Constructor
	public Pizza(String s, int nct, int npt, int nht){
		if(s!="" && nct >0 && nht >0 && npt >0 ){
			size = s;
			numberOfHamToppings = nht;
			numberOfPepperoneiToppings = npt;
			numberOfCheeseToppings = nct;
		}
	}


	//Setters
	public void setSize(String s){
		if(s != ""){
			size = s;
		}
	}

	public void setNumberOfCheeseToppings(int nct){
		if(nct > 0){
			numberOfCheeseToppings = nct;
		}
	}

	public void setNumberOfHamToppings(int nht){
		if(nht > 0){
			numberOfHamToppings = nht;
		}
	}

	public void setNumberOfPepperoneiToppings(int npt){
		if(npt > 0){
			numberOfPepperoneiToppings = npt;
		}
	}


	//Getters
	public String getSize(){
		return size;
	}

	public int getNumberOfHamToppings(){
		return numberOfHamToppings;
	}

	public int getNumberOfCheeseToppings(){
		return numberOfCheeseToppings;
	}


	public int getNumberOfPepperoneiToppings(){
		return numberOfPepperoneiToppings;
	}


	//Calculating Cost
	public double calcCost(){
		double cost;
		if(size == "Small" || size == "small" || size == "SMALL" ){
			// 1 Dollar == 184PKR 
			//Small: $10 + $2 per topping
			cost = (10*184)+(2*184*numberOfCheeseToppings)+(2*184*numberOfHamToppings)+(2*184*numberOfPepperoneiToppings);
		}
		else if(size == "Medium" || size == "medium" || size == "MEDIUM" ){
			// 1 Dollar == 184PKR 
			//Medium: $12 + $2 per topping
			cost = (12*184)+(2*184*numberOfCheeseToppings)+(2*184*numberOfHamToppings)+(2*184*numberOfPepperoneiToppings);
		}

		else if(size == "Large" || size == "large" || size == "LARGE" ){
			// 1 Dollar == 184PKR 
			//Large: $14 + $2 per topping
			cost = (14*184)+(2*184*numberOfCheeseToppings)+(2*184*numberOfHamToppings)+(2*184*numberOfPepperoneiToppings);
		}
		else{
			cost = 0;
		}
		return cost;
	}

	public String getDescription(){
		String description;
		description = size +" "+ Integer.toString(numberOfPepperoneiToppings) +" "+ Integer.toString(numberOfCheeseToppings) + " "+Integer.toString(numberOfHamToppings);
		return description;
	}

}