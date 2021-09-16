import java.util.Scanner;
class inhoa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String message;
    System.out.println("\nBT1 tuan2: in hoa chuoi ki tu:");
    System.out.println("---------------------------------");
    System.out.println("\nnhap chuoi can doi ");
    message = sc.nextLine();
    char[] charArray = message.toCharArray();
    for(int i = 0; i < charArray.length; i++) {
      if(charArray[i] >= 97 && charArray[i] <= 122){
        charArray[i] -= 32;
      }
    }
    message = String.valueOf(charArray);
    System.out.println("ket qua:" + message);
 
    System.out.println("\n---------------------------------");
  }
}