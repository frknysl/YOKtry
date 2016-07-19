package human;

abstract class HumanSource {
	private String name;
	private String sname;
	private String gender;
	private int age;
	
	HumanSource(String name_, String sname_,  String gender_,int age_)
	    {
		name=name_;
	    sname=sname_;
	    age=age_;
	    gender=gender_;	
	    }
	
		void set_name(String s)
		{
			name=s;
		}	
	    String get_name()
	    {
	    	return name;
	    }
	    	
	    	abstract void set_sname(String s);
	    	abstract String get_sname();	
	    	
	    
	   	 String get_gender()
	   	{
	   		return gender;
	   	}	
	    abstract void set_gender(String g);
	    	
	    int get_age()
	   	{
	   		return age;
	   	}
	   	 void set_age(int a)
	   	{
	   		age=a;
	   	}
	    abstract void update_name();
	    abstract void update_name(String s);
	    	
	    public void callString()
	     {
	    		System.out.println("NAME          : " + name);
	    		System.out.println("SURNAME       : " + sname);
	   		    System.out.println("AGE           : " + age);
	    		System.out.println("GENDER        : " + gender);
	    		
	   	 }
}

