package human;
public class PersonalList extends HumanSource  {
	 private int startingyear;
	 private String unit;
	  
	 public PersonalList(String name_, String sname_,  String gender_,int age_,int startingyear,String unit)
		{
		 	
			super(name_,sname_,gender_,age_);
			this.startingyear=startingyear;
			this.unit=unit;
			System.out.println("New personel "+name_+" "+sname_+" added");
			System.out.println("");
		}
	 
	
	 
	 
	
	
	
	 
	public void setStartingyear(int startingyear){
		this.startingyear=startingyear;
	}
	public int getStartingyear(){
		return startingyear;
	}
	public void setUirim(String unit)
	{
		this.unit=unit;
	}
	public String getUnit()
	{
		return unit;
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
	public void callString() {
		// TODO Auto-generated method stub
		super.callString();
	}
	public void PersonalInfoPrint()
	{
		System.out.println("Starting Year : " +startingyear+"\n"+"Unit          : "+unit);
		System.out.println("");
	}
	
	
	
	
}