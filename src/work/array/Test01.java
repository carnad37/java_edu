package work.array;

import java.util.*;

//���� ���� 48~57
//���� ���� 97~122, 65~90


public class Test01<E> {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//
//		// ����, ����, ���� ������ �޾Ƽ� ����,���,���� ���ϱ�
//		while (true) {
//			String name = "";
//			int kor, eng, math = 0;
//
//			System.out.print("�̸� :");
//			name = scan.next();
//
//			System.out.print("�������� �Է�:");
//			kor = scan.nextInt();
//
//			System.out.print("�������� �Է�:");
//			eng = scan.nextInt();
//
//			System.out.print("�������� �Է�:");
//			math = scan.nextInt();
//			
//			// ����, ���, ���� ���ϱ�
//			int sum = kor + eng + math;
//			double avg = (int) ((sum / 3.0) * 10) / 10.0;
//
//			String hak = "";
//			if (avg >= 90) {
//				hak = "A ����";
//			} else if (avg >= 80) {
//				hak = "B ����";
//			} else if (avg >= 70) {
//				hak = "C ����";
//			} else if (avg >= 60) {
//				hak = "D ����";
//			} else {
//				hak = "F ����";
//			}
//
//			System.out.println("***������***");
//			System.out.println("���� : " + name);
//			System.out.println("���� : " + sum);
//			System.out.println("��� : " + avg);
//			System.out.println("���� : " + hak);
//			System.out.println("**********");
//
//			System.out.println("Again? (Y/N) : ");
//			String msg = scan.next();
//			if (msg.equalsIgnoreCase("n"))
//				break;
//
//		}
//
//		System.out.println("���� �ϼ̽��ϴ�.");

//		List<String> nn = new ArrayList<String>();
//		nn.add("����");
//		String dd = nn.set(0, "����");
//		System.out.println(dd);
//		System.out.println(nn.get(0));
//		Set<Integer> target = new HashSet<Integer>();
//		target.add(2);
//		target.add(2);
//		System.out.println(target.size());

		Map<String,String> map = new HashMap<String,String>();
		map.put("dd", "ddd");
		map.put("ee", "eee");
		Set<Map.Entry<String,String>> aa = map.entrySet();
		for (Map.Entry<String, String> entry : aa)
		{
			
		}
		
//		Set<Integer> aa = new HashSet<Integer>();
//		boolean res = aa.add(1);
//		System.out.println(res);
//		res = aa.add(1);
//		System.out.println(res);
	}
	
	public E[] gee()
	{
		Object okdok = new Object[10];
		E[] e = (E[])okdok;
		return e;
	}

}
