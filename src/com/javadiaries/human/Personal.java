package com.javadiaries.human;
public class Personal extends Human  {
	 private int startingyear;
	 private String unit;
	  
	 public Personal(String name, String lastName,  String gender,int age,int startingyYear,String unit)
		{
		 	
			super(name,lastName,gender,age);
			this.startingyear=startingyYear;
			this.unit=unit;
			System.out.println("New personel "+name+" "+lastName+" added");
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