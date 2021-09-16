import java.util.Scanner;
public class nguyento {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nBT2 tuan2:kiem tra so nguyen to :");
        System.out.println("---------------------------------");
        System.out.print("nhap so nguyen n = ");
        int n = sc.nextInt();
         if (n <= 1) {
            System.out.println(n+"\tkhong la so nguyen to");
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(n+"\tkhong la so nguyen to");
                break;
            }
                System.out.println(n+"\tla so nguyen to");
                break;
        }
       System.out.println("---------------------------------"); 
    }
}