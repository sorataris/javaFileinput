package Ch08;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterDemo {

	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("파일 이름:");
		String name = scan.nextLine().trim();
		
		PrintWriter outwriter = null;
		
		//예외처리문
		try {
			outwriter  = new PrintWriter(name);
			
		}
		
		catch(FileNotFoundException e) {
			System.out.println(name+"을 열지 못했습니다.");
			System.exit(0);
		}
		System.out.println("텍스트를 입력하시오\n 끝낼 때는 입력없이 enter키 입력");
		String line = scan.nextLine();
		while(line.length()>0) {
			outwriter.println(line);
			line = scan.nextLine();
		}
		
		outwriter.close();
		System.out.println(name+"파일이 생성되었다.");
	}
	
	
}
