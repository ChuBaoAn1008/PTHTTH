import java.util.Scanner;
public class ptbac2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\nBT3 tuan2: giai pt bac 2 :");
        System.out.println("---------------------------------");
        System.out.print("nhap he so bac 2, a = ");
        float a = ptbac2.scanner.nextFloat();
        System.out.print("nhap he so bac 1, b = ");
        float b = ptbac2.scanner.nextFloat();
        System.out.print("nhap hang so, c = ");
        float c = scanner.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT vo nghiem");
            } else {
                System.out.println("PT co 1 nghiem "
                        + "x = " + (-c / b));
            }
            return;
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("PT co 2 nghiem la: "
                    + "x1 = " + x1 + " & x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("PT co 1 nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("PT vo nghiem");
        }
        System.out.println("---------------------------------"); 
    }
   
}