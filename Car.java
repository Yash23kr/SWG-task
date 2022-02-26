
public class Car 
{
		int speed;
		String colour;
		double regularPrice;
		Car(int sp, String col, double rp)
		{
			speed=sp;
			colour=col;
			regularPrice=rp;
		}
		double getSalePrice()
		{
			return regularPrice;
		}
	
}
class Truck_a extends Car {
	int weight;
	Truck_a(int sp, String col, double rp, int w)
	{
		super(sp, col, rp);
		weight=w;
	}
	double getSalePrice()
	{
		if(weight>2300)
		{
			super.regularPrice=0.9*super.regularPrice;
		}
		else
		{
			super.regularPrice=0.8*super.regularPrice;
		}
		return super.getSalePrice();
	}
}

