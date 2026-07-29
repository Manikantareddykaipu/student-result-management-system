package com.studentmarks;

public class StudentResult {
	private String studentName;
	private int studentId;
	private String courseName;
	private double totalMarks;
	
	public  StudentResult(String studentName,int studentId,String courseName,double totalMarks)
	{
		this.studentName=studentName;
		this.studentId=studentId;
		this.courseName=courseName;
		this.totalMarks=totalMarks;
		System.out.println("Student Record Created Successfully");
		System.out.println(" ");
	}
	

	//getters
	 
	public String getStudentName()
	{
		return studentName;
	}
	
	public int getStudentId()
	{
		return studentId;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public double getTotalMarks()
	{
		return totalMarks;
	}
	
	//setters
	
	public void setStudentName(String studentName)
	{
		this.studentName=studentName;
	}
	
	public void setStudentId(int studentId)
	{
		this.studentId=studentId;
	}
	
	public void setCourseName(String courseName)
	{
		this.courseName=courseName;
	}
	
	public void setTotalMarks(double totalMarks)
	{
		this.totalMarks=totalMarks;
	}
	
	
	//add marks method
	
	 public void addMarks(double marks)
	 {
		 if(marks<=0)
		 {
		 System.out.println("Invalid marks entered");
		 }
		 else
		 {
			 totalMarks+=marks;
			 System.out.println("updated marks: "+totalMarks);
		 }
		 
	 }
	 
	 //grade calculation method
	 public void calculateGrade()
	 
	 {
		 if(totalMarks==0)
		 {
			 System.out.println("No marks available to calculate grade");
		 }
	     else if((totalMarks<=100) && (totalMarks >=90) )
		 {
			 System.out.println("GRADE A");
			 System.out.println(totalMarks);
		 }
		 
		 else  if((totalMarks<90) && (totalMarks >=80) )
		 {
			 System.out.println("GRADE B");
			 System.out.println(totalMarks);
		 }
		 
		 else if((totalMarks<80) && (totalMarks >=70) )
		 {
			 System.out.println("GRADE C");
			 System.out.println(totalMarks);
		 }
		 
		 else if((totalMarks<70) && (totalMarks >=60) )
		 {
			 System.out.println("GRADE D");
			 System.out.println(totalMarks);
		 }
		 
		 else  if((totalMarks<60) )
		 {
			 System.out.println("FAIL");
			 System.out.println(totalMarks);
		 }
		 
		 
	 }
	 
	 //total marks method 
	 public void studentDetails()
	 {
		 System.out.println("student name: "+studentName);
		 System.out.println("student id: "+studentId);
		 System.out.println("course name: "+courseName);
		 
		 System.out.println("total marks: "+totalMarks);
	 }
	 
	 
	 
	 

}
