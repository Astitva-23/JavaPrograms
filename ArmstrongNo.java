import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        int arm = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = n;
        while(n>0){
            int rem = n % 10;
            arm = (rem*rem*rem)+arm;
            n = n/10;
        }
        if(c == arm){
            System.out.println("Armstrong no");
        } else {
            System.out.println("Not an Armstrong no");
        }
    }
}
