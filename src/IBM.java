import java.util.Scanner;

public class IBM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, ibm;

        System.out.println("nhap can nang vao de: ");
        weight = scanner.nextDouble();

        System.out.println("nhap not chieu cao de: ");
        height = scanner.nextDouble();

        ibm = weight / Math.pow(height, 2) ;
        System.out.println(ibm);

        if (ibm < 18.5){
            System.out.println("Nghien qua roi");
        } else if (ibm < 25) {
            System.out.println("On phet day");
        } else if (ibm < 30 ) {
            System.out.println("Body dep day");
        } else {
            System.out.println("Beo lam roi giam can de");
        }
    }
}
