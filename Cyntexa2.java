import java.util.Scanner;

public class Cyntexa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a+b+c) == (a*b*c)){
            System.out.println("Spy no");
        }else {
            System.out.println("not spy no");
        }
    }
}
