
public class EmployeeWage {
	int MAX_HRS_IN_MONTH =100 ;
	int NUM_OF_WORKING_DAYS = 25;
	final int IS_PART_TIME = 1;
	final int IS_FULL_TIME=2;
	int EMP_RATE_PER_HOUR=20;
	public void Presenty()
	{
		
		double empCheck=(Math.random()*10)%3;
		if(empCheck==IS_FULL_TIME)
			System.out.println("Employee is present..");
		else
			System.out.println("Employee is Absent");
	}
	
	public int DailyEmployeeWage()
	{
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)
		{
			totalWorkingDays++;
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch(empCheck)
			{
				case IS_PART_TIME:
					empHrs=4;
					break;
				case IS_FULL_TIME:
					empHrs=8;
					break;
				default:
					empHrs=0;
			}
			totalEmpHrs+=empHrs;
		}
	      int totalempWage=totalEmpHrs*EMP_RATE_PER_HOUR;
	   
		 return totalempWage;
	
	}
}
