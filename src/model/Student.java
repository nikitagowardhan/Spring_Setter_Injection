package model;

public class Student {
	
	private int id;
	private int roll;
	private String name;
	private String address;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("set id");
		this.id = id;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		System.out.println("set roll");

		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("set name");

		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		System.out.println("set address");

		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

}
