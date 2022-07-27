
public class EmployeeWage {
	public void Presenty()
	{
		int IS_FULL_TIME=1;
		double empCheck=(Math.random()*10)%2;
		if(empCheck==IS_FULL_TIME)
			System.out.println("Employee is present..");
		else
			System.out.println("Employee is Absent");
	}
}
