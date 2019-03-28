package work.collection;

import java.util.ArrayList;
import java.util.List;

public class SaveAToZ {

	public static void main(String[] args) {
		int intData = 65;
		
		List<Character> alphabetList = new ArrayList<Character>();		
		while (intData<91) {			
			char data = (char)intData;
			alphabetList.add(data);
			intData++;
		}
		
		//1.A-Z까지 모두 출력
		
		for (char alphabet : alphabetList) {
			System.out.print(alphabet+" ");
		}
		System.out.println();
		//2.Z->A로 출력
		
		int listEndIndex = alphabetList.size()-1;
		for (int i = listEndIndex; i >= 0; i--) {
			char alphabet = alphabetList.get(i);
			System.out.print(alphabet+" ");
		}
		System.out.println();
		
		//3.M-R까지 삭제
		int startIndex = (int)'M'-65;
		int endIndex = (int)'R'-65;
		for (int i = endIndex; i >= startIndex; i--) {
			alphabetList.remove(i);
		}
		System.out.println(alphabetList.size());
		
		//4.E-J까지 출력
		
		startIndex = (int)'E'-65;
		endIndex = (int)'J'-65;
		for (int i = startIndex; i <= endIndex; i++) {
			char alphabet = alphabetList.get(i);
			System.out.print(alphabet+" ");
		}		
		
	}
	
}
