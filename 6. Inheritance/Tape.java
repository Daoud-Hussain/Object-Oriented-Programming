public class Tape extends Publication{
	private int playingTimeInMinutes;


	//Setter Method
	public void setPlayingTimeInMinutes(int ptim){
		if(ptim != 0){
			playingTimeInMinutes = ptim;
		}
	}

	//Getter Method
	public int getPlayingTimeInMinutes(){
		return playingTimeInMinutes;
	}	

	public void display(){
		System.out.println("Price: " + getPrice());
		System.out.println("Title: " + getTitle());
		System.out.println("Playing Time: " + playingTimeInMinutes);
	}
}