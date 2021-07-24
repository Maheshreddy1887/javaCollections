package com.xworkz.mahesh.Collection.DTO;

public class RiversDTO {

	public static void main(String[] args) {
		

	}


	private String name;
	private String origin;
	private double length;
	private int noOfStatesInFlow;
	private boolean hydroPlant;

	public RiversDTO() {
		System.out.println("created river dto");
	}

	public RiversDTO(String name, String origin, double length, int noOfStatesInFlow, boolean hydroPlant) {
		super();
		this.name = name;
		this.origin = origin;
		this.length = length;
		this.noOfStatesInFlow = noOfStatesInFlow;
		this.hydroPlant = hydroPlant;
	}

	@Override
	public String toString() {
		return "RiverDTO [name=" + name + ", origin=" + origin + ", length=" + length + ", noOfStatesInFlow="
				+ noOfStatesInFlow + ", hydroPlant=" + hydroPlant + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals method");
		if (obj == null)
			return false;
		if (obj instanceof RiversDTO) {
			RiversDTO cast = (RiversDTO) obj;
			if (this.name.equals(cast.name)) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public int getNoOfStatesInFlow() {
		return noOfStatesInFlow;
	}

	public void setNoOfStatesInFlow(int noOfStatesInFlow) {
		this.noOfStatesInFlow = noOfStatesInFlow;
	}

	public boolean isHydroPlant() {
		return hydroPlant;
	}

	public void setHydroPlant(boolean hydroPlant) {
		this.hydroPlant = hydroPlant;
	}

}