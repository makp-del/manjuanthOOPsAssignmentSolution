public class HrDepartment extends SuperDepartment{
	public String departmentName() {
		return departmentName;
	}

	public String getTodaysWork() {
		return todaysWork;
	}

	public String getWorkDeadline() {
		return workDeadline;
	}

	public String isTodayAHoliday(){
		return doActivity;
	}

	public void printDetails(){
		System.out.println("Welcome to " + this.departmentName);
		System.out.println(this.doActivity);
		System.out.println(this.todaysWork);
		System.out.println(this.workDeadline);
		System.out.println(super.isTodayAHoliday());
	}

	private String departmentName = "Hr Department";
	private String todaysWork = "Fill today’s worksheet and mark your attendance";
	private String workDeadline = "Complete by EOD";
	private String doActivity = "team Lunch";
}