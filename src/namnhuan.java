import java.util.Scanner;

public class namnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years;

        System.out.println("Điền năm vào đê: ");
        years = scanner.nextInt();

        if (years % 4 == 0) {
            if (years % 100 == 0) {
                if (years % 400 == 0) {
                System.out.println("Nam nhuan" + years );
            } else {
                System.out.println("Khong phai nam nhuan" + years);
            }
        } else {
            System.out.println("Nam Nhuan: " + years);
            }
        } else {
            System.out.println("khong phai nam nhuan: " + years);
        }
    }
}
