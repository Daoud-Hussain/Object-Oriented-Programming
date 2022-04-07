class Rectangle{
	int length, width;

	public int findAreaRec() {
		return length*width;
	}

	public int findParameterRec() {
		return 2*(length+width);
	}

	public void setValueRec(int a, int b) {
		length = a;
		width = b;
		System.out.println("Length is: " + length);
		System.out.println("Width is: " + width);
	}
}