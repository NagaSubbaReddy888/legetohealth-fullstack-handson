package beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTestMain {
	
		public static void main(String[] args) {

			Student s1 = new Student(111, "Raju", "Bangalore");
			Student s2 = new Student(222, "Ravi", "Chennai");
			Student s3 = new Student(333, "Ramu", "Mumbai");

			List<Student> lst = new ArrayList<Student>();
			lst.add(s1);
			lst.add(s2);
			lst.add(s3);

			Collections.sort(lst, (u1, u2) -> u1.getName().compareTo(u2.getName()));
			print(lst);
			
			Collections.sort(lst, (u1, u2) -> u2.getId() - u1.getId());
			print(lst);

		}

		public static void print(List<Student> lst) {
			for (Student stu : lst) {
				System.out.println("std -> " + stu);
			}
		}

}
