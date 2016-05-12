package q4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

//Class invariant is that the Student object is not null and has fields 
//name and whenEnrolled
public final class Student {

	private final String name;
	private final Date whenEnrolled;

	/**
	 * @precondition is there be a new Student object that is not null
	 * @postcondition is that there is a Student object that is initialized with
	 * name and imaginary fields.
	 * @param name
	 * is the name of student
	 * @param whenEnrolled
	 * is when the student enrolled.
	 */
	public Student(String name, Date whenEnrolled) {
		this.name = name;
		this.whenEnrolled = whenEnrolled;
	}

	/**
	 * @precondition is there be a Student object that is not null and
	 * initialized
	 * @postcondition is returns a date of when student enrolled.
	 * @return a date
	 */
	public Date getenrolledDate() {
		return (Date) whenEnrolled.clone();
	}

	/**
	 * @precondition is there be a Student object that is not null and
	 * initialized
	 * @postcondition is returns a name of student.
	 * @return a name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @precondition is there be a Student object that is not null and
	 * initialized
	 * @postcondition is returns a name of student and checks if the name is
	 * same or different.
	 * @return a name of student and a new object
	 */
	public static Comparator<Student> getCompByName() {
		return new Comparator<Student>() {
			public int compare(Student student1, Student student2) {
				return student1.getName().compareTo(student2.getName());
			}
		};
	}

	/**
	 * @precondition is there be a Student object that is not null and
	 * initialized
	 * @postcondition is returns a data of when student enrolled and compares
	 * that date with another student.
	 * @return a date of enrolled of student and a new object
	 */
	public static Comparator<Student> getCompByDate() {
		return new Comparator<Student>() {
			public int compare(Student student1, Student student2) {
				return student1.getenrolledDate().compareTo(
						student2.getenrolledDate());
			}
		};
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		// create student ArrayList
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Moss, Pp", new Date(103, 1, 15)));
		students.add(new Student("hello, you", new Date(105, 1, 15)));
		students.add(new Student("wassup, dude", new Date(107, 1, 18)));
		students.add(new Student("one, dance", new Date(110, 1, 20)));

		// sort student names
		students.sort(getCompByName());
		for (Student stud : students) {
			System.out.println(stud.name);
		}

		// sort student date enrolled
		students.sort(getCompByDate());
		for (Student stud : students) {
			System.out.println(stud.whenEnrolled);
		}
	}
}
