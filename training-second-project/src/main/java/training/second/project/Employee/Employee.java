package training.second.project.Employee;

public class Employee {

	long id;
	String name;
	long enrollment_No;
	String subject;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getEnrollment_No() {
		return enrollment_No;
	}

	public void setEnrollment_No(long enrollment_No) {
		this.enrollment_No = enrollment_No;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Employee(long id, String name, long enrollment_No, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.enrollment_No = enrollment_No;
		this.subject = subject;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", enrollment_No=" + enrollment_No + ", subject=" + subject
				+ "]";
	}

}
