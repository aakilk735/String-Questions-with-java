import java.util.Scanner;
public class String_Length {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String=");
        String str=sc.nextLine();
        int length=str.length();
        System.out.print(length);
    }
}
