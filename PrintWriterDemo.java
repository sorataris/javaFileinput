package Ch08;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterDemo {

	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("���� �̸�:");
		String name = scan.nextLine().trim();
		
		PrintWriter outwriter = null;
		
		//����ó����
		try {
			outwriter  = new PrintWriter(name);
			
		}
		
		catch(FileNotFoundException e) {
			System.out.println(name+"�� ���� ���߽��ϴ�.");
			System.exit(0);
		}
		System.out.println("�ؽ�Ʈ�� �Է��Ͻÿ�\n ���� ���� �Է¾��� enterŰ �Է�");
		String line = scan.nextLine();
		while(line.length()>0) {
			outwriter.println(line);
			line = scan.nextLine();
		}
		
		outwriter.close();
		System.out.println(name+"������ �����Ǿ���.");
	}
	
	
}
