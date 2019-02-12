package ex190212.API_Ex01;

public class MainApp {

	public static void main(String[] args) {
		
		String data = "사과!@#$%^배!@#$%^파인애플";
		String delimiter = "!@#\\$%\\^";
		
		String[] dataArr = data.split(delimiter);
		
		for(int i =0; i<dataArr.length; i++)
		{
			System.out.println(dataArr[i]);
		}		

	}	
}
