import java.util.Scanner;
public class SumOfNNumbers {

    public static void main(String[] args) {

        int sum = 0;

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("");

        for (int i = 0; i <= n; i++) {
            sum = sum + i;
            System.out.println(sum);

        }
        System.out.println("");
        System.out.println("The sum of "+n+" numbers is "+sum);
    }
}