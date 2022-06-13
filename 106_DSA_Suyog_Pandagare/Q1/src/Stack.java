
public class Stack {
	
	//CLASS VARIABLES
	Student arr[];
	int topIndex;

	//PARAMETERISED CONSTRUCTOR
	public Stack(int size)
	{
		arr=new Student[size];
		this.topIndex=-1;
	}

	//FUNCTION TO INSERT STUDENT TO STACK
	public void push(Student s1)
	{
		if(topIndex<arr.length)
		{
			topIndex++;
			arr[topIndex]=s1;
		}
		else
			System.out.println("stack is overflow");
	}

	//FUNCTION TO DELETE STUDENT FROM STACK
	public Student pop()
	{
		Student temp=null;
		if(topIndex!=-1)
		{
			temp=arr[topIndex];
			topIndex--;
		}
		else
			System.out.println("stack is underflow");

		return temp;
	}

	//FUNCTION TO PRINT STACK
	public void print()
	{
		if(topIndex==-1)
		{
			System.out.println("stack is empty");
		}
		else
		{
			for(int i=topIndex;i>=0;i--)
			{
				System.out.print(arr[i]+",");
			}
			System.out.println();
		}
	}

	//FUNCTION TO PRINT MALE STUDENTS
	public void printMaleStudents()
	{
		for(int i=0;i<=topIndex;i++)
		{
			if(arr[i].gender=='M')
			{
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
		}
	}

	//FUNCTION TO PRINT FEMALE STUDENTS
	public void printFemaleStudents()
	{
		for(int i=0;i<=topIndex;i++)
		{
			if(arr[i].gender=='F')
			{
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
		}
	}

	//WRAPPER FUNCTION TO EMPTY STACK RECURSIVELY
	public void EmptyStackRec()
	{
		EmptyByRecusrion(arr[topIndex]);
		System.out.println("stack is empty");
	}

	private void EmptyByRecusrion(Student s)
	{
		Student temp=null;
		if(topIndex!=0)
		{
			temp=arr[topIndex];
			EmptyByRecusrion(arr[--topIndex]);
		}
	}
	
	//FUNCTION TO PRINT STACK IN REVERSE
	public void printReverse()
	{
		if(topIndex==-1)
		{
			System.out.println("stack is empty");
		}
		else
		{
			for(int i=0;i<=topIndex;i++)
			{
				System.out.print(arr[i]+",");
			}
			System.out.println();
		}
	}


}