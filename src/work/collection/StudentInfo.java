package work.collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentInfo {
	final static boolean ON = true;
	final static boolean OFF = false;

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		
		StudentInfo sInfo = new StudentInfo();		
		String filePath = "D:\\HHS\\강의자료\\자바\\알고리즘\\00_실습\\student_info.txt";
		List<Student> studentList = sInfo.OpenFile(filePath);
				
		boolean exitFlag = OFF;
		while (exitFlag == OFF) {
			System.out.println("==================");
			System.out.println("1.이름으로 검색");
			System.out.println("2.학번으로 검색");
			System.out.println("3.학과로 검색");
			System.out.println("4.종료");
			System.out.println("==================");
			System.out.print(">");
			int select = sInfo.selectNumber(scan);
			
			switch (select) {
			case 1:
				sInfo.nameSearch(studentList, scan);
				break;
			case 2:
				sInfo.studentIDSearch(studentList, scan);
				break;
			case 3:
				sInfo.subjectSearch(studentList, scan);
				break;
			case 4:
				exitFlag = ON;
				break;
			default:
				System.out.println("시스템 에러");
				return;
			}
		}		
	}
	
	public int selectNumber(Scanner scan) {
		int number = 0;

		boolean exitFlag = OFF;
		while (exitFlag == OFF) {
			try {
				String inputNumber = scan.nextLine();
				number = Integer.parseInt(inputNumber);
			} catch (NumberFormatException e) {
				System.out.println("입력된 값이 숫자가 아닙니다.");
				System.out.println("다시 입력해주세요");
				System.out.print(">");
			}
			if ((number < 5) && (number > 0)) {
				exitFlag = ON;
			} else {
				System.out.println("잘못된 값이 입력되었습니다.");
				System.out.println("다시 입력해주세요");
				System.out.print(">");
			}
		}
		return number;
	}
	
	public List<Student> OpenFile(String filePath){
		List<Student> studentList = new ArrayList<Student>();
		File file = null;
		BufferedReader bfReader = null;
		try {
			file = new File(filePath);
			bfReader = new BufferedReader(new FileReader(file));
			String line = bfReader.readLine();	//첫번째줄 제거
			while ((line = bfReader.readLine()) != null) {
				StringTokenizer lineToken = new StringTokenizer(line, " ");
				String name = lineToken.nextToken();
				int studentID = Integer.parseInt(lineToken.nextToken());
				String phoneNumber = lineToken.nextToken();
				String subject = lineToken.nextToken();
				Student student = new Student(name, studentID, phoneNumber, subject);
				studentList.add(student);
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				if (bfReader != null) {
					bfReader.close();
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		return studentList;
	}
	
	public void nameSearch(List<Student> studentList, Scanner scan) {
		boolean exitFlag = OFF;
		while (exitFlag == OFF) {
			System.out.println("찾으려는 학생의 이름을 입력해주세요.");
			System.out.print(">");
			String searchName = scan.nextLine();
			for (Student student : studentList) {
				String targetName = student.getName();
				if (searchName.equals(targetName)) {
					int studentID = student.getStudentID();
					String phoneNumber = student.getPhoneNumber();
					String subject = student.getSubject();
					System.out.println("학번 : " + studentID);
					System.out.println("전화번호 : " + phoneNumber);
					System.out.println("학과 : " + subject);
					exitFlag = ON;
				}
			}
			if (exitFlag == OFF) {
				System.out.println("등록되지 않은 이름입니다.");
			}
		}
	}
	
	public void studentIDSearch(List<Student> studentList, Scanner scan) {
		boolean exitFlag = OFF;
		while (exitFlag == OFF) {
			System.out.println("찾으려는 학생의 학번을 입력해주세요.");
			System.out.print(">");
			int searchStudentID = 0;
			
			boolean numberFlag = OFF;
			while (numberFlag == OFF) {
				String inputNumber = scan.nextLine();
				try {
					searchStudentID = Integer.parseInt(inputNumber);
				} catch (NumberFormatException e) {
					System.out.println("입력된 값이 숫자가 아닙니다.");
					System.out.println("다시 입력해주세요");
					System.out.print(">");
					continue;
				}
				numberFlag = ON;
			}
				
			for (Student student : studentList) {
				int studentID = student.getStudentID();
				if (searchStudentID == studentID) {
					String name = student.getName();
					String phoneNumber = student.getPhoneNumber();
					System.out.println("이름 : " + name);
					System.out.println("전화번호 : " + phoneNumber);
					exitFlag = ON;
				}
			}
			if (exitFlag == OFF) {
				System.out.println("등록되지 않은 학번입니다.");
			}
		}
	}
	
	public void subjectSearch(List<Student> studentList, Scanner scan) {
		boolean exitFlag = OFF;
		while (exitFlag == OFF) {
			System.out.println("찾으려는 학과의 이름을 입력해주세요.");
			System.out.print(">");
			String searchSubject = scan.nextLine();
			for (Student student : studentList) {
				String targetSubject = student.getSubject();
				if (searchSubject.equals(targetSubject)) {
					String name = student.getName();
					int studentID = student.getStudentID();
					System.out.println("이름 : " + name);
					System.out.println("학번 : " + studentID);
					exitFlag = ON;
				}
			}
			if (exitFlag == OFF) {
				System.out.println("등록되지 않은 학과입니다.");
			}
		}
	}
}

