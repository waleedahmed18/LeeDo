import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = reader.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = reader.nextInt();
        if (num1 > num2)
            System.out.println(num1 + " Is Larger");
        else if (num1 < num2)
            System.out.println(num2 + " Is Larger");
        else
            System.out.println("These Number Are Equal");
    }
}
