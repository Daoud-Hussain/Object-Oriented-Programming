public abstract class Movie{
	protected String movieName;
	protected int ID;
	protected int numberOfDays;

	//Setters
	public void setMovieName(String mn){
		if(mn != ""){
			movieName = mn;
		}
	}

	public void setID(int id){
		if(id != 0){
			ID = id;
		}
	}

	public void setNumberOfDays(int ndys){
		if(ndys != 0){
			numberOfDays = ndys;
		}
	}

	//Getters
	public String getMovieName(){
		return movieName;
	}

	public int getID(){
		return ID;
	}

	public int getNumberOfDays(){
		return numberOfDays;
	}

	public boolean equals(Movie m){
		if(this.movieName == m.movieName && this.ID == m.ID && this.numberOfDays == m.numberOfDays ){
			return true;
		}
		return false;

	}

	public abstract double calculateFees();
}