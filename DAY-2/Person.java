package Activity2;

public class Person {
	
	     	private String name;
			
			private String gender;

			
			public Person() {}
			
			public Person(String name, String gender) {
				super();
				this.name = name;
				this.gender = gender;
			}

			public String getPerson() {
				return name;
			}

			public void setPerson(String person) {
				this.name = person;
			}

			public String getGender() {
				return gender;
			}

			public void setGender(String gender) {
				this.gender = gender;
			}
			public void display() {
				System.out.println("Person name :"+name+" gender"+gender);
			}
		}
		
