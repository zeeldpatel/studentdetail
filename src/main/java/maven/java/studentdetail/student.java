package maven.java.studentdetail;

public class student {
	
	// TODO Auto-generated method stub
			int rollno;
			String lastname ,firstname,dateofbirth;
			
			public student() {
				rollno=1;
				firstname="Zeel";
				lastname="Patel";
				dateofbirth="15-01-1997";
			}
			
			public student(int rollno,String firstname,String lastname) {
				
				this.rollno=rollno;
				this.firstname=firstname;
				this.lastname=lastname;
				this.dateofbirth=dateofbirth;
			}

			public int getRollno() {
				return rollno;
			}

			public void setRollno(int rollno) {
				this.rollno = rollno;
			}

			public String getLastname() {
				return lastname;
			}

			public void setLastname(String lastname) {
				this.lastname = lastname;
			}

			public String getFirstname() {
				return firstname;
			}

			public void setFirstname(String firstname) {
				this.firstname = firstname;
			}

			public String getDateofbirth() {
				return dateofbirth;
			}

			public void setDateofbirth(String dateofbirth) {
				this.dateofbirth = dateofbirth;
			}
			public void printStudentDetails() {
		        System.out.println("Roll Number: " + rollno);
		        System.out.println("FirstName: " + firstname);
		        System.out.println("LastName: "  + lastname);
		        System.out.println("Date of Birth: " + dateofbirth);
		    }
			
		

}
