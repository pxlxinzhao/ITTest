package com.patrickpu.test.anonymousClass;

public class Car implements Comparable<Car>{
	public String model;
	private int year;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String model, int year) {
		super();
		this.model = model;
		this.setYear(year);
	}

	public void start() {
		System.out.println("Starting slowly");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + getYear();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (getYear() != other.getYear())
			return false;
		return true;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + "]";
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return this.year - o.year;
	}
	
	
}
