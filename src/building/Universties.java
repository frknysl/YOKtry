package building;



public  class Universties implements Building {
	private String uniName;
	private int estYear;
	protected String uniAddress;
	public Universties(String uniName,int estYear)
	{
		
		this.uniName=uniName;
		this.estYear=estYear;
	
		System.out.println("");
	}
	public void setUniName(String uniName)
	{
		this.uniName=uniName;
	}
	public String getUniName(){
		return uniName;
	}
	public void setEstYear(int estYear)
	{
		this.estYear=estYear;
	}
	public int getEstYear()
	{
		return estYear;
	}
	
	public void printUniInfo(){
		System.out.println("UNIVERSTY : "+uniName+"\n"+"ESTABLISHMENT  : "+estYear);
		System.out.println("");
	}
	
	@Override
	public String getBuildingAdress() {
		// TODO Auto-generated method stub
		return "Universty Adress : "+ "Wall Street Freedom Blvd, Washington,DC"+"\n";
	}
	

}
