//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        static void check(String s) {
            int[] t = new int[256];
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                t[c]++;
            }
            for (int i = 0; i < s.length(); i++){
                if (t[s.charAt(i)] == 1) {
                    System.out.println(s.charAt(i));
                    break;
                }
            }
        }
        public static void main(String[] args) {
            String s="nithin";
            check(s);
        }
    }