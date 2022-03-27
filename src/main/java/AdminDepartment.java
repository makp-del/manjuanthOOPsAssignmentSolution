public class AdminDepartment extends SuperDepartment{
	public String departmentName() {
		return this.departmentName;
	}

	public String getTodaysWork() {
		return this.todaysWork;
	}

	public String getWorkDeadline() {
		return this.workDeadline;
	}

	public void printDetails(){
		System.out.println("Welcome to " + this.departmentName);
		System.out.println(this.todaysWork);
		System.out.println(this.workDeadline);
		System.out.println(super.isTodayAHoliday());
	}

	private String departmentName = "Admin Department";
	private String todaysWork = "Complete your documents Submission";
	private String workDeadline = "Complete by EOD";
}