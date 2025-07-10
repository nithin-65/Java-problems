import java.util.Arrays;

    public class anagram {
        static boolean foryou(String s,String t) {
            String temp="";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) !=' ') {
                    temp= temp+s.charAt(i);
                }
            }
            s=temp;
            String nok="";
            for(int i=0;i<t.length();i++) {
                if(t.charAt(i) !=' ') {
                    nok=nok+t.charAt(i);
                }
            }
            t=nok;
            s=s.toLowerCase();
            t=t.toLowerCase();
            char[] arr1=s.toCharArray();
            char[] arr2=t.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            s=new String(arr1);
            t=new String(arr2);
            return s.equals(t);
        }
        public static void main(String[] args){
            String s="Funeral";
            String t="Real Fun";
            System.out.println(foryou(s,t));
        }
    }



