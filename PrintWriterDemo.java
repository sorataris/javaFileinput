package Ch08;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterDemo {

	/*
	 * system.read(), Scanner() -> �ؽ�Ʈ ���� �Է¿����� 
	 * FileReader���ٴ� Scanner class�� ���ϴ�.
	 * ����: nextLine,nextInt�� �޼������ ����� ������
	 *	Scanner Ŭ������ �̿��Ͽ� File ��ü�� ����ϸ� 
	 * 	Scanner fileinput = new Scanner(new File(filename)) ���� ��밡��
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("���� �̸�:");
		String name = scan.nextLine().trim();//���� ���ڴ� ���ְ� ����
		
		PrintWriter outwriter = null; //printwriter  ��ü �ʱ�ȭ
		
		//����ó����
		try {
			outwriter  = new PrintWriter(name); //�ش� �̸��� ���� ����
			
		}
		
		catch(FileNotFoundException e) { //���ܹ�
			System.out.println(name+"�� ���� ���߽��ϴ�.");
			System.exit(0); //�ý��� ����
		}
		System.out.println("�ؽ�Ʈ�� �Է��Ͻÿ�\n ���� ���� �Է¾��� enterŰ �Է�");
		String line = scan.nextLine(); //�켱 ������ ó�� �޾ƿ�
		while(line.length()>0) { //���� ���� ���� �ϳ��� ������ 
			outwriter.println(line); //���� ����
			line = scan.nextLine(); //���� ���� �Է� ����
		}
		
		outwriter.close();
		System.out.println(name+"������ �����Ǿ���.");
	}
	
	
}
