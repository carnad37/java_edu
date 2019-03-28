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
		String filePath = "D:\\HHS\\�����ڷ�\\�ڹ�\\�˰���\\00_�ǽ�\\student_info.txt";
		List<Student> studentList = sInfo.OpenFile(filePath);
				
		boolean exitFlag = OFF;
		while (exitFlag == OFF) {
			System.out.println("==================");
			System.out.println("1.�̸����� �˻�");
			System.out.println("2.�й����� �˻�");
			System.out.println("3.�а��� �˻�");
			System.out.println("4.����");
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
				System.out.println("�ý��� ����");
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
				System.out.println("�Էµ� ���� ���ڰ� �ƴմϴ�.");
				System.out.println("�ٽ� �Է����ּ���");
				System.out.print(">");
			}
			if ((number < 5) && (number > 0)) {
				exitFlag = ON;
			} else {
				System.out.println("�߸��� ���� �ԷµǾ����ϴ�.");
				System.out.println("�ٽ� �Է����ּ���");
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
			String line = bfReader.readLine();	//ù��°�� ����
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
			System.out.println("ã������ �л��� �̸��� �Է����ּ���.");
			System.out.print(">");
			String searchName = scan.nextLine();
			for (Student student : studentList) {
				String targetName = student.getName();
				if (searchName.equals(targetName)) {
					int studentID = student.getStudentID();
					String phoneNumber = student.getPhoneNumber();
					String subject = student.getSubject();
					System.out.println("�й� : " + studentID);
					System.out.println("��ȭ��ȣ : " + phoneNumber);
					System.out.println("�а� : " + subject);
					exitFlag = ON;
				}
			}
			if (exitFlag == OFF) {
				System.out.println("��ϵ��� ���� �̸��Դϴ�.");
			}
		}
	}
	
	public void studentIDSearch(List<Student> studentList, Scanner scan) {
		boolean exitFlag = OFF;
		while (exitFlag == OFF) {
			System.out.println("ã������ �л��� �й��� �Է����ּ���.");
			System.out.print(">");
			int searchStudentID = 0;
			
			boolean numberFlag = OFF;
			while (numberFlag == OFF) {
				String inputNumber = scan.nextLine();
				try {
					searchStudentID = Integer.parseInt(inputNumber);
				} catch (NumberFormatException e) {
					System.out.println("�Էµ� ���� ���ڰ� �ƴմϴ�.");
					System.out.println("�ٽ� �Է����ּ���");
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
					System.out.println("�̸� : " + name);
					System.out.println("��ȭ��ȣ : " + phoneNumber);
					exitFlag = ON;
				}
			}
			if (exitFlag == OFF) {
				System.out.println("��ϵ��� ���� �й��Դϴ�.");
			}
		}
	}
	
	public void subjectSearch(List<Student> studentList, Scanner scan) {
		boolean exitFlag = OFF;
		while (exitFlag == OFF) {
			System.out.println("ã������ �а��� �̸��� �Է����ּ���.");
			System.out.print(">");
			String searchSubject = scan.nextLine();
			for (Student student : studentList) {
				String targetSubject = student.getSubject();
				if (searchSubject.equals(targetSubject)) {
					String name = student.getName();
					int studentID = student.getStudentID();
					System.out.println("�̸� : " + name);
					System.out.println("�й� : " + studentID);
					exitFlag = ON;
				}
			}
			if (exitFlag == OFF) {
				System.out.println("��ϵ��� ���� �а��Դϴ�.");
			}
		}
	}
}

