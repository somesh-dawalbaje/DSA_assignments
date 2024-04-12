class PrintNumbers{

    public static void printNumbers(int start, int end) {
        if (start <= end) {
            System.out.println(start);
            printNumbers(start + 1, end);
        }
    }
    public static void main(String[] args) {
        int i=1;
        int n=10;
        printNumbers(i,n);
    }
}