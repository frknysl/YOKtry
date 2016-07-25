package com.javadiaries.human;
public class Student extends Human {
	private int enrollyear;
	private String department;
	private int studentNo;
	public Student(String name, String lastName,  String gender,int age,int enrollyear,String department,int studentNo){
		super(name,lastName,gender,age);
		this.enrollyear = enrollyear;
		this.department = department;
		this.studentNo = studentNo;
		System.out.println("New Student "+name+" "+lastName+" added");
		System.out.println("");
	}
	
	
	
	//HumanSource bilgileri
	
	public void setEnrollyear(int enrollyear){
		this.enrollyear = enrollyear;
	}
	public int getEnrollyear(){
		return enrollyear;
	}
	public void setDepartment(String department){
		this.department = department;
	}
	public String getDepartment(){
		return department;
	}
	public void setStudentNo(int studentNo){
		this.studentNo = studentNo;
	}
	public int getStudentNo(){
		return studentNo;
	}
	@Override
	void setLastName(String s) {
		// TODO Auto-generated method stub
		
	}
	@Override
	String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	void setGender(String g) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void updateName() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void updateName(String s) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void callString(){
		// TODO Auto-generated method stub
		super.callString();
	}
	public void studentInfoPrint(){
		System.out.println("Enrolling Year: "+enrollyear+"\n"+"Department    : "+department+"\n"+"Student Number: "+studentNo);
		System.out.println("");
	
	}
}