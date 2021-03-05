package model;

public class student {

	int id;
	String name;
	String dob;
	String doj;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public student() {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", dob=" + dob + ", doj=" + doj + "]";
	}
	
}
