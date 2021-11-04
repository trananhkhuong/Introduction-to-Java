import java.util.Scanner;

public class songaycuathang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao de: ");
        int month = scanner.nextInt();

        if (month <= 12 && month > 0) {

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " có 31 ngày nhé");
                break;
            case 2:
                System.out.println("Tháng " + month + " có 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("Tháng " + month + " có 30 ngày");
             }
        }
    }
}
