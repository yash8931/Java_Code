import java.util.Scanner;

class p9 {
    public static void main(String[] args) {
        int x, len, pos = 0; 
        char ch;
        Scanner sc = new Scanner(System.in);
        String name, last_word = "";
        
        System.out.print("Input a name = ");
        name = sc.nextLine();
        
        len = name.length();
        
        for (x = len - 1; x >= 0; x--) {
            ch = name.charAt(x);
            if (ch == ' ') {
                pos = x;
                break;
            }
        }
        
        last_word = name.substring(pos + 1, len);
        
        System.out.print("OUTPUT: The initials are: ");
        System.out.print(name.charAt(0) + ". ");
        
        for (x = 1; x < pos; x++) {
            ch = name.charAt(x);
            if (ch == ' ') {
                System.out.print(name.charAt(x + 1) + ". ");
            }
        }
        
        System.out.println(last_word);
    }
}



// Output:
// Input a name = Salman kumar Misra 
// OUTPUT: The initials are: S. k. Misra
