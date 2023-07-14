package employeePayments.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import employeePayments.entities.Department;
import employeePayments.entities.HourContract;
import employeePayments.entities.Worker;
import employeePayments.entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");

		
		System.out.print("Name:");
		String workerName = sc.nextLine();

		System.out.print("Level:");
		String workerLevel = sc.nextLine();

		System.out.print("Base salary:");
		double workerBaseSalary = sc.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary,
				new Department(departmentName));
		
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			
			System.out.println("Enter contract #"+ i + " data:");
			
			System.out.print("Date(DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());			
			System.out.print("Value per hour");
			double valuePerhour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerhour,hours);
			worker.addContract(contract);

			
		}

		
		sc.close();

	}

}
