package ex190211.Exception_Ex01;

public class SubStringExpceptionTest {
	
	public static void main(String[] args) {
		String str = "this is a java";
		String subStr = null;
		try
		{
			subStr = str.substring(-1);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("�ε����� �������� �߸� �����Ǿ����ϴ�.");
		}
	}


}
