package model;

public class Employee {
public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
private int empId;
private String empName;
private long mobileNumber;
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", mobileNumber=" + mobileNumber + "]";
}
public void init(){
	System.out.println("this is initialing method");
}
public void destroy(){
	System.out.println("this is destory method");
}
}
