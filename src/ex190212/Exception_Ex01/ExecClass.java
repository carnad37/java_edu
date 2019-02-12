package ex190212.Exception_Ex01;

public class ExecClass {

	public static void main(String[] args) {
		
		String[] input = {"a"};
		try
		{
			String data1 = input[0];
			String data2 = input[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1+value2;
			System.out.println(data1+"+"+data2+"="+result);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�ε����� �ùٸ��� �ʽ��ϴ�.");
		}
		catch(NumberFormatException e)
		{
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		}
		finally
		{
			System.out.println("�ٽ� �����ϼ���.");
		}
		
	}
	
}
