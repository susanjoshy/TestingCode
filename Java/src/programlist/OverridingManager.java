package programlist;

public class OverridingManager extends OverloadingEmployee{
	
	  void setSalary(float salary){
		float tsalary,bonus=5000;
	tsalary=salary+bonus;
		System.out.println("salary of the manger is  "+tsalary);
		
		
	}
	
	public static void main(String[] args) {
		OverloadingEmployee  manager=new OverridingManager();
		
	
		manager.setSalary(salary);

	}

}
