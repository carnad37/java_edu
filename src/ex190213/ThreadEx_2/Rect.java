package ex190213.ThreadEx_2;

public class Rect extends Thread{
	
	public final static boolean ON = true;
	public final static boolean OFF = true;

	private int height;
	private int width;
	private boolean setFlag = false;
	private String star = "*";
	private String blank = " ";

	public int getArea(int heigth, int width) {
		if(setFlag != ON)
		{
			System.out.println("�簢���� ũ�Ⱑ �������� �ʾҽ��ϴ�.");
			return 0;
		}
		return heigth * width;
	}
	
	public void set_value(int h, int w) {
		if (h < 2) {
			System.out.println("���̴� 2���� ũ�� �Է����ּ���.");
			return;
		}
		setFlag = ON;
		height = h;
		width = w;
	}
	
	public void run() {
		if(setFlag != ON)
		{
			System.out.println("�簢���� ũ�Ⱑ �������� �ʾҽ��ϴ�.");
			return;
		}
		while(true)
		{
			printRect(this.height, this.width);
			try {
				sleep(1000);
			}
			catch (InterruptedException e) {
				System.out.println("InterruptedException �߻�");
				break;
			}
		}
	}
	
	private void printRect(int height, int width)
	{
//		for (int i = 0; i < height; i++) {			
//			for (int j = 0; j < width; j++) {
//				if ((i != 0)&&(i != (height - 1))) {
//					if ((j != 0)&&(j != (width - 1))) {
//						System.out.print(blank);
//					}
//					else {
//						System.out.print(star);
//					}
//				}
//				else {
//					System.out.print(star);
//				}
//			}
//			System.out.println();
//		}	
		for (int i = 0; i < width; i++) {
			System.out.print(star);
		}
		System.out.println();
		for (int i = 0; i < height-2; i++) {
			for (int j = 0; j < width; j++) {
				if ((j != 0)&&(j != (width - 1))) {
					System.out.print(blank);
				}
				else {
					System.out.print(star);
				}
			}
			System.out.println();
		}
		for (int i = 0; i < width; i++) {
			System.out.print(star);
		}
		System.out.println();

	}
}
