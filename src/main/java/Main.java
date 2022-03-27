public class Main {
	public static void main(String[] args) {
		AdminDepartment adminDepartment = new AdminDepartment();
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();

		adminDepartment.printDetails();
		System.out.println();
		hrDepartment.printDetails();
		System.out.println();
		techDepartment.printDetails();
	}
}
