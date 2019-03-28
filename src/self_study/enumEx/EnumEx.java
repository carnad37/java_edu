package self_study.enumEx;

public class EnumEx {

	public enum Button {
		ON, OFF
	}
	
	static Button button;
	
	public static void main(String[] args) {
		
		button = Button.ON;
		
		boolean aa = (button == Button.ON);
		
	}
	
}
