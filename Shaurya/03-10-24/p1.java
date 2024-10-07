import java.util.*;
class p1 {
    public static void main(String[] args) {
        String str1 = "The green bottle is in the green bag";

        String str2 = str1.replace("green", "red");

        System.out.println(str2);


        String str3 = str1.replaceAll("g", "d");

        System.out.println(str3);
    }
}