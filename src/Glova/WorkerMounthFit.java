package Glova;

public class WorkerMounthFit implements Salary{

	private String name;
	private double paymentPerMounth;
		
	public WorkerMounthFit(String name, double paymentPerMounth) {
		super();
		this.name = name;
		this.paymentPerMounth = paymentPerMounth;
	}

	@Override
	public void employeeSalaries() {
			String name = getName() + " getPaymentPerMounth ";
			setName(name);
			double many = getPaymentPerMounth() * 40;
			setPaymentPerMounth(many);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPaymentPerMounth() {
		return paymentPerMounth;
	}

	public void setPaymentPerMounth(double paymentPerMounth) {
		this.paymentPerMounth = paymentPerMounth;
	}

	@Override
	public String toString() {
		return "WorkerMounthFif [name=" + name + ", paymentPerMounth=" + paymentPerMounth + "]";
	}
	
}
