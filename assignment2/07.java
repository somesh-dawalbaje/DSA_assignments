class Length {
	public static int findLength(String s) {
		if (s.equals("")) {
			return 0;
		} else {
			return 1 + findLength(s.substring(1));		 
		}
	}

	public static void main(String[] args) {
		String string = "My Name Is Shubham.";
		int length = findLength(string);
		System.out.println("Length of the string: " + length);

	}

}