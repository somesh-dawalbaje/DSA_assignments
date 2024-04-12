class ReverseStr {

    public static void solve(char[]s,int i,int n){
        if (i < n / 2) {
            char temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;
            solve(s, i + 1, n);
        }
    }
    public static void main(String[] args) {
        String str="Shubham";
         char[] s1 = str.toCharArray();
         int n=s1.length;
        solve(s1, 0, n);
        System.out.println("Reversed string: " + String.valueOf(s1));
    }

}