package work.collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeMain eMain = new EmployeeMain();
		
		String filePath = "D:\\HHS\\�����ڷ�\\�ڹ�\\�˰���\\00_�ǽ�\\salary.txt";
		List<Employee> employeeList = eMain.OpenFile(filePath);
		
		//1. �μ����� �� ���ɾ� ���(�̸�-�Ǽ��ɾ�)
		for (Employee employee : employeeList) {
			String name = employee.getName();
			int salary = employee.getSalary();
			System.out.println(name + " - " + salary);
		}
		System.out.println();
		
		//2. �μ��� ��� �Ǽ��ɾ��� ���
		int employeeNumber = employeeList.size();
		int sumSalary = 0;
		
		for (Employee employee : employeeList) {
			sumSalary += employee.getSalary();
		}
		double avgSalary = sumSalary / employeeNumber;
		avgSalary *= 10;
		avgSalary = Math.round(avgSalary);
		avgSalary /= 10;
		System.out.println("�μ� ��� ���� : " + avgSalary);
		System.out.println();
		
		//3. �μ����� �� �޿��� ���
		for (Employee employee : employeeList) {
			String name = employee.getName();
			int preSalary = employee.getPreSarlay();
			System.out.println(name + " - " + preSalary);
		}
		System.out.println();
		
		//4. ����+���ο����� �ݾ��� ���� ���� �μ����� �̸��� �ݾ��� ���
		Employee mostPoorEmployee = null;
		int minFullTax = 0;
		
		for (int i = 0; i < employeeNumber; i++) {
			if (i != 0) {
				Employee employee = employeeList.get(i);
				int fullTax = employee.getfullTax();
				if (minFullTax > fullTax) {
					mostPoorEmployee = employee;
					minFullTax = fullTax;
				}
			} else {
				Employee employee = employeeList.get(i);
				mostPoorEmployee = employee;
				minFullTax = employee.getfullTax();	
			}
		}
		
		String poorName = mostPoorEmployee.getName();
		int poorTax = mostPoorEmployee.getfullTax();
		System.out.println(poorName + " - " + poorTax);
	}
	
	public List<Employee> OpenFile(String filePath){
		List<Employee> employeeList = new LinkedList<Employee>();
		File file = null;
		BufferedReader bfReader = null;
		try {
			file = new File(filePath);
			bfReader = new BufferedReader(new FileReader(file));
			String line = "";
			while ((line = bfReader.readLine()) != null) {
				StringTokenizer lineToken = new StringTokenizer(line, ",");
				String name = lineToken.nextToken();
				int salary = Integer.parseInt(lineToken.nextToken());
				int tax = Integer.parseInt(lineToken.nextToken());
				int nationalPension = Integer.parseInt(lineToken.nextToken());
				Employee employee = new Employee(name, salary, tax, nationalPension);
				employeeList.add(employee);
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				if (bfReader != null) {
					bfReader.close();
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		return employeeList;
	}
}
