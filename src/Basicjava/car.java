package Basicjava;


public class car {
	int price;
	String model;
	public car()
	{
		System.out.println("This is my first car");
	}
	public car(int p)
	{
		price=p;
	}
	public car(int p,String m)
	{
		price=p;
		model=m;
	}
	public void cardetail()
	{
		System.out.println(price+"--"+model);
	}

}