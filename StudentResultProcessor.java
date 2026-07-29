package com.studentmarks;
import java.util.Scanner;

public class StudentResultProcessor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter student name: ");
		String studentName=sc.nextLine();
		
		System.out.print("enter student id: ");
		int studentId=sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("enter course name: ");
		String courseName=sc.nextLine();
		
		
		
		System.out.print("enter first subject marks: ");
		double totalMarks=sc.nextDouble();
		System.out.println(" ");
		
		StudentResult studentResult=new StudentResult(studentName,studentId,courseName,totalMarks);
		
		int choice;
		
		do
		{
			System.out.println("**** Select an Option from Below ****\r\n"
					+ "\r\n"
					+ "1. Add More Subject Marks\r\n"
					+ "2. Calculate Grade\r\n"
					+ "3. View Student Details\r\n"
					+ "4. Update Student Name\r\n"
					+ "5. Update Course Name\r\n"
					+ "6. Exit");
			
			System.out.print("enter your choice: ");
			choice=sc.nextInt();
			System.out.println(" ");
			
			if(choice==1)
			{
				System.out.print("enter the marks: ");
				double marks=sc.nextDouble();
				studentResult.addMarks(marks);
				System.out.println(" ");
			}
			else if(choice==2)
			{
				studentResult.calculateGrade();
				System.out.println(" ");
			}
			else if(choice==3)
			{
				studentResult.studentDetails();
				System.out.println(" ");
			}
			
			else if(choice == 4)
			{
			    sc.nextLine();   // consume leftover newline

			    System.out.print("enter new Student Name: ");
			    String name = sc.nextLine();

			    studentResult.setStudentName(name);
			    System.out.print("updated Student Name: "+studentName);
			    System.out.println(" ");
			}
			
			else if(choice==5)
			{
				
				System.out.println("enter new course name ");
				String  cname=sc.nextLine();
				studentResult.setCourseName(cname);
				System.out.print("updated course Name: "+courseName);
				System.out.println(" ");
			}
			
			else if(choice==6)
			{
				System.out.println("Thank You! Result Processing Completed.");
			}
			
			
			else
			{
				System.out.println("Invalid choice");
				System.out.println(" ");
			}
			
		}while(choice!=6);
		
		sc.close();
	}
	

}
