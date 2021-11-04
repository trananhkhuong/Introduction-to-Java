import java.util.Scanner;

public class Quydoitien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so tien muon quy doi: ");
        int rate = sc.nextInt();
        System.out.println("Gia tien duoc quy doi la: " + rate * 23000 + "VND");
    }
}
