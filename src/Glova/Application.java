package Glova;

public class Application {

	public static void main(String[] args) {

		WorkerMounthFit wmf = new WorkerMounthFit("Vasya", 15.5);
		System.out.println(wmf);
		wmf.employeeSalaries();
		System.out.println(wmf);
		System.out.println("--------------------------");
		WorkerHourlyPayment whp = new WorkerHourlyPayment("Vova", 18, 12);
		System.out.println(whp);
		whp.employeeSalaries();
		System.out.println(whp);
		
	}

}
