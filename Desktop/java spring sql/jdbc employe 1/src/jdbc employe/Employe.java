package springjdbctrmplate;

public class Employe {

	private Integer employeeid;
	private String employeename;
	private String employeesalary;
	public Integer getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(String employeesalary) {
		this.employeesalary = employeesalary;
	}
	@Override
	public String toString() {
		return "Student [employeeid=" + employeeid + ", employeename=" + employeename + ", employeesalary="
				+ employeesalary + "]";
	}
	public Student(Integer employeeid, String employeename, String employeesalary) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeesalary = employeesalary;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
	
	
	
	
	