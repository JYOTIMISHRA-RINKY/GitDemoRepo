package com.ait.demo;

public class GitApp {

 
private Map<String,Object> cache=new HashMap<String,Object>();
private static final String name="abc";
 
	
	public void addData(String data) {
		System.out.println("Data:"+data);
		if(data.equals("Java Techie")) {
			System.out.println("Welcome");
		}
	}
	
	public String getMsg() {
		return "Heloo World and Good Morning";
	}

	public static void main(String[] args) {
		 System.out.println("Heloo World!");
		 GitApp a=new GitApp();
		 a.addData("Good Morning");
		 System.out.println( a.getMsg());
		 

		
	}

}
