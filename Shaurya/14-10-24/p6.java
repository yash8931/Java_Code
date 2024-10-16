import java.util.Scanner;

class p6 {
    public void convertCase(String name) {
        String str = "";
        
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
            } else if (ch >= 'a' && ch <= 'z') {
                ch -= 32;
            }
            str += ch;
        }
        
        System.out.println("The name = " + name);
        System.out.println("New name = " + str);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        
        p6 obj = new p6();
        obj.convertCase(name);
    }
}

// output :
// Enter the name: JaMes BoNd
// The name = JaMes BoNd
// New name = jAmES bOnD
