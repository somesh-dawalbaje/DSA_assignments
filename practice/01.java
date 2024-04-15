class Demo{
    public static void main(String[] args) {
        String s="classrooms";
        int ch[]=new int[126];
        for (int i = 0; i < s.length(); i++) {
            ch[(int)s.charAt(i)]++;
        }
        int max=0;
        for (int i = 0; i < ch.length; i++) {
           if(ch[i]>max)
                max=ch[i];
        }
        int max2=0;
        int ans=0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>max2 && ch[i]<max){
                max2=ch[i];
                ans=i;
            }
            
        }
        System.out.println((char)ans);
    }
}