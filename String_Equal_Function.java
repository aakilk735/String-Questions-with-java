import java.util.Scanner;

public class String_Equal_Function {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First String=");
        String first=sc.nextLine();
        System.out.print("Enter the Second String=");
        String second=sc.nextLine();
        System.out.print("Enter the Third String=");
        String third =sc.nextLine();
        boolean Result1=first.equals(second);
        System.out.println(Result1);
        boolean Result2=second.equals(third);
        System.out.println(Result2);

    }
}
