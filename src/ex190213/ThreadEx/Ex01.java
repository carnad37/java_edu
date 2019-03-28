package ex190213.ThreadEx;

public class Ex01 {
	
	public static void main(String[] args) {
		SharedPrinter p = new SharedPrinter();
		String[] engText = {"Wise men say,","only fools rush in","But I can't help, ","falling in love with you", "Shall I stay?", "Shall I stay?", "Would it be a sin?"};
		String[] numText = {"���ع��� ��λ��� ������ �⵵��", "�ϴ����� �����ϻ� �츮���󸸼�", "���ѻ�� �������� ���� �����ϼ�", "�������� �� �ҳ��� ö���� �θ���","�ٶ��Ҹ� �Һ����� �츮 ���󸸼�"};
		Thread th1 = new WorkerThread(p, engText);
		Thread th2 = new WorkerThread(p, numText);
		
		th1.start();
		th2.start();
		
	}
}

class SharedPrinter {	
	void print(String text) {
		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i));
			System.out.println();
		}
	}	
}

class WorkerThread extends Thread {
	SharedPrinter p;
	String[] text;
	WorkerThread(SharedPrinter p, String[] text) {
		this.p = p;
		this.text = text;
	}
	
	public void run() {
		for (int i = 0; i < text.length; i++) {
			p.print(text[i]);
		}
	}
}