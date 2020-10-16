package lab3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class Server {
	public static void main(String[] args) {
		try {
		ServerSocket server = new ServerSocket(9540);
		System.out.println("Server da duoc tao");
		Socket client = server.accept();
		System.out.println("Client da ket noi den server");
		Scanner inFromClient = new Scanner(client.getInputStream());
		PrintStream outToClient = new PrintStream(client.getOutputStream());
		outToClient.println("Vui long nhap tem sach:");
		String name = inFromClient.nextLine();
		System.out.println("clien: " + name);
		BufferedReader br = new BufferedReader(new FileReader("A:\\lab3.txt"));
					String textInALine = br.readLine();
		if(textInALine.contains(name))
		outToClient.println("Co sach " + name);
		else outToClient.println("Khong co sach");
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
}