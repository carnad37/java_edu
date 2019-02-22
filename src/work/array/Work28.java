package work.array;

import java.util.Scanner;

public class Work28 {

	public static void main(String[] args) {
		
		Work28 w28 = new Work28();
		int[] versionA=new int[3];
		int[] versionB=new int[3];
		String inputNum;		

		w28.setVerNumArray(versionA);
		w28.setVerNumArray(versionB);

		w28.printCompareVersion(versionA, versionB);
		
		
	}
	public void setVerNumArray(int[] versionArray)
	{
		Scanner scan = new Scanner(System.in);
		int check=0,  result=0, count=0;
		System.out.print("버전을 입력해주세요 : ");
		String version = scan.nextLine();
		version=version+".";
		//.을 경계로 읽기를 멈춤 그전까진 계속 합침.
		for(int i=0;i<version.length();i++)
		{
			int versionIndexNumber = (int)version.charAt(i)-48;
			if(versionIndexNumber==-2)
			{
				versionArray[count]=result;
				count++;
				result=0;
				check=0;
			}
			else if(check>0)
			{
				result=(result*10)+versionIndexNumber;
			}
			else
			{
				check++;
				result += versionIndexNumber;
			}		
			
		}		
	}
	
	public void printCompareVersion(int[] versionA, int[] versionB)
	{
		String result = " = ";
		for(int i=0;i<3;i++)
		{
			if(versionA[i]>versionB[i])
			{
				result = " > ";
				break;
			}
			else if(versionA[i]<versionB[i])
			{
				result = " < ";
				break;
			}
		}
		System.out.println(versionA[0]+"."+versionA[1]+"."+versionA[2]+result+versionB[0]+"."+versionB[1]+"."+versionB[2]);
		
	}
	
}
