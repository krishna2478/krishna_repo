package Basicjava;

public class Garage {

	public static void main(String[] args) {
		car c1=new car();
		c1.cardetail();
		car c2=new car(1111);
		c2.cardetail();
		car c3=new car(2222,"BMW");
		c3.cardetail();

	}

}
