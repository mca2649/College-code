
class Student
{
	//Instance Variable
	int rno;
        String name;
	static String college = "MET";	
	
	//Constructor
 	Student(int rno,String name)
	{
		this.rno = rno;
		this.name = name;
	}
	
	//Method 1 Print
	public void print()
	{
		System.out.println("rno :" + rno);
		System.out.println("Sname :" + name);
		System.out.println("College:" + college);
	}
}
class StudentDemo
{
	public static void main(String args[])
	{
		Student s1 = new Student(101,"Satish");
		Student s2 = new Student(102,"Khushi");
		s1.print();
		s2.print();
		Student.college = "Thakur";
		s1.print();
		s2.print();
	}
} 
