class Employee
{
	//Instance Variable
        String name;
 	static int id;
	float salary;
	float income;	
	
	//Constructor
 	Employee(String name,int id,float salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
		id++;
	}

	//Method 1 Logic
	void calcSalary()
	{
		income = this.salary*12;
	}

	//Method 2 Print
	public void print()
	{
		System.out.println("Ename :" + name);
		System.out.println("id :" + id);
		System.out.println("Salary :" + salary);
		System.out.println("Annual Salary :" + income);
	}
}
class EmployeeDemoo
{
	public static void main(String args[])
	{
		System.out.println("I am employee, calculate my annual salary");
		Employee e1 = new Employee("Satish",50000);
		Employee e2 = new Employee("Abhishek",40000);
	        e1.calcSalary();
		e1.print();
		e2.calcSalary();
		e2.print();
	}
} 
