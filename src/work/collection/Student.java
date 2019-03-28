package work.collection;

public class Student {
	private String name;
	private int studentID;
	private String phoneNumber;
	private String subject;
	
	public Student(String name, int studentID, String phoneNumber, String subject) {
		this.name = name;
		this.studentID = studentID;
		this.phoneNumber = phoneNumber;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public int getStudentID() {
		return studentID;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getSubject() {
		return subject;
	}
}
