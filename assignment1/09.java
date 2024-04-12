class RamanujanNumber{
    public static boolean isRamanujanNumber(int number) {
        int limit = (int) Math.cbrt(number);
        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) {
                int sum = a * a * a + b * b * b;
                if (sum == number && a != b) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n=1729;
        if(isRamanujanNumber(n))
            System.out.println("Ramanujan number");
        else
            System.out.println("not Ramanujan number");
    }
}