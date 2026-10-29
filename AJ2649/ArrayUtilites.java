import java.util.*;
class ArrayUtilites
{
	Scanner sc = new Scanner(System.in);
	int array[];
	void setArray(int[] array)
	{
		this.array=array;
	}

	void useInput()
	{
		System.out.println("Enter the array elements");
                for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
	}

	void display()
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Array elements are :"+array[i]);
		}
	}
	int minimumValue()
	{
		int min = array[0];
		for(int i=0;i<array.length;i++)
		{
			if(min>array[i])
			{
				min = array[i];
			}
		}
		return min;
	}
	
	int maximumValue()
	{
		int max = array[0];
		for(int i=0;i<array.length;i++)
		{
			if(max<array[i])
			{
				max = array[i];
			}
		}
		return max;
	}
	
	
	public static void main(String args[])
	{
		int rawArray[] = new int[5];
		ArrayUtilites obj = new ArrayUtilites();
		obj.setArray(rawArray);
		obj.useInput();
		obj.display();
		System.out.println("minimum array is :" + obj.minimumValue());
		System.out.println("maxmum array is :" + obj.maximumValue());

	}
}