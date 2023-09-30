package model.entities;

public class Vehicle {
	//This class informs the model of the vehicle
	
	private String model;
	//-------------------Constructors----------------------
	public Vehicle() {
	};
	
	public Vehicle(String model) {
		this.model = model;
	}
	//------------------Get and Set-----------------------
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	};
	
}
