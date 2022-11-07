package Ch08;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterDemo {

	/*
	 * system.read(), Scanner() -> 텍스트 파일 입력에서는 
	 * FileReader보다는 Scanner class가 편하다.
	 * 이유: nextLine,nextInt등 메서드들의 사용이 용이함
	 *	Scanner 클래스를 이용하여 File 객체를 사용하면 
	 * 	Scanner fileinput = new Scanner(new File(filename)) 으로 사용가능
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("파일 이름:");
		String name = scan.nextLine().trim();//공백 문자는 없애고 받음
		
		PrintWriter outwriter = null; //printwriter  객체 초기화
		
		//예외처리문
		try {
			outwriter  = new PrintWriter(name); //해당 이름의 파일 생성
			
		}
		
		catch(FileNotFoundException e) { //예외문
			System.out.println(name+"을 열지 못했습니다.");
			System.exit(0); //시스템 종료
		}
		System.out.println("텍스트를 입력하시오\n 끝낼 때는 입력없이 enter키 입력");
		String line = scan.nextLine(); //우선 라인을 처음 받아옴
		while(line.length()>0) { //만약 받은 줄이 하나라도 있으면 
			outwriter.println(line); //파일 쓰기
			line = scan.nextLine(); //다음 줄을 입력 받음
		}
		
		outwriter.close();
		System.out.println(name+"파일이 생성되었다.");
	}
	
	
}
