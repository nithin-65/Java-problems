public class commoninputs {
    public static void main(String[] args) {
        int[] a={12,45,67,89,90};
        int[]  b={23,44,88,12,45};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++) {
                if(a[i]==b[j]){
                    System.out.println(+a[i] +" ") ;
                }
            }
        }
    }
}
