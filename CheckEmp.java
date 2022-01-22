public class CheckEmp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program ");
		int Is_Present=1;
		int Sal_Per_Hr=20;
		int Work_Hr;
		double emp = Math.floor(Math.random() * 10) %  2;
		if (emp == 	Is_Present) {
		System.out.println("Employee is present");
		Work_Hr=8;
		}
		else{
		System.out.println("Employee is absent");
		Work_Hr=0;
	}
		int Daily_Wage= (Sal_Per_Hr * Work_Hr);
		System.out.println("salary will be :" +Daily_Wage );
	}
	}
