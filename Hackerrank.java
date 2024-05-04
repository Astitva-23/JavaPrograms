import java.util.Scanner;

class Hackerrank {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] a = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        int min = a[0][0];
        int r = 0, c = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; i < y; i++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    r = i;
                    c = j;
                }
            }
        }

        if (r < x / 2 && c < y / 2) {
            System.out.print("1");
        } else if (r < x / 2 && c >= y / 2) {
            System.out.print("2");
        } else if (r >= x / 2 && c < y / 2) {
            System.out.print("3");
        } else {
            System.out.print("4");
        }

    }
}