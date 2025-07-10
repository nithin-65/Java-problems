public class frequency {
    static void check(int[] a) {
        int[] b=new int[1000];
        for (int i=0;i<a.length;i++) {
            b[a[i]]++;
        }
        for(int i=0;i<b.length;i++){
            if(b[i]>0){
                System.out.println("elements of " +i+ " " +b[i] +" timesa ");
            }
        }
    }
    public static void main(String[] args) {
        int[] a={12,12,34,67,89};
        check(a);
    }
}
