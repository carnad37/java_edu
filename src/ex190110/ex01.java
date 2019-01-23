package ex190110;

public class ex01 {

	public static void main(String[] args) {
		int num = 18;
		int nz2=0;
		int nz16=0;
		String z2=null;
		String z16=null;

		z2 = Integer.toBinaryString(num);
		z16 = Integer.toHexString(num);
		//변환되어 저장된 값은 String이다. 변환에 이용되는것은 int값이다. 즉 int->String
		System.out.println(num+"을 2진수로 변환한 값은 "+z2+"이고\n16진수로 변환한 값은 "+z16+"이다."+"\n");
		nz2 = Integer.parseInt(z2);
		nz16 = Integer.parseInt(z16);
		System.out.println("문자열을 숫자의 형태로 변경하면 산술이 가능하다.\n변환된 "+num+"의 2진수와 16진수의 합은 "+(nz2+nz16));
				
	}
	
}
