import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

import com.javadiaries.department.AeronuaticalEngineering;
import com.javadiaries.department.AircraftEngineering;
import com.javadiaries.department.Department;
import com.javadiaries.department.ElectricElectronicEngineering;
import com.javadiaries.department.FlightTraining;
import com.javadiaries.department.MechanicalEngineering;
import com.javadiaries.department.MechatronicsEngineering;
import com.javadiaries.human.Personal;
import com.javadiaries.human.Student;
import com.javadiaries.lecture.Lecture;

public class YokRootTest {

	public static void main(String[] args) {
		//Departments
		Department electricelectronic = new ElectricElectronicEngineering();
		Department mechatronics = new MechatronicsEngineering();
		Department aeronautical = new AeronuaticalEngineering();
		Department aircraft = new AircraftEngineering();
		Department flight = new FlightTraining();
		Department mechanical = new MechanicalEngineering();
		
		
		// Universities
		System.out.println("Universty List");
		University uni1 = new University("ALABAMA",1993);
		uni1.printUniversityInfo();
		uni1.addDepartment(electricelectronic);
		
		University uni2 = new University("West Wirginia",2000);
		uni2.printUniversityInfo();
		uni2.addDepartment(mechatronics);
		uni2.addDepartment(electricelectronic);
		uni2.addDepartment(mechanical);
		uni2.addDepartment(flight);
		
		// Lectures
		
		Lecture lecture1 = new Lecture("EEE 206", "Kevin KEVLAR", 130);
		lecture1.printLectureformation();
		Lecture lecture2 = new Lecture ("CENG 111","Bryan O'CONNER",75);
		lecture2.printLectureformation();
		
		//Student and Personal
		
		
		 Student stu = new  Student("John","DOE","Male",33,2013,"EEE",130141000);
		 stu.callString();
		 stu.studentInfoPrint();
		
		 Personal per = new  Personal("Jane","DOE","Female",28,2012,"G.I.J.O.E");
		 per.callString();
		 per.PersonalInfoPrint();	
		 
		 
		 
		
		 
	}
	
	
	
}
