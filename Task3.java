import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        double sqrt = Math.sqrt(x);
        int cx = x;
        int mnozhitel = 2;
        while (cx > 1 && mnozhitel <= sqrt && !isPrime(x)){
            if (cx % mnozhitel == 0) {
                System.out.print(mnozhitel + " ");
                cx /= mnozhitel;
            } else if (mnozhitel == 2) {
                mnozhitel++;
            } else {
                mnozhitel += 2;
            }
        }
        if (isPrime(x)) {
            System.out.println("Prime");
        }
        if (cx != 1) {
            System.out.print(cx);
        }

    }
    static boolean isPrime(int a) {
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
