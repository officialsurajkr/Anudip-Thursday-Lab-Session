package lab_18_8_22;

public class Student 
{
	private int studentId;
	private String studentName;
	private String studentMailId;
	private long studentPhno;
	
	public Student(int studentId, String studentName, String studentMailId, long studentPhno) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMailId = studentMailId;
		this.studentPhno = studentPhno;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentMailId() {
		return studentMailId;
	}

	public void setStudentMailId(String studentMailId) {
		this.studentMailId = studentMailId;
	}

	public long getStudentPhno() {
		return studentPhno;
	}

	public void setStudentPhno(long studentPhno) {
		this.studentPhno = studentPhno;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMailId=" + studentMailId
				+ ", studentPhno=" + studentPhno + "]";
	}
	
	
	
	

}
