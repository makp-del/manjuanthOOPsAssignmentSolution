public class SuperDepartment {
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
		return isTodayAHoliday;
	}

	private String departmentName = "Super Department";
	private String todaysWork = "No Work as of now";
	private String workDeadline = "Nil";
	private String isTodayAHoliday = "Today is not a holiday";
}