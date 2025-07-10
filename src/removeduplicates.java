public class removeduplicates {
    static void check(String s) {
        int[] b=new int[1000];
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            b[c]++;
        }
        for(int i=0;i<s.length();i++) {
            if(b[s.charAt(i)]==1){
                System.out.print(s.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        String s="nithin";
        check(s);
    }
}
