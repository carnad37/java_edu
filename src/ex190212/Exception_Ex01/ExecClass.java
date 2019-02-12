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
			System.out.println("인덱스가 올바르지 않습니다.");
		}
		catch(NumberFormatException e)
		{
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		finally
		{
			System.out.println("다시 실행하세요.");
		}
		
	}
	
}
