import java.util.*;

public class CalculatorTry {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int sum = a + b;
        int sub = a - b;
        int multi = a * b;
        int divide = a / b;
        int remainder = a % b;

        switch (x) {
            case 1 : System.out.println(sum);
            break;
            case 2 : System.out.println(sub);
            break;
            case 3 : System.out.println(multi);
            break;
            case 4 : System.out.println(divide);
            break;
            case 5 : System.out.println(remainder);
            break;
            default : System.out.println("Invalid input");

        }
    }
}
