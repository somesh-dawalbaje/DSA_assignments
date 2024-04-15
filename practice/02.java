class Demo1{
    public static void main(String[] args) {
        String s="hello";
        StringBuffer s1=new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            int ch=s.charAt(i);
            ch=ch-32;
            s1.append((char)ch);
        }
        System.out.println(s1);
        
    }
}