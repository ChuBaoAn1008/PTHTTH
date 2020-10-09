package lab2;
/*chương trình quản lý các vật nuôi trong vườn thú*/
import java.util.Scanner;
public class Dongvat {
	public static void main(String[] args) {
		 System.out.println("Danh sách các con thú:\n1.Sư tử Leo\n2.Rắn Boa\n3.Khỉ George\n");
		int s;
		do {
		 Scanner scanner = new Scanner(System.in);
			System.out.println("Vui lòng nhập số thứ tự con vật cần kiểm tra:\n(Nhập 0 để thoát)");
			s = scanner.nextInt();
			switch(s) {
			case 0:
				System.out.println("\nChúc bạn một này tốt lành!\n Hẹn gặp lại lần sau");
				break;
			case 1:
				System.out.println("\nSư tử Leo nặng 300 cân và ăn 5 cân thịt mỗi ngày.\n");
				break;
			case 2:
				System.out.println("\nCon rắn Boa nặng 50 cân và dài 5 mét.\n");
				break;
			case 3:
				System.out.println("\nCon khỉ George nặng 150 cân và thích ăn chuối.\n");
				break;
			default:
				System.out.println("Không có thông tin phù hợp\n");
				break;
				}
			}while(s!=0);
	}
}
