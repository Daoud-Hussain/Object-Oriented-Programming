class Result{
	
	int m1,m2,m3;


	public int sum() {
		return m1+m2+m3;
	}

	public double percentage(int total) {
		int result = (sum()*100)/total;
		return result;
	}

}