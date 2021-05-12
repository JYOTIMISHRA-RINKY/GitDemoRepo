package com.ait.demo;

public class GitApp {
	
	public void addData(String data) {
		System.out.println("Data:"+data);
		if(data.equals("Java Techie")) {
			System.out.println("Welcome");
		}
	}
	
	public String getMsg() {
		return "Heloo World";
	}

	public static void main(String[] args) {
		 System.out.println("Heloo World!");
		 GitApp a=new GitApp();
		 a.addData("Good Morning");
		 System.out.println( a.getMsg());

		
	}

}
