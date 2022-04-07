public class PizzaOrder{
	private Pizza pizza1;
	private Pizza pizza2;
	private Pizza pizza3;


	PizzaOrder(){
		pizza1 = new Pizza();
		pizza2 = new Pizza();
		pizza3 = new Pizza();

	}
	

	//For 1 pizzas
	public PizzaOrder(Pizza p1){
		pizza1 = p1;

	}

	//For 2 pizzas
	public PizzaOrder(Pizza p1, Pizza p2){
		pizza1 = p1;
		pizza2 = p2;

	}

	//For 3 pizzas
	public PizzaOrder(Pizza p1, Pizza p2, Pizza p3){
		pizza1 = p1;
		pizza2 = p2;
		pizza3 = p3;

	}

	//Setters
	public void setPizza1(Pizza p1){
		pizza1 = p1;
	}

	public void setPizza2(Pizza p2){
		pizza2 = p2;
	}

	public void setPizza3(Pizza p3){
		pizza3 = p3;
	}

	
	//Method to calculate total cost
	// public double calcTotal(){
	// 	double cost;
	// 	cost 
	// }

}