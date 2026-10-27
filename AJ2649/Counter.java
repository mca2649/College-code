class Counter
{
	// instance variable
	static int count=0;
	Counter()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String args[])
	{
		System.out.println("Counter Task...");
		Counter c1 = new Counter(); 
		Counter c2 = new Counter();
		Counter c3 = new Counter();
	}
}