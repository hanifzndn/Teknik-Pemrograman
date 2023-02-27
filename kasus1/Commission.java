package kasus1;

public class Commission extends Hourly {
	
	private double comRate;
	private double totalSales;
	

	
	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comRate) 
	{
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.comRate = comRate;
	}
	
	public void addSales(double totalSales) 
	{
		this.totalSales += totalSales;
	}
	
	public double pay() 
	{
		double payment = super.pay() + (totalSales*comRate);
		return payment;
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + "\nTotal Sales :" + totalSales;
	}

	public void setComRate(double comRate) {
		this.comRate = comRate;
	}
	
	
	
}