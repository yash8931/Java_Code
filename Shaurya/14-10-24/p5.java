import java.util.Scanner;

class p5 {
    public void convert(String text) {
        String str = ""; 
        
        String St = text.toUpperCase(); 
        int L = St.length(); 
        
        for (int i = 0; i < L; i++) {
            char ch = St.charAt(i); 
            
            if (ch == ' ') {
                str += ' '; 
            } else {
                if (ch == 'Y') {
                    ch = 'A';
                } else if (ch == 'Z') {
                    ch = 'B';
                } else {
                    ch += 2; 
                }
                str += ch; 
            }
        }
        System.out.println("Input: " + text);
        System.out.println("Output: " + str);
    }
    
    public static void main(String[] args) {
        p5 obj = new p5();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        obj.convert(str);
        // obj.convert("Adc MOP Boy Girl xyZ IUX"); // Test input
    }
}


// output : 

// Input: Adc MOP Boy Girl xyZ IUX
// Output: CFE OQR DQA IKTN ZAB KWZ
