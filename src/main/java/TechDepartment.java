public class TechDepartment extends SuperDepartment{
	public String departmentName() {
		return departmentName;
	}

	public String getTodaysWork() {
		return todaysWork;
	}

	public String getWorkDeadline() {
		return workDeadline;
	}

	public String getTechtStackInformation(){
		return techtStackInformation;
	}

	public void printDetails(){
		System.out.println("Welcome to " + this.departmentName);
		System.out.println(this.todaysWork);
		System.out.println(this.workDeadline);
		System.out.println(this.techtStackInformation);
		System.out.println(super.isTodayAHoliday());
	}

	private String departmentName = "Tech Department";
	private String todaysWork = "Complete coding of module 1";
	private String workDeadline = "Complete by EOD";
	private String techtStackInformation = "core Java";
}