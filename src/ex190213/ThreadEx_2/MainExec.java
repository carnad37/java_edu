package ex190213.ThreadEx_2;

public class MainExec {
	public static void main(String[] args) {
		Rect rect = new Rect();
		rect.set_value(5, 10);
		rect.start();
		try {
			Thread.sleep(6000);
			rect.interrupt();
		}
		catch (InterruptedException e) {
			System.out.println("InterruptedException ¹ß»ý");
		}
	}	
}
