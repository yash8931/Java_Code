import java.util.Scanner;

class Abword {
    String nm;
    String anm;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name in uppercase: ");
        nm = sc.nextLine();
    }

    String print(String a) {
        int spaceIndex = a.indexOf(' ');
        if (spaceIndex == -1) {
            return a;
        } else {
            anm = a.charAt(0) + ".";
            return anm + print(a.substring(spaceIndex + 1));
        }
    }

    void show() {
        String abbrevName = print(nm);
        System.out.println("Abbreviated Name: " + abbrevName);
    }

    public static void main(String[] args) {
        Abword obj = new Abword();
        obj.read();
        obj.show();
    }
}


// Enter the name in uppercase: Amit Ali Khan
// Abbreviated Name: A.A.Khan