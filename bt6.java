import java.util.Scanner;
public class bai6 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] gtd = gantoado();
        int[] ntd =nhaptoado();
        bai6.intoado(gtd);
        bai6.intoado(ntd);
    }
    static int[] gantoado()
    {
        System.out.println("gan toa do cho diem..... ");
        int[] gtd = new int[2];
        gtd[0] = 5;
        gtd[1] = 6;
        System.out.println("-----------------------------");
        return gtd;
    }
    static int[] nhaptoado() {
        System.out.println("nhap toa do cho diem..... ");
        System.out.println("........... ");
        int[] ntd = new int[2];
        System.out.println("Nhap toa do: ");
        System.out.println("hoanh do:");
        ntd[0] = sc.nextInt();
        System.out.println("tung do: ");
        ntd[1] = sc.nextInt();
        return ntd;
    }
    public static void intoado(int[] x){
        System.out.println("toa do diem duoc tao:");
        System.out.println("toa do la:  ("+ x[0]+","+x[1]+")");
    }
}