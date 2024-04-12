class AutomorphicNumbers{
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        String numberStr = String.valueOf(number);
        String squareStr = String.valueOf(square);

        // Check if the last digits of the square match the number
        return squareStr.endsWith(numberStr);
    }
    public static void main(String[] args) {
        int n=25;
        if(isAutomorphicNumber(n))
            System.out.println("Automorphic number");
        else
            System.out.println("not Automorphic number");

    }
}