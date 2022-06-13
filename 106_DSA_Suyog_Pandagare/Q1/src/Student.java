
public class Student {

	//CLASS VARIABLES
	int roll_no;
	String name;
	char gender;

	//NON-PARAMETERISED CONSTRUCTOR
	public Student()
	{
		this.roll_no = 0;
		this.name = null;
		this.gender = 0;
	}

	//PARAMETERISED CONSTRUCTOR
	public Student(int rn, String nm, char gnd)
	{
		this.roll_no = rn;
		this.name = nm;
		this.gender = gnd;
	}

	public String toString() 
	{
		String str = this.roll_no + " : "  + this.name + " : " + this.gender;
		return str;
	}

}
