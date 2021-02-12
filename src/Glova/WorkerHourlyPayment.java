package Glova;

public class WorkerHourlyPayment implements Salary{

	private String name;
	private int paymentPerHour;
	private int howManyHours;
	
	public WorkerHourlyPayment(String name, int paymentPerHour, int howManyHours) {
		super();
		this.name = name;
		this.paymentPerHour = paymentPerHour;
		this.howManyHours = howManyHours;
	}

	@Override
	public void employeeSalaries() {
		String name = getName() + " PaymentPerHour ";
		setName(name);
		int many = getPaymentPerHour() * getHowManyHours();
		setPaymentPerHour(many);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPaymentPerHour() {
		return paymentPerHour;
	}

	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}

	public int getHowManyHours() {
		return howManyHours;
	}

	@Override
	public String toString() {
		return "WorkerHourlyPayment [name=" + name + ", paymentPerHour=" + paymentPerHour + ", howManyHours="
				+ howManyHours + "]";
	}

}
