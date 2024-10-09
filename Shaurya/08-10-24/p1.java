// program to count & print no. of vowel, consonents, numbers, symbols, spaces and word.
import java.util.*;
class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vw = 0, co = 0, nb = 0, sy = 0, sp = 0, wd = 0;

        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') 
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                {
                    vw++;
                } 
                else 
                {
                    co++;
                }
            }

            else if(ch >= '0' && ch <= '9') 
            {
                nb++;
            }

            else if(ch == ' ')
            {
                ++sp;
            }

            else 
            {
                sy++;
            }
        }
            System.out.println("Vowels are: " + vw);
            System.out.println("Consonents are: " + co);
            System.out.println("Numbers are: " + nb);
            System.out.println("Spaces are: " + sp);
            System.out.println("Symbols are: " + sy);
            System.out.println("Words are: " + (sp + 1));
    }
}

<<<<<<< HEAD
=======


>>>>>>> 9b34775 (Your commit message)
// output
// Enter a string: 
// Hey! my name is Yash889618@gmail.com
// Vowels are: 8
// Consonents are: 15
// Numbers are: 6
// Spaces are: 4
// Symbols are: 3
<<<<<<< HEAD
//Words are: 5
=======
//Words are: 5
>>>>>>> 9b34775 (Your commit message)
