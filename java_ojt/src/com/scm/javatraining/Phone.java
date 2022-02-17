package com.scm.javatraining;

	public class Phone{
		static String brandname;
		String color;
		float price;
		static int ram;
		static int storage;
		
		//constructor for Phone
		public Phone(){
			brandname="Vivo";
			color="black";
			price=235780;
			ram=4;
			storage=64;
		}
		//parameter constructor for Phone
		public Phone(String name,float pr) {
			brandname=name;
			price=pr;
		}
		public static void print() {
			System.out.println("My phone brand name is " + brandname);
		}
		
		//testing for method
		public void printMethod() {
			System.out.println("Phone: " + brandname + "\nColor: " + color + "\nPrice: " + price + " mmk\nRam: "+ ram + "GB \nStorage: "+ storage + "GB \n");
		}
		
		public void printMethodP(String name,String col,double pri,int r,int storg) {
			System.out.println("Phone: " + name + "\nColor: " + col + "\nPrice: " + pri + " mmk\nRam: "+ r + "GB \nStorage: "+ storg + "GB \n");
		}
		
		public static void main(String[] args) {
			
			Phone ph1=new Phone(); 
			System.out.println("Phone: " + brandname + "\nColor: " + ph1.color + "\nPrice: " +
			ph1.price + " mmk\nRam: "+ram + "GB \nStorage: "+ storage + "GB");
			
			Phone ph2=new Phone("Samsung",390599f);
			System.out.println("\nPhone: " + brandname + "\nPrice: " + ph2.price + " mmk \n");
			
			Phone ph3 =new Phone();
			ph3.printMethodP("Apple","PinkGold",1150085,16,256);
			
			Phone ph4= new Phone();
			ph4.printMethod();
			
			Phone ph5=new Phone();
			ph5.printMethodP("Hawei", "SkyBlue", 385500, 6, 128);
			
			print();
		}
	}
