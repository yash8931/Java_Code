import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str, path, fileName, extension;
        int x, y;

        System.out.print("Enter the full path of the file, as given in example = ");
        str = sc.nextLine();

        x = str.lastIndexOf('\\');
        y = str.lastIndexOf('.');

        path = str.substring(0, (x+1));
        fileName = str.substring((x+1), y);
        extension = str.substring((y+1));

        System.out.println("Output:");
        System.out.println("Path: " + path);
        System.out.println("File Name: " + fileName);
        System.out.println("Extension: " + extension);
    }
}


// input : C:\User\admin\Pictur\flower.jpg
// Output:
// Path: C:\User\admin\Pictur\
// File Name: flower
// Extension: jpg