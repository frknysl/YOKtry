package com.javadiaries.human;

abstract class Human {
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	
	Human(String Name, String lastName,  String gender,int age){
		firstName=Name;
	    lastName=lastName;
	    age=age;
	    gender=gender;	
	    }
	
		void setFirstName(String s){
			firstName=s;
		}	
	    String getFirstName(){
	    	return firstName;
	    }
	    	
	    abstract void setLastName(String s);
	    abstract String getLastName();	
	    	
	    
	   	String getGender(){
	   		return gender;
	   	}	
	    abstract void setGender(String g);
	    	
	    int getAge(){
	   		return age;
	   	}
	   	 void setAge(int a){
	   		age=a;
	   	}
	    abstract void updateName();
	    abstract void updateName(String s);
	    	
	    public void callString(){
	    	
	    		System.out.println("NAME          : " + firstName);
	    		System.out.println("SURNAME       : " + lastName);
	   		    System.out.println("AGE           : " + age);
	    		System.out.println("GENDER        : " + gender);
	    		
	   	 }
}

