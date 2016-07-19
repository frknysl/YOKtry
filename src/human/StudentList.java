package human;
public class StudentList extends HumanSource {
	private int enrollyear;
	private String department;
	private int stuno;
	public StudentList(String name_, String sname_,  String gender_,int age_,int enrollyear,String department,int stuno)
	{
		super(name_,sname_,gender_,age_);
		this.enrollyear=enrollyear;
		this.department=department;
		this.stuno=stuno;
		System.out.println("New Student "+name_+" "+sname_+" added");
		System.out.println("");
	}
	
	
	
	//HumanSource bilgileri
	
	public void setEnrollyear(int enrollyear)
	{
		this.enrollyear=enrollyear;
	}
	public int getEnrollyear()
	{
		return enrollyear;
	}
	public void setDepartment(String department)
	{
		this.department=department;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setStuNo(int stuno)
	{
		this.stuno=stuno;
	}
	public int getStuNo()
	{
		return stuno;
	}
	@Override
	void set_sname(String s) {
		// TODO Auto-generated method stub
		
	}
	@Override
	String get_sname() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	void set_gender(String g) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void update_name() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void update_name(String s) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void callString()
	{
		// TODO Auto-generated method stub
		super.callString();
	}
	public void stuInfoPrint()
	{
		System.out.println("Enrolling Year: "+enrollyear+"\n"+"Department    : "+department+"\n"+"Student Number: "+stuno);
		System.out.println("");
	
	}
}