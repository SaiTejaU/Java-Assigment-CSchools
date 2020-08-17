import java.util.ArrayList;
public class Employee {
	int year,salary;
	String name,address;
	Employee(String name,int year,int sal,String add) {
		this.name=name;
		this.year=year;
		this.salary=sal;
		this.address=add;
	}
	void display()
	{
		System.out.println(this.name+"\t\t"+this.year+"\t\t"+this.address);
	}
	public static void main(String[] args) {

		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee("Robert",1994,25000,"64C- WallStreet"));
		l.add(new Employee("Sam",2000,35000,"68D- WallStreet"));
		l.add(new Employee("John",1999,45000,"26B- WallStreet"));
		System.out.println("Name\t    Year of Joining\t   Address");
		for(int i=0;i<3;i++)
		{
			l.get(i).display();
		}
	}
}
