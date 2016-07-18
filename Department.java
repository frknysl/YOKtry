package building;

public class Department extends Universties  {
	public String departmentName;
	
	public Department(String uniName, int estYear,String departmentName) {
		super(uniName, estYear);
		this.departmentName=departmentName;
	}

	@Override
	public void printUniInfo() {
		// TODO Auto-generated method stub
		super.printUniInfo();
	}
	public void printDepInfo(){
		
	}
	@Override
	public String getBuildingAdress() {
		// TODO Auto-generated method stub
		return "Faculty Building : Wall Street No:18 Engineering Faculty Building"+"\n";
	}
	
	
	
	}
	
	

	
	

	
	

	

