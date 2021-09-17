import java.util.Scanner;
public class bai7 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] ps = nhapps();
        bai7.intoado(ps);
    }
    static int[] nhapps() {
        int[] nps = new int[2];
        System.out.println("Nhap phan so: ");
        System.out.println("tu so:");
        nps[0] = sc.nextInt();
        System.out.println("mau so: ");
        nps[1] = sc.nextInt();
        return nps;
    }
    public static void intoado(int[] x){
        System.out.println("phan so duoc tao:");
        System.out.println(x[0]+"/"+x[1]);
    }
}