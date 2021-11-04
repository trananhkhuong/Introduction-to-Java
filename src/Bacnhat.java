import java.util.Scanner;

public class Bacnhat {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac nhat");
        System.out.println("a * x + b = 0");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("a: ");
        double b = scanner.nextDouble();
        System.out.println("a: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("x = %f!\n" +  answer);

        }else {
            if (b == 0) {
                System.out.println("x!");
            } else {
                System.out.println("No");
            }
        }
    }
}
