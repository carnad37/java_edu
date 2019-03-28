package ex190213.ThreadEx;

public class Ex01 {
	
	public static void main(String[] args) {
		SharedPrinter p = new SharedPrinter();
		String[] engText = {"Wise men say,","only fools rush in","But I can't help, ","falling in love with you", "Shall I stay?", "Shall I stay?", "Would it be a sin?"};
		String[] numText = {"동해물과 백두산이 마르고 닳도록", "하느님이 보우하사 우리나라만세", "대한사람 대한으로 길이 보전하세", "남산위에 저 소나무 철갑을 두른듯","바람소리 불변함은 우리 나라만세"};
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