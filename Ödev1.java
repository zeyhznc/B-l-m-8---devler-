package org.javaturk.oopj.ch08.university;

import java.util.Date;

public class Ödev1 {
	public static void main(String[] args) {
		class Student {
			String no;
			String name;
			String dob;
			Department department;
			Professor advisor;
			Course[] coursesTaken;
			public String getNo() {
				return no;
			}
			public void setNo(String no) {
				this.no = no;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getDob() {
				return dob;
			}
			public void setDob(String dob) {
				this.dob = dob;
			}
			public Department getDepartment() {
				return department;
			}
			public void setDepartment(Department department) {
				this.department = department;
			}
			public Professor getAdvisor() {
				return advisor;
			}
			public void setAdvisor(Professor advisor) {
				this.advisor = advisor;
			}
			public Course[] getCoursesTaken() {
				return coursesTaken;
			}
			public void setCoursesTaken(Course[] coursesTaken) {
				this.coursesTaken = coursesTaken;
			}
		}
		
		 class Professor {
			String no;
		    String name;
		    String dob;
		    String rank;
		    Department department;
		    Student[] advisee;
		    Course[] coursesGiven;
			public String getNo() {
				return no;
			}
			public void setNo(String no) {
				this.no = no;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getDob() {
				return dob;
			}
			public void setDob(String dob) {
				this.dob = dob;
			}
			public String getRank() {
				return rank;
			}
			public void setRank(String rank) {
				this.rank = rank;
			}
			public Department getDepartment() {
				return department;
			}
			public void setDepartment(Department department) {
				this.department = department;
			}
			public Student[] getAdvisee() {
				return advisee;
			}
			public void setAdvisee(Student[] advisee) {
				this.advisee = advisee;
			}
			public Course[] getCoursesGiven() {
				return coursesGiven;
			}
			public void setCoursesGiven(Course[] coursesGiven) {
				this.coursesGiven = coursesGiven;
			}
		}
		
		 class Department {
		    private String name;
		    Professor head;
		    Course[] courses;
		    Student[] students;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
		}
		
		 class Classroom{
				int no;
				String name;
				int capacity;
				Object belongsTo;
			
				
				public Object getBelongsTo() {
					return belongsTo;
				}
				public void setBelongsTo(Course belongsTo) {
					this.belongsTo = belongsTo;
				}
				public int getNo() {
					return no;
				}
				public void setNo(int no) {
					this.no = no;
				}
				
				public String getName() {
					return name;
				}
				public String setName(String name) {
					return this.name = name;
				}
				
				public int getCapacity() {
					return capacity;
				}
				public void setCapacity(int capacity) {
					this.capacity = capacity;
				}	
			}
		 
		 class Course {
			String code;
		    String name;
		    Department department;
		    Professor teacher;
		    Student[] students;
		    String[] days;
		    Date time;
		    Classroom givenIn;

			public String getCode() {
				return code;
			}
			public void setCode(String code) {
				this.code = code;
			}
			public String getName() {
				return name;
			}
			public String setName(String name) {
				return this.name = name;
			}
			public Department getDepartment() {
				return department;
			}
			public void setDepartment(Department department) {
				this.department = department;
			}
			public Professor getTeacher() {
				return teacher;
			}
			public void setTeacher(Professor teacher) {
				this.teacher = teacher;
			}
			public Student[] getStudents() {
				return students;
			}
			public void setStudents(Student[] students) {
				this.students = students;
			}
			public String[] getDays() {
				return days;
			}
			public void setDays(String[] days) {
				this.days = days;
			}
			public Date getTime() {
				return time;
			}
			public void setTime(Date time) {
				this.time = time;
			}
			
		}
   		    Course course1 = new Course();//course1 name :Int.to Software Engineering
   		    course1.name = course1.setName("Int.to Software Engineering");
   		    
   		    
		    Course course2 = new Course(); // course2 name : Ethics
		    course2.name = course2.setName("Ethics");
		    
		    Course course3 = new Course(); // course3 name : Onthology
		    course3.name = course3.setName("Onthology");
		 
		  
		    Classroom class1 = new Classroom();
		    class1.name = class1.setName("CS 101");
		    
		    Classroom class2 = new Classroom();
		    class2.name = class2.setName("PHIL 101");
		    
		    Classroom class3 = new Classroom();
		    class3.name = class3.setName("PHIL 102");


		    course1.givenIn = class1;
		    class1.belongsTo = course1;
		 
		    course2.givenIn = class2;
		    class2.belongsTo = course2;
		    
		    course3.givenIn = class3;
		    class3.belongsTo = course3;
		    
		    
		    System.out.println(course1.name + " " + "is given in" + " " +class1.name);
		    System.out.println(course2.name + " " + "is given in" + " " +class2.name);
		    System.out.println(course3.name + " " + "is given in" + " " +class3.name);
		
	}

	

 }

