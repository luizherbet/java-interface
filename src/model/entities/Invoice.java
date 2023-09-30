package model.entities;

public class Invoice {
	// 
	private double basicPayment;
	private double tax;
	//------------------------- Constructors
	public Invoice() {
	};
	
	public Invoice(double basicPayment, double tax) {
		super();
		this.basicPayment = basicPayment;
		this.tax = tax;
	}
	//------------------------- Get and Set
	public double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	};
	
	//------------------------ Total
	
	public double getTotalPayment() {
		return getBasicPayment() + getTax();
	}
	

}
