package springjdbctrmplate;

public class Employe {

	private Integer employeeid;
	private String employeename;
	private Integer employeesalary;
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
	public Integer getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(Integer employeesalary) {
		this.employeesalary = employeesalary;
	}
	@Override
	public String toString() {
		return "Employe [employeeid=" + employeeid + ", employeename=" + employeename + ", employeesalary="
				+ employeesalary + "]";
	}
	public Employe(Integer employeeid, String employeename, Integer employeesalary) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeesalary = employeesalary;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
}
	
	
	
	
	