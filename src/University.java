import java.util.Scanner;

import com.javadiaries.department.Department;

public  class University {
	private static String universityName;
	private int establishmentYear;
	public Department department;
	
	public University()
	{
		System.out.println("New University is constructed");
	}
	
	public University(String universityName,int establishmentYear){
		this.universityName = universityName;
		this.establishmentYear = establishmentYear;
		
		
	
		System.out.println("");
	}
	public void setUniverstyName(String universityName){
		this.universityName = universityName;
	}
	public String getUniverstyName(){
		return universityName;
	}
	public void setEstablishmentYear(int establishmentYear){
		this.establishmentYear = establishmentYear;
	}
	public int getEstablishmentYear(){
		return establishmentYear;
	}
	
	
	public void printUniversityInfo(){
		System.out.println("UNIVERSTY : "+universityName+"\n"+"ESTABLISHMENT  : "+establishmentYear );	
		System.out.println("Departments of "+universityName+" :");
	}
	
	public void addDepartment(Department department){
		
		
		department.getDepartmentName();
	
	}
	
}
