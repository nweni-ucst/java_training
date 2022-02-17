package com.scm.javatraining;

public class TestingControlStatement {

	public static void main(String[] args) {
		//testing for Calendar
		int month;
		int day = 0;
		String[] montharray= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int i=1;
		while(i<=montharray.length) {
			month=i;
			System.out.println(montharray[i-1]);
			//testing Switch Case Statement
			switch(month) {
				case 2: 
					day=28;
					break;
				case 4: 
					day=30;
					break;
				case 6:
					day=30;
					break;
				case 9:
					day=30;
					break;
				case 11:
					day=30;
					break;
				default:
					day=31;
			} 
				//to output numbers of days in a month
				int count=0;
				for(int j=1;j<=day;j++)
				{
					System.out.print(j + " ");
					count++;
					if(count==7) {
						System.out.print("\n");
						count=0;
					}
				}
				System.out.print("\n \n");	
			i++;
		}		
		//to calculate grade according to mark
		int mark=70;
		char grade;
		if(mark>=80) {
			grade='A';
			System.out.println("Mark : "+ mark + " , Grade is : " + grade);
		}else if(mark>=65) {
			grade='B';
			System.out.println("Mark : "+ mark + " , Grade is : " + grade);
		}else if(mark>=50) {
			grade='C';
			System.out.println("Mark : "+ mark + " , Grade is : " + grade);
		}else {
			grade='D';
			System.out.println("Mark : "+ mark + " , Grade is : " + grade);
		}
		System.out.println();
		
		//testing for for each loop
		String[] letter= {"A","B","C","D","E","F"};
		for(String str: letter) {
			System.out.print(str + " ");
		}
	}
}
