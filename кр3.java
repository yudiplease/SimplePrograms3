import java.util.Scanner;
public class кр3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        int count10 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10 == 0) {
                count0++;
            } else if (a[i] % 10 == 1) {
                count1++;
            } else if (a[i] % 10 == 2) {
                count2++;
            } else if (a[i] % 10 == 3) {
                count3++;
            } else if (a[i] % 10 == 4) {
                count4++;
            } else if (a[i] % 10 == 5) {
                count5++;
            } else if (a[i] % 10 == 6) {
                count6++;
            } else if (a[i] % 10 == 7) {
                count7++;
            } else if (a[i] % 10 == 8) {
                count8++;
            } else if (a[i] % 10 == 9) {
                count9++;
            } else {
                count10++;
            }
        }
        System.out.print("0:" + count0 + " times");
        System.out.println();
        System.out.print("1:" + count1 + " times");
        System.out.println();
        System.out.print("2:" + count2 + " times");
        System.out.println();
        System.out.print("3:" + count3 + " times");
        System.out.println();
        System.out.print("4:" + count4 + " times");
        System.out.println();
        System.out.print("5:" + count5 + " times");
        System.out.println();
        System.out.print("6:" + count6 + " times");
        System.out.println();
        System.out.print("7:" + count7 + " times");
        System.out.println();
        System.out.print("8:" + count8 + " times");
        System.out.println();
        System.out.print("9:" + count9 + " times");
        System.out.println("10:" + count10 + " times");


    }
}


