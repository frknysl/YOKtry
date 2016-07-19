import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import building.Department;
import building.Universties;
import human.PersonalList;
import human.StudentList;
public class YokRootTest {

	public static void main(String[] args) {
		// Universities
		System.out.println("Universty List");
		Universties uni =new Universties("ALABAMA",1993) ;
		Department dep=new Department("ALABAMA UNIVERSTY",2001, "EEE Eng");
		
		uni.printUniInfo();
		System.out.println(uni.getBuildingAdress());
		System.out.println(dep.getBuildingAdress());
		
		
		StudentList stu= new StudentList("John","DOE","Male",33,2013,"EEE",130141000);
		stu.callString();
		stu.stuInfoPrint();
		
		
		
		PersonalList per=new PersonalList("Jane","DOE","Female",28,2012,"G.I.J.O.E");
		per.callString();
		per.PersonalInfoPrint();
		
				
		
	}
	
	
	
}
