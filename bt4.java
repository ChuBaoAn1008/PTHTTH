import java.util.Scanner;
public class nguyento {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nBT4 tuan2:tinh tong tu 1->n :");
        System.out.println("---------------------------------");
        System.out.print("nhap so nguyen n = ");
        int n = sc.nextInt();
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong =tong + i;
        }
        System.out.println("tong tu 1->n = "+tong);
        System.out.println("---------------------------------"); 
    }
}