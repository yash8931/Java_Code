import java.util.*;
public class p5 {
    private void convert(String text) {
        int len = text.length();
        for(int i = 0; i < len; ++i) {
            char ch = text.charAt(i);
            if(ch != ' ') {
                System.out.print((char)(Character.toUpperCase(ch) + 2));
            } else {
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        p5 obj = new p5();
        obj.convert(str);
    }
}
